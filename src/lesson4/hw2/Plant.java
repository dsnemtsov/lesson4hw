package lesson4.hw2;

public class Plant {

  protected double height;
  protected double width;

  public Plant() {
  }

  public Plant(double height, double width) {
    this.height = height;
    this.width = width;
  }

  public void grow() {
    System.out.println("Я расту");
  }

  public double getHeight() {
    return height;
  }

  public double getWidth() {
    return width;
  }
}
