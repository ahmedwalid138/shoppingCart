package com.vodafone.shoppingCart.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class EmailSubscriber {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int subscriber_id;
    private String subscriber_first_name;
    private String subscriber_last_name;
    private String subscriber_email;
}
