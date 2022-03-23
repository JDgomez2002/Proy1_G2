
import java.util.ArrayList;
import java.util.Vector;

public class CalculadoraLisp {
    
    private String[] lispArray;
    private int contador;
    private ArrayList<StackLisp<String>> myPrincipal = new ArrayList<StackLisp<String>>();


    public CalculadoraLisp(String s){
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