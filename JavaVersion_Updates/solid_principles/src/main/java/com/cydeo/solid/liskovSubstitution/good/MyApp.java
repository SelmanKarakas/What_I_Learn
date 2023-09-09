package com.cydeo.solid.liskovSubstitution.good;

import com.cydeo.solid.liskovSubstitution.good.Rectangle;
import com.cydeo.solid.liskovSubstitution.good.Square;

import java.util.Arrays;
import java.util.List;

public class MyApp {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(3);
        rectangle.setWidth(5);

        Square square = new Square();
        square.setSide(4);

        // List<Shape> rectangles = Arrays.asList(rectangle, square);

        // changeHeightAndWidth(rectangle);

    }

    public static void changeHeightAndWidth(List<Rectangle> rectangles) {

        for (Rectangle rectangle : rectangles) {
            rectangle.setHeight(5);   // Rectangle H -> 5  - Square H, W -> 5
            rectangle.setWidth(6);    // Rectangle W -> 6  - Square W, H -> 6
            System.out.println(rectangle.getArea() == 30);   // Rectangle Area -> 30
        }                                                    // Square Area -> 36

    }

}
