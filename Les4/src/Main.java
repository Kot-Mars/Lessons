public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat cat2 = new Cat(10, "green", 3, 120, "Кузя");

        cat.setName("Боня");
        cat.setAge(12);
        for (int i = 0; i <= 50; i++) {
            cat.voice();
        }
        cat2.voice();
        System.out.println(cat);
        System.out.println(cat2);
        System.out.println(cat2.getColorEye());
    }
    }







//substring

//        String str1 = "abcde";
//        String str2 = "cdeab";
//        String str3 = "abdec";
//        cheakStr(str1);
//        cheakStr(str2);
//        cheakStr(str3);
 //   }
//    public static  void cheakStr(String str) {
//        if (str == "abcde") {
//            System.out.printf("Строка %s совпадает c \"abcde\" \n", str);
//        } else {
//            System.out.printf("Строка %s не совпадает c \"abcde\" \n", str);
//        }
//    }
//}
