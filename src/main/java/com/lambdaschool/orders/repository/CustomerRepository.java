package com.lambdaschool.orders.repository;

import com.lambdaschool.orders.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @Query(value = "SELECT c.custname, o.ordernum, o.ordamount, o.orddescription FROM customer AS c INNER JOIN orders AS o WHERE c.custname = o.custcode ORDER BY c.custcode ASC", nativeQuery = true)
    List<Object[]> findCustomersWithOrders();


    @Query(value = "SELECT c.custname FROM customer AS c INNER JOIN orders as o WHERE c.custname = :name", nativeQuery = true)
    List<Object[]> findAllOrdersForCustomer(@Param("name") String name);
}
