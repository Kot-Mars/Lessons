public class People {
    private int age;
    private String name, surName;

    public  People(){

    }
    public People(int age, String name, String surName) {
        this.age = age;
        this.name = name;
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    @Override
    public String toString() {
        return "People{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }
}
