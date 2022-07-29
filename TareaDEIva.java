package com.Miscodigos;

public class TareaDEIva {
    public static void main(String[] args) {
        double a = 10;
        double b = 20;

        double suma = a + b ;
    double iva = suma*0.19d;
        System.out.println(iva);


    }

     static  double getPrecioIva(double a, double b, double iva ){
        return  a + b +  iva;



    }


    }

