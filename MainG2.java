
import java.util.ArrayList;
import java.util.Scanner;

public class MainG2{
    public static void main(String[] args) {
        
        Vista v = new Vista();
        String lisp = v.solicitar_lisp();

        CalculadoraLisp c = new CalculadoraLisp(lisp);
        // c.separador();
        String[] expresionLisp = c.get_expresion();
        ArrayList<String> expresion= new ArrayList<>();

        for(int k = 0; k<expresionLisp.length ;k++){
            
            expresion.add(expresionLisp[k]);
            //System.out.println(expresion.get(k));

        }

        int total=operar(expresion);

        System.out.println("El total es de "+total);
            
    }

    public static int sum(ArrayList<String> ArrayNum){

        int suma=0;

        for(int i=0;i<ArrayNum.size();i++){

            System.out.println(ArrayNum.get(i));
            suma=suma+Integer.parseInt(ArrayNum.get(i));
        }

        return suma;
    }

    public static int operar(ArrayList<String> expresion){
        int z=0;
        boolean encontroSuma=false;

        for(int k = 0; k<expresion.size() ;k++){


            //System.out.println(expresion.get(k));

            String x=expresion.get(k);
            System.out.println("x es igual a "+x);

            

            if(x.equals("+")&&encontroSuma==false){
                encontroSuma=true;
                System.out.println("si encuentra!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                boolean agregarSuma=false;
                ArrayList<String> ArraySuma=new ArrayList<>();
                ArrayList<String> ArrayNum=new ArrayList<>();

                for(int j = k; j<expresion.size() ;j++){
                    if(agregarSuma==true){
                        ArraySuma.add(expresion.get(j));
                    }
                    if(expresion.get(j).equals("(")){
                        agregarSuma=true;
                        ArraySuma.add(expresion.get(j));
                    }
                    if(expresion.get(j).equals(")")){
                        agregarSuma=false;
                        ArraySuma.add(expresion.get(j));
                        int t=operar(ArraySuma);
                        String u=""+t;
                        ArrayNum.add(u);

                    }
                    if(expresion.get(j).equals("0")||expresion.get(j).equals("1")||expresion.get(j).equals("2")||expresion.get(j).equals("3")||expresion.get(j).equals("4")||expresion.get(j).equals("5")||expresion.get(j).equals("6")||expresion.get(j).equals("7")||expresion.get(j).equals("8")||expresion.get(j).equals("9")){
                        
                        if(!agregarSuma){
                            ArrayNum.add(expresion.get(j));
                        }
                        
                        
                    }
                }
                

                z= sum(ArrayNum);
            }
        }



        return z;

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




