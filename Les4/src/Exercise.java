public class Exercise {
    public static void main(String[] args) {
        String[] str = {"abcde","cdeab", "abdec"};
        String check = "abcde";

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < check.length();) {
                if(str[i].substring(j).equals(check.substring(j))) {
                    j++;
                    if(j == check.length())
                    {
                        System.out.println("Строка: " + str[i] + " совпадает со строкой: " + check);
                        j = 0;
                        break;
                    }
                } else {
                    System.out.println("Строка " + str[i] + " не совпадает со строкой: " + check);
                    break;
                }
            }
        }
    }
}
