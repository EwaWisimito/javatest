import java.util.Scanner;

public class Loops2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Wpisz liczbę: ");
        int a = scanner.nextInt();
        int i= a;

     while( i!=50 ){
        if(i<50){
        System.out.println(i);
        i++;}else{
            System.out.println(i);
        i--;
        }

     }

       
    }
 
}