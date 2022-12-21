import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    sc.nextLine();
    String s = sc.nextLine();
    switch(s){
          case "+":
            System.out.println(a+b);
            break;
          case "-":
            System.out.println(a-b);
            break;
          case "*":
            System.out.println(a*b);
            break;
          case "/":
            if (b==0){
              System.out.println("Invalid");
              break;
            }
            else{
              System.out.println(a/b);
              break;
            }
          case "%":
                if (b==0){
                  System.out.println("Invalid");
                  break;
                }
                else{
                    System.out.println(a%b);
                     break;
                }
          default:
            System.out.println("Please enter valid input");
        }
    }
}

    
              
          
          
    
