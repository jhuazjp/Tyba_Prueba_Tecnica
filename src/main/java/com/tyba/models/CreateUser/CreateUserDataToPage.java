package com.tyba.models.CreateUser;

public class CreateUserDataToPage {

    static String Username;
    static String Password;
    static String Email;
    static String FirtsName;
    static String LastName;
    static  String PhoneNumber;
    static String Country;
    static String City;
    static String Address;
    static String State;
    static String PostalCode;

    public static void data (CreateUserInjections dataInjection){

        Username=dataInjection.getUsername();
        Password=dataInjection.getPassword();
        Email=dataInjection.getEmail();
        FirtsName=dataInjection.getFirtsName();
        LastName=dataInjection.getLastName();
        PhoneNumber= dataInjection.getPhoneNumber();
        Country=dataInjection.getCountry();
        City=dataInjection.getCity();
        Address=dataInjection.getAddress();
        State=dataInjection.getState();
        PostalCode=dataInjection.getPostalCode();

    }

    public static String Username(){return Username;}
    public static String Password(){return Password;}
    public static String Email(){return Email;}
    public static String FirtsName(){return FirtsName;}
    public static String PhoneNumber(){return PhoneNumber;}
    public static String LastName(){return LastName;}
    public static String Country(){return Country;}
    public static String City(){return City;}
    public static String Address(){return Address;}
    public static String State(){return State;}
    public static String PostalCode(){return PostalCode;}


}
