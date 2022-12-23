import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //outer loop
        for(int i=1;i<=n;i++){
            //inner reverse loop
            for(int j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


