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
public class Client {
    private String name;
    private String adress;
    private int phone;
    private Campaign[] campaigns;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public Campaign[] getCampaigns() {
        return campaigns;
    }

    public void setCampaigns(Campaign[] campaigns) {
        this.campaigns = campaigns;
    }

    public Employee getContact() {
        return Contact;
    }

    public void setContact(Employee Contact) {
        this.Contact = Contact;
    }

    public Client(String name, String adress, int phone, Campaign[] campaigns, Employee Contact) {
        this.name = name;
        this.adress = adress;
        this.phone = phone;
        this.campaigns = campaigns;
        this.Contact = Contact;
    }
    private Employee Contact;
}
