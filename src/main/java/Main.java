import java.util.List;

public class Main {
    public static void main(String[] args) {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
//        List<Apple> green = appleWarehouse.findApplesByColor("blue");
//        for (Apple apple : green) {
//            System.out.println(apple.getColor());
//            System.out.println(apple.getWeight());
//        }
        List<Apple> heavy = appleWarehouse.findApplesByWeight("heavy");
        for (Apple apple : heavy) {
            System.out.println(apple.getWeight());
        }
    }
}
