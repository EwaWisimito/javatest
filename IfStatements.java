import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean correctOperation = false;

        System.out.print("Podaj pierwszą liczbę: ");
        int a = scanner.nextInt();
        System.out.print("Podaj drugą liczbę: ");
        int b = scanner.nextInt();
        System.out.print("Podaj operację: ");
        String input = scanner.next();   
        char operation = input.charAt(0);

        if(a>0) {
            System.out.println("a jest wieksze od zera");
        }
        else{
            System.out.println("a nie jet większe od zera");
        }
        if(operation == '+'){
            System.out.println("wynik dodawania to: " + (a+b));
            correctOperation = true;
        }
        if(operation == '-'){
            System.out.println("wynik odejmowania to: " + (a-b));
            correctOperation = true;
        }
        if(operation == '*'){
            System.out.println("wynik mnożenia to: " + (a*b));
            correctOperation = true;
        }
        if(operation == '/'){
            if(b!=0){
                System.out.println("wynik dzielenia to: " + ((1.0*a/b)));
                correctOperation = true;
            } 
            else{
                System.out.println("Tak nie wolno!");
            }
        }
        if(!correctOperation){
            System.out.print("Jednorożec");

        }
    }
}
