import java.util.Scanner;

public class HelloWorld{
     public static void main(String []args){
        Scanner scan = new Scanner(System.in); 
        System.out.println("Sup, how many cups of lemonade do you want?");
        int count = scan.nextInt();
        
        double cost = 1.00;
        double total = count * cost;
           if (total < 0) {
            System.out.println("no");
        } else {
        System.out.printf("Your total will be $%.2f\n",total);
     }    
}
