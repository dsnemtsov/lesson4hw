package lesson4.hw2;

public class Tree extends Plant{

  public Tree() {
  }

  public Tree(double height, double width) {
    super(height, width);
  }

  @Override
  public void grow() {
    height++;
  }
}
