import java.io.*;
import java.util.*;
import java.util.Scanner;

class compNumber {
  private int real, image;

  compNumber() {
    real = 0;
    image = 0;
  }

  public void setdata(int a, int b) {
    real = a;
    image = b;
  }

  compNumber(compNumber c) {
    real = c.real - 2;
    image = c.image + 5;
  }

  public void Sq() {
    int t1, t2;
    t1 = (real * real) - (image * image);
    t2 = 2 * (image * real);
    real = t1;
    image = t2;
  }

  public void displaydata() {
    System.out.println(real);
    System.out.println(image);
  }
}

public class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    compNumber cpx1 = new compNumber();
    cpx1.setdata(a, b);
    compNumber cpx2 = new compNumber(cpx1);
    cpx2.displaydata();
    cpx2.Sq();
    cpx2.displaydata();
  }
}