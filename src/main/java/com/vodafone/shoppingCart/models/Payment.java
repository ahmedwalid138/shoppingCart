package com.vodafone.shoppingCart.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int payment_id;
    private double payment_amount;
    private String payment_transaction_id;
    private Date payment_date;
    private String payment_status;
    private int payment_customer_id;
    private int payment_order_id;
}
