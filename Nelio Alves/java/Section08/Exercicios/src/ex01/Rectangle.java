package ex01;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.Math.*;

public class Rectangle {

    public double width;
    public double height;

    public double area(){
        return width * height;
    }

    public double perimeter(){
        return 2 * (height + width);
    }

    public double diagonal(){
        return sqrt((width * width) + (height * height));
    }
}
