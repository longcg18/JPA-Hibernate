package org.longcg.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {

    @Column(name = "STREET")
    private String street;

    @Column(name = "NUMBER")
    private String number;

    @Column(name = "CITY")
    private String city;

    public Address(String str, String num, String c) {
        this.street = str;
        this.number = num;
        this.city = c;
    }

    public String getCity() {
        return city;
    }

    public String getNumber() {
        return number;
    }

    public String getStreet() {
        return street;
    }

}
