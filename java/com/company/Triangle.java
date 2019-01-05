package com.company;

public class Triangle {

    public static void main(String[] args) {
        double a = 6.5;
        double b = 2.0;
        double c = 2.0;
        int result = buildTriangle(c, a, b);
    }

    public static int buildTriangle(double a, double b, double c){
        if(b <= 0 || a <= 0 || c <= 0) {
            return 0;
        }
        if(a == b && b == c && a == c){
            return 2;
        }
        double AB = a+b;
        double BC = b+c;
        double CA = c+a;
        if(AB>=c&&BC>=a&&CA>=b){
            //System.out.println("Треугольник построен!");
            return 1;
        }else{
            //System.out.println("Треугольник не построен!");
            return 0;
        }



    }
}



