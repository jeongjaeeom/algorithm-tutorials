package steps.step01;

import java.util.Scanner;

public class Q1001 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a, b;
    a = scanner.nextInt();
    b = scanner.nextInt();
    scanner.close();
    System.out.println(a - b);
  }
}
