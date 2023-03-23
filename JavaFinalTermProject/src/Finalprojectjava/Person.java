package Finalprojectjava;

import java.util.Scanner;

public abstract class Person {

    String id, name;

     Scanner input = new Scanner(System.in);


     public void person() {
     System.out.print("id:-"+"\t");
     id = input.nextLine();
     System.out.print("name:-"+"\t");
     name = input.nextLine();

}

    public void showperson()
        {
            System.out.print(id +"\t\t" + "  " + name + "\t\t" );

        }
}

