public class GreenAppleSearchCriteria implements AppleSearchCriteria{
    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals("green");
    }
}
