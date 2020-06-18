package model;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
  public static   Admin admin=new Admin();

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<librarian> librarians=new ArrayList<librarian>();
        System.out.println("--welcom to elibrary --(type/help to start");
        System.out.println("are you admin?");
        //aplication loop
        while (true){
            //get input
            String input=sc.nextLine();
            //process
            //show result(feeadback)

        }
        //application quit
      //  System.out.println("the end");
    }
    public static  void  routInput(String input){
        if(input=="y"){
admin.checkAdmin(input);
        }
    }
}
