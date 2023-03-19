package com.tyba.models.AddProducts;

public class AddProductsDataToPage {

    static String UseName;
    static String Password;
    static String ProductoA;
    static String CantidadA;
    static String ColorA ;
    static String ProductoB;
    static String CantidadB;
    static String ColorB;
    static String ProductoC;
    static String CantidadC;
    static String ColorC;

    public static void data (AddProductsDataInjections dataInjections){
        UseName= dataInjections.getUserName();
        Password= dataInjections.getPassword();
        ProductoA= dataInjections.getProductoA();
        CantidadA= dataInjections.getCantidadA();
        ColorA= dataInjections.getColorA();
        ProductoB= dataInjections.getProductoB();
        CantidadB= dataInjections.getCantidadB();
        ColorB= dataInjections.getColorB();
        ProductoC = dataInjections.getProductoC();
        CantidadC= dataInjections.getCantidadC();
        ColorC= dataInjections.getColorC();
    }
    public static String UseName(){return UseName;}
    public static String Password(){return Password;}
    public static String ProductoA(){return ProductoA;}
    public static String CantidadA(){return CantidadA;}
    public static String ColorA(){return ColorA;}
    public static String ProductoB(){return ProductoB;}
    public static String CantidadB(){return CantidadB;}
    public static String ColorB(){return ColorB;}
    public static String ProductoC(){return ProductoC;}
    public static String CantidadC(){return CantidadC;}
    public static String ColorC(){return ColorC;}

}
