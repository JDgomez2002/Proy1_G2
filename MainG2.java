
import java.util.Scanner;

public class MainG2{
    public static void main(String[] args) {
        
        Vista v = new Vista();
        String lisp = v.solicitar_lisp();

        CalculadoraLisp c = new CalculadoraLisp(lisp);
        // c.separador();
        String[] expresionLisp = c.get_expresion();

        for(int k = 0; k<expresionLisp.length ;k++){
            System.out.println(expresionLisp[k]);
        }

        System.out.println();
            
    }
}

class Vista{
    Scanner scanner = new Scanner(System.in);

    public String solicitar_lisp(){
        System.out.println();
        System.out.print("Ingrese su expresion Lisp! R// ");
        System.out.println();
        scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        return s;
    }
    
}