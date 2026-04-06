import java.io.IOException;
import java.util.Scanner;

public class bee1012 {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
      
        System.out.println("Digite o valor de A: ");
        double valorA = sc.nextDouble();
        System.out.println("Digite o valor de B: ");
        double valorB = sc.nextDouble();
        System.out.println("Digite o valor de C: ");
        double valorC = sc.nextDouble();
      
        double areaT = (valorA * valorC) / 2;
        double areaC = 3.14159 * valorC;
        double areaTp = ((valorA + valorB) * valorC) / 2;
        double areaQ = Math.pow(valorB, 2);
        double areaR = valorA * valorB;
        System.out.println("Triangulo: " + areaT);
        System.out.println("Circulo: " + areaC);
        System.out.println("Trapezio: " + areaTp);
        System.out.println("Quadrado: " + areaQ);
        System.out.println("Retangulo: " + areaR);
      
        sc.close();
 
    }
 
}
