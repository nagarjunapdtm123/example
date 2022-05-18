package javaloop;

import java.util.ArrayList;
import java.util.List;

public abstract class Shape {
        abstract void area();
}
 class Rectangle extends Shape {

 private int length;
private int breadth;
Rectangle(int  l,int b) {
    length=l;
    breadth=b;

}
     @Override
     public void area() {

         System.out.println("area of rectangle is : " +length*breadth);
     }

     public int getLength() {
         return length;
     }

     public void setLength(int length) {
         this.length = length;
     }

     public int getBreadth() {
         return breadth;
     }

     public void setBreadth(int breadth) {
         this.breadth = breadth;
     }
 }
 class Square extends Shape {
private int side;
Square(int s) {
    side=s;
}
     @Override
     public void area() {
         System.out.println("area of the square : " +side*side);
     }

     public int getSide() {
         return side;
     }

     public void setSide(int side) {
         this.side = side;
     }
 }

 class Circle extends Shape {
    private double radius;
    Circle(double r) {
        radius=r;

    }

     @Override
     public void area() {
         System.out.println("area of circle is : " +3.67*radius*radius);

     }

     public double getRadius() {
         return radius;
     }

     public void setRadius(double radius) {
         this.radius = radius;
     }
 }

 class Hello {
     public static void main(String[] args) {
         Rectangle re=new Rectangle(5,6);
         Square sq=new Square(8);
         Shape sh=new Rectangle(9,5);
//         Rectangle re1=new Shape(9,7);
         Circle c=new Circle(7);
         re.area();
         sh.area();
         sq.area();
         c.area();
         Rectangle re1=new Rectangle(4,7);
         re1.area();
         re1.setBreadth(5);
         re1.setLength(3);
         List<Shape> ls=new ArrayList<>();
         ls.add(re1);
         re1.area();
         ls.add(sq);
         sq.setSide(5);
         sq.area();
         ls.add(c);
         c.area();
         c.setRadius(7.65);


     }
 }

