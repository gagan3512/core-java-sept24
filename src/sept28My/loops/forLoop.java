package sept28My.loops;

public class forLoop {
    public static void main(String[] args) {
        for(int i=1;i<100;i++){
            if(i%7==0){
                System.out.println("Gagan");
                continue;
            }
            System.out.println(i);
        }
    }

}
