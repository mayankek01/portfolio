import java.io.*;
import java.util.*;

class Complex {
  int real;
  int image;

  public Complex() {
    real = 0;
    image = 0;
  }

  void setvalue(int r, int i) {
    real = r;
    image = i;
  }

  public Complex(Complex c1) {
    real = c1.real - 2;
    image = c1.image + 5;
  }

  void squre(Complex c1) {
    int re = c1.real * c1.real - c1.image * c1.image;
    int im = 2 * c1.real * c1.image;
    System.out.println(re);
    System.out.println(im);

  }

  void display() {
    System.out.println(real);
    System.out.println(image);

  }
}

public class Solution {

  public static void main(String[] args) {
    Complex com1 = new Complex();
    com1.setvalue(10, 5);
    Complex com2 = new Complex(com1);
    com2.display();
    com2.squre(com2);
  }
}