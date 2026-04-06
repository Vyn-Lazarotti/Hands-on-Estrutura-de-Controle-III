import java.io.IOException;
import java.util.Scanner;

public class bee1002 {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Digite o raio: ");
        double raio = sc.nextDouble();
        double area = 3.141592 * Math.pow(raio, 2);
        System.out.println("Área do círculo: " + area);

        sc.close();
 
    }
 
}
