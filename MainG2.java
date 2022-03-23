
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class MainG2{
    public static void main(String[] args) {
        
        Vista v = new Vista();
        String lisp = v.solicitar_lisp();

        CalculadoraLisp c = new CalculadoraLisp(lisp);
        // c.separador();
        String[] expresionLisp = c.get_expresion();
        Vector<String> expresion= new Vector<>();

        for(int k = 0; k<expresionLisp.length ;k++){
            
            expresion.add(expresionLisp[k]);
            //System.out.println(expresion.get(k));

        }

        Double total=CalculadoraLisp.operar(expresion);

        System.out.println("El total es de "+total);
            
    }
  



}

class Vista{
    Scanner scanner = new Scanner(System.in);

    public String solicitar_lisp(){
        System.out.println();
        System.out.print("Ingrese su expresion Lisp! // ");
        scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println();
        return s;
    }
    
}




