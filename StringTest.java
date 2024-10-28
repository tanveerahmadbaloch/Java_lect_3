public class StringTest{
    public static void main(String[] args){
        int i = 10;
        int j = 20;
        System.out.println("Hello" +i);
        System.out.println(i+j);

        String s1 = "Pakistan";

        String s2 = "Pakistan";

        if (s1 == s2){
            System.out.println("comparing string using ==operator");

        }
        if (s1.equals(s2)){
            System.out.println("comparing string using equals method");
        }


    }
}