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
        if(a == b && b == c && a == c) {
            System.out.println("Треугольник равносторонний!");
            return 2;
        }

        double AB = a+b;
        double BC = b+c;
        double CA = c+a;
        if(AB>=c&&BC>=a&&CA>=b){
            if(a == b || c == b || a == c) {
                System.out.println("Треугольник равнобедренный!");
                return 3;
            }
            System.out.println("Треугольник обыкновенный!");
            return 1;
        }else{
            System.out.println("Треугольник не построен!");
            return 0;
        }



    }
}



