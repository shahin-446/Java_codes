import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean isprime = true;
        int n = sc.nextInt();
        for(int i=2;i<=n/2;i++){
            if(n%i == 0){
                isprime = false;
                break;
            }
        }
        if(isprime){
            if(n == 1){
                System.out.println("1 is neither prime nor composite");
            }
            else{
                System.out.println("Prime number");
            }
        }
        else{
            System.out.println("Not a prime number");
        }
    }
}
