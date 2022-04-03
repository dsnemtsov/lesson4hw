package lesson4.hw2;

public class HW2 {
  public static void main(String[] args) {
    Tree tree = new Tree(0.5, 3.7);
    Bush bush = new Bush(1.2, 4.5);

    System.out.println("Tree: width - " + tree.getWidth() + ", height: " + tree.getHeight());
    System.out.println("Bush: width - " + bush.getWidth() + ", height: " + bush.getHeight());

    tree.grow();
    bush.grow();

    System.out.println("Tree: width - " + tree.getWidth() + ", height: " + tree.getHeight());
    System.out.println("Bush: width - " + bush.getWidth() + ", height: " + bush.getHeight());

    Plant[] plants = new Plant[]{tree, bush};

    for (Plant plant : plants) {
      plant.grow();
    }

    System.out.println("Tree: width - " + tree.getWidth() + ", height: " + tree.getHeight());
    System.out.println("Bush: width - " + bush.getWidth() + ", height: " + bush.getHeight());
  }
}
