package lesson4.hw3;

import java.util.Objects;

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

  public void changeType(String newType) {
    numType = newType;
  }

  public long getNum() {
    return num;
  }

  public void setNum(long num) {
    this.num = num;
  }

  @Override
  public String toString() {
    return "Телефонный " + numType + " номер: " + num;
  }

  @Override
  public int hashCode() {
    return Objects.hash(num, numType);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PhoneNumber number = (PhoneNumber) o;
    return num == number.num && Objects.equals(numType, number.numType);
  }
}

