package com.lambdaschool.orders.repository;

import com.lambdaschool.orders.models.Agent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AgentRepository extends JpaRepository<Agent, Long> {

    @Query(value ="SELECT a.agentcode, a.agentname, o.ordernum, o.ordamount FROM agents AS a INNER JOIN orders AS o WHERE a.agentcode = o.agentcode", nativeQuery = true)
    List<Object[]> agentOrders();
}
