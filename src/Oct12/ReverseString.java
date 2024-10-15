package Oct12;

public class ReverseString {
    public static void main(String[] args) {
        String companyName = "Pragra cmp";

        System.out.println(reverseTheString(companyName));
    }

    public static String reverseTheString(String companyName){
        char ch[] = companyName.toCharArray();
        int start = 0;
        int end = ch.length-1;

        while(start<end){
            char temp = ch[end];
            ch[end] = ch[start];
            ch[start] = temp;
            start++;
            end--;
        }

        String reverseString = new String(ch);
        return reverseString;

    }
}
