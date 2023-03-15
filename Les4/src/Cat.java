public class Cat extends Animal {
    private  int age;
    private String colorEye;
    private int weight, height;
    private  String name;
    private int meow = 0;
    private String status = "Live";

    public  Cat() {

    }

    public Cat(int age, String colorEye, int weight, int height, String name) {
        this.age = age;
        this.colorEye = colorEye;
        this.weight = weight;
        this.height = height;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColorEye() {
        if(colorEye == "зеленный" || colorEye == "green") {
            return "Кошка красивая";
        } else return colorEye;
    }

    public void setColorEye(String colorEye) {
            this.colorEye = colorEye;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", colorEye='" + colorEye + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", name='" + name + '\'' +
                ", meow=" + meow +
                ", status='" + status + '\'' +
                '}';
    }

    @Override
    public void voice() {
       if(meow < 50) {
           System.out.println("Мяу");
           this.meow++;
       } else {
           System.out.println("Кошка " + getName() + " умерла");
           System.out.println("Причина смерти: Хозяин прибил кошку");
           this.status = "dead";
       }
    }
}
