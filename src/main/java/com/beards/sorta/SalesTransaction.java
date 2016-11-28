package com.beards.sorta;

import javax.persistence.Id;
import java.util.Date;

/**
 * Created by joshuakelley on 11/28/16.
 */
public class SalesTransaction {
    @Id
    long id;
    Employee employee;
    double total;
    Date date;

    public SalesTransaction() {
    }

    public SalesTransaction(Employee employee, double total, Date date) {
        this.employee = employee;
        this.total = total;
        this.date = date;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
