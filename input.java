import java.util.*;
class input{
    public static void main (String[] args){
         Scanner sc = new Scanner(System.in);

        
        //Next int method for integer input

        System.out.print("Enter you your lucky number:");
        int num_1= sc.nextInt();
        System.out.println("Lucky number is:" +num_1);

        // Next line method for string input
        System.out.print("enter your full name:");
        String name = sc.nextLine( );
        System.out.println("Your name is :" +name); 

    }
}