package lesson4.hw1;

public class HW1 {
  public static void main(String[] args) {

    PhoneNumber numberOne = new PhoneNumber();

    numberOne.changeType("рабочий");
    numberOne.setNum(8_921_403_02_14L);

    numberOne.print();

    PhoneNumber numberTwo = new PhoneNumber(8_921_403_02_13L, "домашний");

    numberTwo.print();

    System.out.println(numberTwo.getNum());

    numberTwo.changeType("секретный");

    numberTwo.print();

  }
}
