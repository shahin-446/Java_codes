import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float PI = 3.14F;
        int r = sc.nextInt();
        float area = PI*r*r;
        System.out.println(area);
    }
}
