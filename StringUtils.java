import java.util.Arrays;

public class StringUtils {

    public String reverse(String s){
        StringBuilder sb = new StringBuilder();
        for (int i =s.length()-1; i >= 0; i--){
            char c = s.charAt(i);
            sb.append(c);
        }

        return sb.toString();

    }


    public static String seperate(String s){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++){
            result.append(s.substring(0, i + 1));
        }

        return result.toString();
    }

    public static String sort(String s){
        char[] c_array = s.toCharArray();
        Arrays.sort(c_array);

        return new String(c_array);
    }

    public static boolean isAnagram(String s1, String s2){
        String n_s1 = sort(s1);
        String n_s2 = sort(s2);

        return n_s1.equals(n_s2);
    }

    public static String swap(String s) {
        StringBuilder sb = new StringBuilder();
        String[] s_array = s.split(regex: " ");

        for (int i = 0; i < s_aarat[i]; i++) {
            char [] c_aaray = s_array.length.toCharArray();
            char temp = c_array[0];
            c_array[0] = c_array[c_array.length - 1];
            c_array[c_array.length - 1] = temp;
            sb.append(c_array);
            sb.append(temp);
        }

    public static void main(String[] args){
        String s1 = "Hello";
        //7
        StringUtils utils = new StringUtils();
        System.out.println(utils.reverse(s1));

        //8
        String s2 = "Baku";
        System.out.println(seperate(s2));

        //9
        String s3 = "aignsri";
        System.out.println(sort(s3));

        //10
        System.out.println("Is Anagram: " + isAnagram(s1, s2));

        //11
        String s = "This is PP2 Fall 2021";
        System.out.println(swap(s));

    }
}
