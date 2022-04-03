package lesson4.hw3;

public class HW3 {
  public static void main(String[] args) {
    PhoneNumber number = new PhoneNumber(8_921_403_02_14L, "рабочий");
    System.out.println(number);
    System.out.println(number.hashCode());

    PhoneNumber sameNumber = new PhoneNumber(8_921_403_02_14L, "рабочий");

    System.out.println(number.equals(sameNumber));
  }
}
