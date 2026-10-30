package com.banking.accountservice.Service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Objects;

@Service
@Slf4j
@AllArgsConstructor
//@NoArgsConstructor
public class AccountEventConsumer {

    private final com.banking.accountservice.Service.AccountService accountService;
    /**
     * Consume transaction. Complete event from kafka
     * Credits receiver Account
     * @param payload
     */
    public void consumeTransactionCompleted(
            @Payload Map<String, Object> payload) {

        try{
            String receiverAccount = (String) payload.get("receiverAccountNumber");
            BigDecimal amount = new BigDecimal(payload.get("amount").toString());

            log.info("Crediting account: {}", receiverAccount, amount);
            accountService.creditBalance(receiverAccount, amount);
        }
        catch (Exception e) {
            log.error("Error crediting account: {}", e.getMessage());
        }
    }

    /**
     * Consume fraud detected event from kafka
     * Blocks the flagged account.
     * @param payload
     */
    @KafkaListener(topics = "fraud.detected")
    public void consumeFraudDetected (@Payload Map<String, Object> payload) {

        try{
            String accountNumber = (String) payload.get("accountNumber");
            log.info("Fraud detected - blocking account: {}", accountNumber);

            accountService.blockAccount(accountNumber);
        }
        catch (Exception e) {
            log.error("Error blocking account: {}", e.getMessage());
        }
    }
}
