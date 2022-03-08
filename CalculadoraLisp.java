
import java.util.Scanner;

public class CalculadoraLisp {
    public static void main(String[] args) {
        Vista v = new Vista();
        String lisp = v.solicitar_lisp();

        String[] lispArray = lisp.split("");
        StackLisp<String> myStack = new StackLisp<String>();

        for(int k = 0; k<lispArray.length ;k++){
            if(!(lispArray[k].equals(" "))){
                myStack.add(lispArray[k]);
                System.out.println(lispArray[k]);
            }
        }
        System.out.println();

        // for(int k = 0; k<lispArray.length ;k++){
        //     System.out.println(myStack.remove());
        // }
    }
}

class Vista{
    Scanner scanner = new Scanner(System.in);

    public String solicitar_lisp(){
        System.out.print("Ingrese su expresion Lisp! R// ");
        scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        return s;
    }
    
}