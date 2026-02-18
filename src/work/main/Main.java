package work.main;

import java.util.Random;
public class Main {

    static int avalable;
    public static void main(String[] args) {
        System.out.println("Do you have this book?");
        checkBook();

    }
    public static int checkBook(){
        Random r = new Random();
        avalable = r.nextInt(5);
        if (avalable >= 1){
            System.out.println("Book avalable in cuontity: "+ avalable);
        }
        else {
            System.out.println("book not avalable");
        } return avalable;
    }

}
