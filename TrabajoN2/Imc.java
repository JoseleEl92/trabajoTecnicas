import java.text.DecimalFormat;
import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {

       /* System.out.println(Colores.white);
        System.out.println("*******************************************************");
        System.out.println("*        CALCULADORA DE INDICE DE MASA CORPORAL       *");
        System.out.println("*******************************************************");
        System.out.println(Colores.reset); */



        /*System.out.println("Ingrese su peso (en kg): ");
        double peso=new java.util.Scanner(System.in).nextDouble();


        System.out.println("Ingrese su estatura (en mts): ");
        double altura=new java.util.Scanner(System.in).nextDouble();*/

        DecimalFormat df=new DecimalFormat("##.##");
       
        
        if(args.length==2){
            double peso=Double.parseDouble(args[0]);
            double altura=Double.parseDouble(args[1]);
            double imc=calcularMasaCorp(peso, altura);
            System.out.println("IMC: " +df.format(imc) +" "+ obtenerEstado(imc));
        }else{
            System.out.println("ERROR: Los parametros ingresados no son correctos, ingrese Peso (kg) y Altura (mts)");
        }
        
                




        
        
        /* double calcImc=peso/(altura*altura);
        System.out.println();
        System.out.println(Colores.yellow+"Indice de masa corporal: "+df.format(calcImc));
        System.out.println(Colores.reset);

        if(calcImc<=18.49) System.out.println(Colores.red+"Tu peso es Bajo");
        if(calcImc>=18.50 && calcImc<=24.99) System.out.println(Colores.green+"Tu peso es Normal");
        if(calcImc>=25 && calcImc<=29.99) System.out.println(Colores.red+"Tienes Sobrepeso");
        if(calcImc>=30 && calcImc>35) System.out.println(Colores.red+"Tienes Obesidad");
        System.out.println(Colores.reset);*/

       
    }


    private static Double calcularMasaCorp(double peso, double altura){
        
        double masaCorp = peso/(altura*altura);
        
        return masaCorp;
    }

    private static String obtenerEstado(double indcMasaCorp){
        if(indcMasaCorp>=1 && indcMasaCorp<=18.49)      return "Tu peso es bajo";
        if(indcMasaCorp>=18.50 && indcMasaCorp<24.99)   return "Tu peso es normal";
        if(indcMasaCorp>=25 && indcMasaCorp<=29.99)     return "Usted tiene sobrepeso";
        if(indcMasaCorp>=30 && indcMasaCorp>35)         return "Usted tiene obesidad";
        return "";
    }

    }
 

        
        
    
    