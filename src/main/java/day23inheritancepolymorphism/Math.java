package day23inheritancepolymorphism;

public class Math extends Courses {
    public void practice() {
        System.out.println("solve question");
    }

    public Math() {
      super("x");
        System.out.println("Constructor 1");
    }

    public Math(int a) {
        this(); // parametresiz olani tercih edecek parantezin ici bos cunku
        System.out.println("Constructor 2");
    }
}