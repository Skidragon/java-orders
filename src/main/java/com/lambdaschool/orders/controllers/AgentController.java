package com.lambdaschool.orders.controllers;

import com.lambdaschool.orders.models.Agent;
import com.lambdaschool.orders.repository.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path={"/agents"}, produces = MediaType.APPLICATION_JSON_VALUE)
public class AgentController {
    @Autowired
    AgentRepository agentRepo;

    @GetMapping("")
    public List<Agent> allAgents() {
        return agentRepo.findAll();
    }

    @GetMapping("orders")
    public List<Object[]> agentOrders() {
        return agentRepo.agentOrders();
    }

}
