package com.training.tcmb.spring.printer;

import com.training.tcmb.spring.validation.StartWith;

import javax.validation.constraints.*;
import java.time.LocalDate;

public class Customer {
    private Long customerId;
    @NotEmpty
    @Size(min = 2, max = 15, message = "name {min} ile {max} arasında olmalı")
    @StartWith(value = "n:")
    private String name;
    @NotEmpty
    @Size(min = 3, max = 18, message = "surname {min} ile {max} arasında olmalı")
    @StartWith("s:")
    private String surname;
    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$", message = "password de min bir sayı ve min bir büyük harf olmalı")
    private String password;
    @NotNull
    private EGender gender;
    @Max(300)
    @Min(50)
    private Integer height;
    @NotNull
    @Positive
    @Max(300)
    @Min(10)
    private Integer weight;
    @Past
    private LocalDate birthday;

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

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + gender +
                '}';
    }
}
