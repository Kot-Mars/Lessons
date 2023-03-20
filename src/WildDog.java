public class WildDog extends Dog {


    public WildDog(int age, String name) {
        super(age, name);
    }

    @Override
    public String toString() {
        return "WildDog{" +
                "age "+ getAge() +
                "name "+ getName() +
                "}";
    }
}
