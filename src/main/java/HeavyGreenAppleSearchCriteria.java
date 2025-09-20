public class HeavyGreenAppleSearchCriteria implements AppleSearchCriteria{
    @Override
    public boolean test(Apple apple) {
        return new GreenAppleSearchCriteria().test(apple) && new HeavyGreenAppleSearchCriteria().test(apple);
    }
}
