package com.training.tcmb.spring.customer.models;

import com.training.tcmb.spring.printer.EGender;
import com.training.tcmb.spring.validation.StartWith;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@NamedQueries({@NamedQuery(name = "Customer.findAllSearchName",
        query = "select c from Customer c where c.name=?1")})
@Table(name = "musteri")
public class Customer {
    @Id
    @GeneratedValue
    private Long customerId;
    @Column(name="isim",length = 20)
    private String name;
    @Size(min = 2,max = 25)
    private String surname;
    private String password;
    @Enumerated(EnumType.STRING)
    private EGender gender;
    private Integer height;
    private Integer weight;
    private LocalDate birthday;
    @Fetch(FetchMode.SELECT)
    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private Address address;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public Customer setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public Customer setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public EGender getGender() {
        return gender;
    }

    public Customer setGender(EGender gender) {
        this.gender = gender;
        return this;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public Customer setCustomerId(Long customerId) {
        this.customerId = customerId;
        return this;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + gender +
                '}';
    }
}
