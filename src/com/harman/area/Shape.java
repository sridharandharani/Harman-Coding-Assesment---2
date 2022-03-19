package com.harman.area;

import java.util.Scanner;

public abstract class Shape {
    void parameters(){}
}
class Rectanglearea extends Shape{
    void parameters(){
        Scanner in = new Scanner(System.in);
        int length, breadth;
        System.out.println("Enter the length and breadth of rectangle :");
        length = in.nextInt();
        breadth = in.nextInt();
        int result = length * breadth;
        System.out.println(result);

    }
}
class Squarearea extends Shape{
    void parameters(){
        Scanner in = new Scanner(System.in);
        int side;
        System.out.println("Enter the side of square :");
        side = in.nextInt();
        int result = side * side ;
        System.out.println(result);

    }
}
class Circlearea extends Shape{
    void parameters(){
        Scanner in = new Scanner(System.in);
        int radius;
        System.out.println("Enter the radius of the circle :");
        radius = in.nextInt();
        double result = Math.PI*radius*radius;
        System.out.println(result);
    }
}
class Area extends Shape{
    public static void main(String[] args) {
        Shape recobj = new Rectanglearea();
        Shape sqobj = new Squarearea();
        Shape cirobj = new Circlearea();
        recobj.parameters();
        sqobj.parameters();
        cirobj.parameters();
    }

}
