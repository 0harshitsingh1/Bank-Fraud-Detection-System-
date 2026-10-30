package com.banking.transactionservice.entity;

/**
 * Transaction LifeCycle flow:
 * PENDING -> PROCESSING -> COMPLETED (clean transaction)
 *                       -> pending_verification(Suspicious detected)
 *                          -> COMPLETE (VERIFIED)
 *                          -> FLAGGED (Saga refund)
 *                       -> FAILED
 *                       -> FLAGGED
 */
public enum TransactionStatus {

    PENDING,
    PROCESSING,
    PENDING_VERIFICATION,
    COMPLETED,
    FAILED,
    FLAGGED
}
