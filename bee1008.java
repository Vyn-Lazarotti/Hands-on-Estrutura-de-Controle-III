import java.io.IOException;
import java.util.Scanner;

public class bee1008 {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Número do funcionário: ");
        int num = sc.nextInt();
        System.out.println("Número de horas trabalhadas: ");
        double horas = sc.nextDouble();
        System.out.println("Valor por hora: ");
        double valor = sc.nextDouble();
        salario = horas * valor;
        System.out.println("Número: " + num);
        System.out.println("Sálario: R$ " + salario);
        sc.close();
 
    }
 
}
