public class HomeDog extends  Dog{


    public HomeDog(int age, String name) {
        super(age, name);
    }

    @Override
    public String toString() {
        return "HomeDog{" +
                "age "+ getAge() +
                "name "+ getName() +
                "}";
    }
}
