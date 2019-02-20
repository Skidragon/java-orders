package com.lambdaschool.orders.repository;

import com.lambdaschool.orders.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @Query(value = "SELECT c.custname, o.ordernum, o.ordamount, o.orddescription FROM customer AS c INNER JOIN orders AS o WHERE c.custcode = o.custcode ORDER BY c.custcode ASC", nativeQuery = true)
    List<Object[]> findCustomersWithOrders();
}
