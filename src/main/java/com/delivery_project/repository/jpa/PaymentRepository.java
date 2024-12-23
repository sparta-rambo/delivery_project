package com.delivery_project.repository.jpa;

import com.delivery_project.entity.Payment;
import com.delivery_project.repository.implement.PaymentRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, UUID>, PaymentRepositoryCustom {
}
