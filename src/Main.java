/**
 * Created by juliazhang on 11/6/16.
 */
public class Main {
    public static void main(String[] args){
        System.out.println("Hello");
        printToTwenty();

    }

    public static void printToTwenty() {
        for (int i = 0; i < 10; i ++) {
            System.out.println(i);
        }
    }
    public void printToTen(){
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
    }
    public void barks(){
        System.out.println("Bark Bark!");
    }
}
