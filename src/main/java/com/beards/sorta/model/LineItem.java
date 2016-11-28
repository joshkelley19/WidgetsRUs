package com.beards.sorta.model;

import javax.persistence.*;

/**
 * Created by emilybutte on 11/28/16.
 */

@Entity
public class LineItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int quantity;
    private double subtotal;

    @ManyToOne(targetEntity = SaleTransaction.class)
    @JoinColumn(name = "transaction_id")
    private SaleTransaction transaction;

    private Widget widget;

    public LineItem()  {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
}
