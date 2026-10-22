import java.util.Scanner;
class RETO2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuánto debes pagar: ");
        final int deuda = scanner.nextInt();
        System.out.print("¿Con cuanto vas a pagar?");
        final int pago = scanner.nextInt();
        int cambio;
        cambio = pago - deuda;
        System.out.println("El cambio es de: ("+cambio+")");
        int billetes1 = cambio / 100;
        cambio = cambio % 100;
        int billetes2 = cambio / 50;
        cambio = cambio % 50;
        int billetes3 = cambio / 20;
        cambio = cambio % 20;
        int billetes4 = cambio / 10;
        cambio = cambio % 10;
        int billetes5 = cambio / 5;
        cambio = cambio % 5 ;
        int monedas1 = cambio / 2;
        cambio = cambio % 2;
        int monedas2= cambio / 1;
        System.out.println(""+billetes1+" billete(s) de 100$");
        System.out.println(""+billetes2+" billete(s) de 50$");
        System.out.println(""+billetes3+" billete(s) de 20$");
        System.out.println(""+billetes4+" billete(s) de 10$");
        System.out.println(""+billetes5+" billete(s) de 5$");
        System.out.println(""+monedas1+" moneda(s) de 2$");
        System.out.println(""+monedas2+" moneda(s) de 1$");
    }
}
