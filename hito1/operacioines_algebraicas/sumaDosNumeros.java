import java.util.Scanner;
public class sumaDosNumeros {
    public static void main(String [] args){
        System.out.println("programa que suma dos numeros");

        int num1, num2, resta, suma, multiplicacion, divicion;

        Scanner read = new Scanner(System.in);

        System.out.println("ingrese el valor del numero 1");
        num1=read.nextInt();

        System.out.println("ingrese el valor del numero 2");
        num2=read.nextInt();


        resta = num1 - num2;
        suma =num1 +num2;
        multiplicacion= num1 *num2;
        divicion= num1 /num2;


        System.out.println("el suma es:  " + suma);
        System.out.println("la resta es:  " + resta );
        System.out.println("la multiplicacion es:  " + multiplicacion);
        System.out.println("la divicion es:  " + divicion );
    }
}
