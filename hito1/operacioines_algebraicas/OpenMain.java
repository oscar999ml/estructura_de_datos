

import java.util.Scanner;
import operacionesalgebraicas.Operaciones;
public class OpenMain {
    public static void main(String [] args){
        System.out.println("programa que suma dos numeros usando claces");

        int num1, num2;

        Scanner read = new Scanner(System.in);

        System.out.println("ingrese el valor del numero 1");
        num1=read.nextInt();

        System.out.println("ingrese el valor del numero 2");
        num2=read.nextInt();

       Operaciones oper1 =new Operaciones(num1,num2);

       int suma= oper1.suma();
       System.out.println("la suma es: "+suma);
    }
}
