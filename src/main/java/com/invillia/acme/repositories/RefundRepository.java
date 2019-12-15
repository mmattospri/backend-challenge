package com.invillia.acme.repositories;

import com.invillia.acme.domain.entity.Refund;

/**
 * Repository of Refunds.
 *
 * @author Renan Gigliotti
 * @since 1.0
 */
public interface RefundRepository {
    void create(Refund refund);
}
