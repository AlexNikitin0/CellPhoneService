package com.pluralsight;
import java.util.Scanner;
public class CellPhoneApplication {

    public static void main(String[] args) {
        //instantiate cellPhone class
        CellPhone phone = new CellPhone();
        //create second cellPhone
        CellPhone phone2 = new CellPhone(1222323,"android","Verizon","(980-425-0921","James");
        Scanner keyboard = new Scanner(System.in);
        //get user input
        System.out.print("What is the serial number? ");
        phone.setSerialNumber(keyboard.nextInt());
        keyboard.nextLine();
        System.out.print("What model is the phone? ");
        phone.setModel(keyboard.nextLine());
        System.out.print("Who is the carrier? ");
        phone.setCarrier(keyboard.nextLine());
        System.out.print("What is the phone number? ");
        phone.setPhoneNumber(keyboard.nextLine());
        System.out.print("Who is the owner of the phone? ");
        phone.setOwner(keyboard.nextLine());

        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());

    display(phone);
    display(phone2);

    phone.dial(phone2.getPhoneNumber());

    phone2.dial(phone.getPhoneNumber());
    }

    //
    public static void display(CellPhone phone) {

        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());

    }

}
