package com.entity;

import lombok.*;

import java.io.Serializable;

/**
 * The below class can be referred to as an Entity class, Persistence class,
 * domain class or model class
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Product implements Serializable {

    private int pid;

    private String pname;

    private float price;

    private float qty;
}
