import java.text.DecimalFormat;

public class Imc {
    public static void main(String[] args) {
        

        System.out.println(Colores.ANSI_WHITE);
        System.out.println("*******************************************************");
        System.out.println("*        CALCULADORA DE INDICE DE MASA CORPORAL       *");
        System.out.println("*******************************************************");


        System.out.println("Ingrese su peso (en kg): ");
        double peso=new java.util.Scanner(System.in).nextDouble();


        System.out.println("Ingrese su estatura (en mts): ");
        double altura=new java.util.Scanner(System.in).nextDouble();

        DecimalFormat df=new DecimalFormat("##.##");
        double Imc=peso/(altura*altura);
        System.out.println(Colores.ANSI_YELLOW+"Indice de masa corporal= "+df.format(Imc));

        if(Imc<=18.49) System.out.println(Colores.ANSI_RED+"Tu peso es Bajo");
        if(Imc>=18.50 && Imc<=24.99) System.out.println(Colores.ANSI_GREEN+"Tu peso es Normal");
        if(Imc>=25 && Imc<=28.99) System.out.println(Colores.ANSI_RED+"Tienes Sobrepeso");
        if(Imc>=30 && Imc>35) System.out.println(Colores.ANSI_RED+"Tienes Obesidad");
        
    }
}