package com.beards.sorta.model;

/**
 * Created by joshuakelley on 11/28/16.
 */
public class LineItem {
    long id;
    Widget widget;
    int quantity;
    double subtotal;
    SalesTransaction salesTransaction;

    public LineItem() {
    }

    public LineItem(Widget widget, int quantity, double subtotal, SalesTransaction salesTransaction) {
        this.widget = widget;
        this.quantity = quantity;
        this.subtotal = subtotal;
        this.salesTransaction = salesTransaction;
    }

    public Widget getWidget() {
        return widget;
    }

    public void setWidget(Widget widget) {
        this.widget = widget;
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

    public SalesTransaction getSalesTransaction() {
        return salesTransaction;
    }

    public void setSalesTransaction(SalesTransaction salesTransaction) {
        this.salesTransaction = salesTransaction;
    }
}
