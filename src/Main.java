import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int respuesta;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1.sumar %n2.restar %n3.Multiplicar %n4.Dividir %n5.salir  ");
            System.out.printf("Elija una opcion:");

            respuesta = sc.nextInt();
            int a,b;


            switch (respuesta){

                case 1:
                    System.out.println("La suma es:");
                    System.out.println(sumar(a,b));
                    break;
                case 2:
                    System.out.println("la resta es:");
                    System.out.println(restar(a,b));
                    break;
                case 3:
                    System.out.println("la multiplicacion es:");
                    System.out.println(multiplicar(a,b));
                    break;
                case 4:

                    System.out.println("La division es:");
                    System.out.println(dividir(a,b));
                    break;
                }

            }
        while (respuesta != 5);

    }

    public static int sumar(int a, int b){
        return a +b;
    }

    public static int restar(int a, int b){
        return a - b;
    }

    public static int multiplicar(int a, int b){
        return a * b;
    }

    public static int dividir(int a, int b){
        if (b == 0){
            System.out.println("Error division entre cero");
        }
        else {
            return a / b;
        }
    }

}