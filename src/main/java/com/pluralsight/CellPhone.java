package com.pluralsight;

public class CellPhone {

    //class fields

    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    //no param constructor

    public CellPhone()
    {
        serialNumber = 0;
        model = "";
        carrier = "";
        phoneNumber = "";
        owner = "";
    }
    //arg const
    public CellPhone(int SerialNumber, String model, String carrier, String phoneNumber,String owner){
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
    }

    //getters

    public int getSerialNumber(){
        return serialNumber;
    }
    public String getModel(){
        return model;
    }
    public String getCarrier(){
        return carrier;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getOwner(){
        return owner;
    }

    //setters

    public void setSerialNumber(int serialNumber){
        this.serialNumber = serialNumber;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setCarrier(String carrier){
        this.carrier = carrier;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void setOwner(String owner){
        this.owner = owner;
    }

    //custom methods

    public void dial(String phoneNumber){
        System.out.println(this.owner + "'s" + " phone " + " is calling " + phoneNumber);

    }



}
