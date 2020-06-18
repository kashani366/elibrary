package model;

import java.util.Scanner;

public class Admin {
    Scanner sc=new Scanner(System.in);

    private String emailAdmin="kashani_sara@yahoo.com";
    private String passwordAdmin="123";
    public Admin() {

    }
public  void checkAdmin(String input){
    System.out.println("enter email");
    String input1=sc.nextLine();
    if(input1=="kashani_sara@yahoo.com")
        System.out.println("enter password");
String input2=sc.nextLine();
if(input2=="123"){
    showmenue();
}//else
//break;
}

    private void showmenue() {
        System.out.println("1.Add librarian");
        System.out.println("2.view librarian");
        System.out.println("3.edit");
        System.out.println("delet");
        System.out.println("logout");
    }
}

