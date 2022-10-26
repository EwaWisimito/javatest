import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Podaj pierwszą liczbę: ");
        int a = scanner.nextInt();
        System.out.print("Podaj drugą liczbę: ");
        int b = scanner.nextInt();
        System.out.print("Podaj operację: ");
        String input = scanner.next();   
        char operation = input.charAt(0);

        switch (operation) {
            case '+':
                System.out.println("wynik dodawania to: " + (a+b));
                break;

            case '-':
                System.out.println("wynik odejmowania to: " + (a-b));
                break;

            case '*':
                System.out.println("wynik mnożenia to: " + (a*b));
                break;

            case '/':
                System.out.println("wynik dodawania to: " + ((double)a/b));
                break;

            default:
                System.out.println("Dupa");
        }




        // if(operation == '+'){
        //     System.out.println("wynik dodawania to: " + (a+b));
            
        // }else if(operation == '-'){
        //     System.out.println("wynik odejmowania to: " + (a-b));
            
        // }else if(operation == '*'){
        //     System.out.println("wynik mnożenia to: " + (a*b));
           
        // }else if(operation == '/'){
        //     if(b!=0){
        //         System.out.println("wynik dzielenia to: " + ((1.0*a/b)));
        //     }else{
        //         System.out.println("Tak nie wolno!");
        //     }
        // }else{
        //     System.out.print("Jednorożec");
        // }

        scanner.close();
    }
}