package com.training.tcmb.spring.customer.data.db;

import com.training.tcmb.spring.customer.models.Customer;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.Future;
import java.util.stream.Stream;

public interface ICustomerDao extends CrudRepository<Customer,Long> {

    List<Customer> findByName(String name);

    List<Customer> findByNameAndSurname(String name,String surname);

    List<Customer> findByNameIn(List<String> name);

    List<Customer> findByNameOrSurnameOrderByName(String name,String surname);

    Stream<Customer> findByBirthdayAfter(LocalDate date);

    Future<Stream<Customer>> findByBirthdayBefore(LocalDate date);

    Stream<Customer> findByWeightBetween(Integer start,Integer end);

    Stream<Customer> findByNameLike(String name);

    @Modifying
    List<Customer> deleteByName(String name);

    @Query("select c from Customer c where c.name=?1")
    List<Customer> searchName(String name);

    List<Customer> findAllSearchName(String name);

    @Query(value = "select * from musteri c where c.isim=?1",nativeQuery = true)
    List<Customer> searchNameNative(String name);

}
