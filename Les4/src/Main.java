public class Main {
    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "cdeab";
        String str3 = "abdec";
        cheakStr(str1);
        cheakStr(str2);
        cheakStr(str3);
    }
    public static  void cheakStr(String str) {
        if (str == "abcde") {
            System.out.printf("Строка %s совпадает c \"abcde\" \n", str);
        } else {
            System.out.printf("Строка %s не совпадает c \"abcde\" \n", str);
        }
    }

}
