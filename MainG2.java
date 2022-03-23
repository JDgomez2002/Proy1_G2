
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class MainG2{
    public static void main(String[] args) {
        // Creaci�n de variables
        Vista v = new Vista();
        String lisp = v.solicitar_lisp();

        CalculadoraLisp c = new CalculadoraLisp(lisp);
        // c.separador();
        
        // Se inicializa variable y llama m�todo de calculadora
        String[] expresionLisp = c.get_expresion();
        Vector<String> expresion= new Vector<>();

        	// Si k es menor a la cantidad de expresiones seguir a�adiendo las expresiones al array.
        for(int k = 0; k<expresionLisp.length ;k++){
            
            expresion.add(expresionLisp[k]);
            //System.out.println(expresion.get(k));

        }

        //Operamos la expresi�n y la a�adimos al array
        Double total=CalculadoraLisp.operar(expresion);

        v.dar_resultado(total);
            
    }
  



}

//Clase donde se pide input de expresi� lisp
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

    public void dar_resultado(Double total){
        System.out.println();
        System.out.println("El total es de: "+total);
        System.out.println();
    }
    
}




