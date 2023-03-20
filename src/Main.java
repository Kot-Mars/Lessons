import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    final static Random rand = new Random();
    public  static void randomArray(int[] array) {
        long start = System.currentTimeMillis()/1000l;
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(1000);
        }
        long finish = System.currentTimeMillis() - start;
        System.out.println("Время выполнения: " + finish);
    }

    public  static void randomArrayList(ArrayList<Integer> arrayList, int cout) {
        long start = System.currentTimeMillis()/1000l;
        for (int i = 0; i < cout; i++) {
            int b = rand.nextInt(1000);
            arrayList.add(i, b);
        }
        long finish = System.currentTimeMillis() - start;
        System.out.println("Время выполнения: " + finish);
    }

    public  static void randomArrayList(LinkedList<Integer> linkedList, int cout) {
        long start = System.currentTimeMillis()/1000l;
        for (int i = 0; i < cout; i++) {
            int b = rand.nextInt(1000);
            linkedList.add(i, b);
        }
        long finish = System.currentTimeMillis() - start;
        System.out.println("Время выполнения: " + finish);
    }
    public static void main(String[] args) {
        int[] array100 = new int[100];
        int[] array500 = new int[500];
        int[] array10000 = new int[10000];

        randomArray(array100);
        randomArray(array500);
        randomArray(array10000);

        ArrayList<Integer> arrayList6k = new ArrayList<>();
        ArrayList<Integer> arrayList50k = new ArrayList<>();
        ArrayList<Integer> arrayList100k = new ArrayList<>();
        randomArrayList(arrayList6k, 6000);
        randomArrayList(arrayList50k, 50000);
        randomArrayList(arrayList100k, 100000);

        LinkedList<Integer> linkedList6k = new LinkedList<>();
        LinkedList<Integer> linkedList50k = new LinkedList<>();
        LinkedList<Integer> linkedList100k = new LinkedList<>();
        randomArrayList(linkedList6k, 6000);
        randomArrayList(linkedList50k, 50000);
        randomArrayList(linkedList100k, 100000);

        ArrayList<Integer> arrayListInt = new ArrayList<>();
        randomArrayList(arrayListInt, 10);
      //  getPrint(arrayListInt);
        ArrayList<Dog> arrayListDog = new ArrayList<>();
        Dog dog = new Dog(12, "Тузик");
        Dog dog1 = new Dog(3, "Шарик");
        HomeDog dog2 = new HomeDog(5,"Dog");
        HomeDog dog4 = new HomeDog(2,"Dog2");
        ArrayList<HomeDog> homeDogArrayList = new ArrayList<>();
        ArrayList<WildDog> wildDogArrayList = new ArrayList<>();
        WildDog dog3 = new WildDog(7, "Собака");
        arrayListDog.add(dog);
        arrayListDog.add(dog1);
        getPrint(arrayListDog);
        homeDogArrayList.add(dog2);
        homeDogArrayList.add(dog4);
        getPrint(homeDogArrayList);
        wildDogArrayList.add(dog3);
        getPrint(wildDogArrayList);



    }

    public static void getPrint(List<? extends Dog> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
    }
}
