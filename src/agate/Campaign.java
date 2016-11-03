/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agate;

/**
 *
 * @author CamiloErnesto
 */
public class Campaign {
    private Client Client;
    private Date ExpectedStart;
    private Date ExpectedEnd;
    private double EstimateCost;
    private double AssignedMoney;
    private double ActualCost;
    private Date ActualStart;
    private Date ActualEnd;
    private Employee[] Employees;
    private Date PaymentDate;
    private Employee Director;

    public Campaign(Client Client, Employee[] Employees, Employee Director) {
        this.Client = Client;
        this.Employees = Employees;
        this.Director = Director;
    }

    public Client getClient() {
        return Client;
    }

    public void setClient(Client Client) {
        this.Client = Client;
    }

    public Date getExpectedStart() {
        return ExpectedStart;
    }

    public void setExpectedStart(Date ExpectedStart) {
        this.ExpectedStart = ExpectedStart;
    }

    public Date getExpectedEnd() {
        return ExpectedEnd;
    }

    public void setExpectedEnd(Date ExpectedEnd) {
        this.ExpectedEnd = ExpectedEnd;
    }

    public double getEstimateCost() {
        return EstimateCost;
    }

    public void setEstimateCost(double EstimateCost) {
        this.EstimateCost = EstimateCost;
    }

    public double getAssignedMoney() {
        return AssignedMoney;
    }

    public void setAssignedMoney(double AssignedMoney) {
        this.AssignedMoney = AssignedMoney;
    }

    public double getActualCost() {
        return ActualCost;
    }

    public void setActualCost(double ActualCost) {
        this.ActualCost = ActualCost;
    }

    public Date getActualStart() {
        return ActualStart;
    }

    public void setActualStart(Date ActualStart) {
        this.ActualStart = ActualStart;
    }

    public Date getActualEnd() {
        return ActualEnd;
    }

    public void setActualEnd(Date ActualEnd) {
        this.ActualEnd = ActualEnd;
    }

    public Employee[] getEmployees() {
        return Employees;
    }

    public void setEmployees(Employee[] Employees) {
        this.Employees = Employees;
    }

    public Date getPaymentDate() {
        return PaymentDate;
    }

    public void setPaymentDate(Date PaymentDate) {
        this.PaymentDate = PaymentDate;
    }

    public Employee getDirector() {
        return Director;
    }

    public void setDirector(Employee Director) {
        this.Director = Director;
    }
    
    
}
