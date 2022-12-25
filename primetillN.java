import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      for(int i=1;i<=n;i++){
            boolean isprime = true;
            for(int j=2;j<=i/2;j++){
                if(i%j == 0){
                    isprime = false;
                    break;
                }
            }
            if(isprime){
                if(i == 1){
                    System.out.println("1 is neither prime nor composite");
                }
                else{
                    System.out.println("Prime number "+i);
                }
            }
            else{
                System.out.println("Not a prime number");
            }
        }
    }
}
