package com.beards.sorta.model;

import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by emilybutte on 11/28/16.
 */

@Entity
public class SaleTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Double total;
    private Date formattedDate;

    private Employee employee;

    //@OneToMany(targetEntity = LineItem.class, mappedBy = "sale_transaction", cascade = CascadeType.ALL)

    @Transient
    private SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");

    public SaleTransaction() {}

    public SaleTransaction (String date) throws ParseException {
        this.formattedDate = format.parse(date);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Date getFormatedDate() {
        return formattedDate;
    }

    public void setFormatedDate(Date formattedDate) {
        this.formattedDate = formattedDate;
    }
}
