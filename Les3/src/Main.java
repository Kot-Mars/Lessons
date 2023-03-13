import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        People people = new People(19, "Антон", "Иванов");
        People people1 = new People(16, "Иван", "Иванов");
        People people2 = new People();
        people2.setAge(21);
        People[] arrayPeople = {people, people1, people2};

        for (int i = 0; i < arrayPeople.length; i++) {
            if (arrayPeople[i].getAge() > 18) {
                System.out.println(arrayPeople[i]);
            }
        }
    }
}
