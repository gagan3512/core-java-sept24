package Oct12;

import java.util.Locale;

import static jdk.nashorn.internal.objects.NativeArray.lastIndexOf;

public class StringFunctions {
    public static void main(String[] args) {
        String name= "Gagan";

        System.out.println(name.length());
        System.out.println(name.toString());
        System.out.println(name.getBytes());
        System.out.println(name.toLowerCase(Locale.ROOT));
        System.out.println(name.charAt(3));
        System.out.println(name.lastIndexOf(name));// question
    }
}
