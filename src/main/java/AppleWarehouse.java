import java.util.ArrayList;
import java.util.List;

public class AppleWarehouse {
    private List<Apple> apples = getAllApples();

    public List<Apple> findApplesByColor(String color){
        if (!color.equals("green") && !color.equals("red") && !color.equals("yellow")){
            throw new IllegalArgumentException("Неверый цвет");
        }
        return apples.stream().filter(apple -> apple.getColor().equals(color)).toList();
    }

    public List<Apple> findApplesByWeight(String weight){
        if (!weight.equals("light") && !weight.equals("heavy")){
            throw new IllegalArgumentException("Неверный цвет");
        }
        List<Apple> applesByWeighht = new ArrayList<>();
        if (weight.equals("light")){
            applesByWeighht = apples.stream().filter(apple -> apple.getWeight() <= 150).toList();
        } else if (weight.equals("heavy")) {
            applesByWeighht = apples.stream().filter(apple -> apple.getWeight() > 150).toList();
        }
        return applesByWeighht;
    }

    private List<Apple> getAllApples(){
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        apples.add(new Apple("yellow", 50));
        apples.add(new Apple("yellow", 170));
        return apples;
    }
}
