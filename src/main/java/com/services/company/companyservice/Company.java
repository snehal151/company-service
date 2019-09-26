package com.services.company.companyservice;

public class Company {
    String name;
    String phone;
    String address;

           //setter
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }
    public void setPhone(String phone)
    {
        this.phone = phone;
    }
            //getter
    public String getName()
    {
        return name;
    }
    public String getAddress()
    {
        return address;
    }
    public String getPhone()
    {
        return phone;
    }
}
