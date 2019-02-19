package com.lambdaschool.orders.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="agent")
public class Agent {

    @Id
    @Column(nullable = false)
    private long agentcode;

    private String agentname;

    private String workingarea;

    private double commission;

    private String phone;

    private String country;

    @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "agent")
    private Set<Customer> customers;

    public Agent() {
    }

    public long getAgentcode() {
        return agentcode;
    }

    public String getAgentname() {
        return agentname;
    }

    public void setAgentname(String agentname) {
        this.agentname = agentname;
    }

    public String getWorkingarea() {
        return workingarea;
    }

    public void setWorkingarea(String workingarea) {
        this.workingarea = workingarea;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
