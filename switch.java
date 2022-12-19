import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int click = sc.nextInt();
    switch(click){
      case 1:
        System.out.println("Hello");
        break;
      case 2:
        System.out.println("Namasthe");
        break;
      case 3:
        System.out.println("Bonjour");
        break;
      default:
        System.out.println("Invalid Input");
    }
  }
}
        
    
