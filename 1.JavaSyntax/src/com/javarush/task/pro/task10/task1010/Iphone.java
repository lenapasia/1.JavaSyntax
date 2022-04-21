package com.javarush.task.pro.task10.task1010;

import java.util.Objects;

/* 
Два айфона
*/

public class Iphone {
    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Iphone iphone = (Iphone) o;
//        1._____________________________________
//        boolean resultObj1 = false;
//        if (model == null) { resultObj1 = iphone.model == null;}
//        else { resultObj1 = this.model.equals(iphone.model);}

//        boolean resultObj2 = false;
//        if (this.color == null) { resultObj1 = iphone.color == null;}
//        else { resultObj1 = this.color.equals(iphone.color);}

//        if (this.price == iphone.price && resultObj1 && resultObj2) {
//            return true;
//        }else {return false;}
//        2.______________________________
//        return (price == iphone.price) &&
//                ((model == null && iphone.model == null) || (model != null && model.equals(iphone.model)))
//                && ((color == null && iphone.color == null) || (color != null && color.equals(iphone.color)));

        return (price == iphone.price) && Objects.equals(this.model,iphone.model) && Objects.equals(this.color,iphone.color);
    }


    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("X", "Black", 999);
        Iphone iphone2 = new Iphone("X", "Black", 999);

        System.out.println(iphone1.equals(iphone2));
    }

}
