package com.beards.sorta;

import javax.persistence.Id;

/**
 * Created by joshuakelley on 11/28/16.
 */
public class Widget {
    @Id
    long id;
    double cost;
    String description;

    Widget(){

    }

    Widget(double cost, String description){
        this.cost = cost;this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
