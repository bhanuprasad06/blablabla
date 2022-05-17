import java.util.Scanner;

public class Main{

//Main execution



public static void main(String[] args){
       Support s = new Support();
       s.welcome();
       s.input();
       s.calculation();
  
    }
}

class Support{
   
//Support functions
     void welcome(){
        System.out.println("hello");
        System.out.println("welcome to solve the calculator game");
        
    }

void input(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("enter number of moves");
      //  moves = input.nextInt();
        System.out.println("enter number of keys");        System.out.println("enter the goal");
    }
   
    
    void calculation(){
        
    }
}
