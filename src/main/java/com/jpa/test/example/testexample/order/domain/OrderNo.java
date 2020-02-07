package com.jpa.test.example.testexample.order.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class OrderNo implements Serializable {
    @Column(name="order_number")
    private String number;

    private OrderNo(){
    }

    public OrderNo(String number){ this.number = number;}

    public String getNumber(){
        return this.number;
    }
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        OrderNo orderNo = (OrderNo)o;
        return Objects.equals(number, orderNo.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
