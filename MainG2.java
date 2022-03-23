
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

        Double total=operar(expresion);

        System.out.println("El total es de "+total);
            
    }

    public static Double operar(Vector<String> expresion){
        Double z=0.0;
        boolean encontroSuma=false;
        int Contador= 0;
        ArrayList<Integer> operaciones=new ArrayList<>();

        for(int k = 0; k<expresion.size() ;k++){


            if(expresion.get(k).equals("(")){

                operaciones.add(k);
                Contador++;
                System.out.println("Operaciones en posicion "+k);

            }
        
        
        
        }
        try{
            do{
                int x=operaciones.get(operaciones.size()-1);
                String x1=expresion.get(x+1);
                
                String y1=expresion.get(x+2);
                String z1=expresion.get(x+3);

                expresion.remove(x+4);
                expresion.remove(x+3);
                expresion.remove(x+2);
                expresion.remove(x+1);
                expresion.remove(x);

                System.out.println(" el X1 es "+x1);
                System.out.println(" el X1 es "+y1);
                System.out.println(" el X1 es "+z1);

                z = Operations(y1,z1,x1);

                System.out.println("Operacion de prueba "+z);

                expresion.remove(expresion.size()-1);
                expresion.add(z+"");
                expresion.add(")");
                System.out.println("");

                for(int k = 0; k<expresion.size() ;k++){
                    
                    System.out.print(expresion.get(k));

                }

                System.out.println("");

                operaciones.remove(operaciones.size()-1);


            }while(operaciones.size()>0);
    }catch(Exception e){
        System.out.println("Operaciones finalizadas");

    }


        return z;

    }

    public static Double Operations(String num1, String num2, String operando){
        Double op=0.0;

        if(operando.equals("+")){

            op=Double.parseDouble(num1);
            op=op+Double.parseDouble(num2);

        }else if(operando.equals("-")){

            op=Double.parseDouble(num2);
            op=op-Double.parseDouble(num1);

        }else if(operando.equals("*")){

            op=Double.parseDouble(num1);
            op=op*Double.parseDouble(num2);

        }else if(operando.equals("/")){

            op=Double.parseDouble(num2);
            op=op/Double.parseDouble(num1);

        }



        return op;
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




