
import java.util.ArrayList;
import java.util.Scanner;

public class CalculadoraLisp {
    public static void main(String[] args) {
        Vista v = new Vista();
        String lisp = v.solicitar_lisp();

        Calculadora c = new Calculadora(lisp);
        // c.separador();
        String[] expresionLisp = c.get_expresion();

        for(int k = 0; k<expresionLisp.length ;k++){
            System.out.println(expresionLisp[k]);
        }

        System.out.println();
        
    }
}

class Calculadora{

    private String[] lispArray;
    private int contador;
    private ArrayList<StackLisp<String>> myPrincipal = new ArrayList<StackLisp<String>>();


    public Calculadora(String s){
        this.lispArray = expresion_reader(s);
        this.contador = 0;
    }

    private String[] expresion_reader(String lisp){
        String[] lisp_con_espacios = lisp.split("");

        int num_caracteres = 0;

        for(int k = 0; k<lisp_con_espacios.length ;k++){
            if(!(lisp_con_espacios[k].equals(" "))){
                num_caracteres++;
            }
        }

        //
        String[] lispArray1 = new String[num_caracteres];

        int espacios_llenados = 0;

        for(int i = 0; i<lisp_con_espacios.length ;i++){
            if(!(lisp_con_espacios[i].equals(" "))){
                lispArray1[espacios_llenados] = lisp_con_espacios[i];
                espacios_llenados++;
            }
        }

        return lispArray1;
    }

    public void separador(){

            if(lispArray[this.contador].equals("(")){

                StackLisp<String> newStack = new StackLisp<String>();

                // String operando = lispArray[k+1]; //+
                this.contador++;
                boolean operacion = true;
                // ( + 5 9 )
                //( + 5 9 (- 5 6) 5 9 8 )

                while(operacion){

                    if(lispArray[contador].equals(")")){
                        myPrincipal.add(newStack);
                        operacion = false;
                    }

                    else if(lispArray[contador].equals("(")){
                        separador();
                    }

                    else{
                        newStack.add(lispArray[contador]);  
                    }
                    
                }
            
        }
    }

    public ArrayList<StackLisp<String>> exrpesion(){
        return this.myPrincipal;
    }

    public String[] get_expresion(){
        return this.lispArray;
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