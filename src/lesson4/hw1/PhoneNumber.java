package lesson4.hw1;

public class PhoneNumber {

  private long num;
  private String numType;

  public PhoneNumber() {
    numType = "";
  }

  public PhoneNumber(long num, String numType) {
    this.num = num;
    this.numType = numType;
  }

  public void print() {
    System.out.printf("Телефонный %s номер: %d \n", numType, num);
  }

  public void changeType(String newType) {
    numType = newType;
  }

  public long getNum() {
    return num;
  }

  public void setNum(long num) {
    this.num = num;
  }
}
