import java.util.*;
 
public class Main {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
   
        while(num1<=0 || num1>=10 || num2<=0 || num2>=10) {
            num1 = scan.nextInt();
            num2 = scan.nextInt();            
        }
        
        System.out.println(num1-num2);
    }
}
 
