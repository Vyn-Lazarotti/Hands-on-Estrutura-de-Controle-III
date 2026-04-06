import java.io.IOException;
import java.util.Scanner;

public class bee1008 {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome do vendedor: ");
        String nome = sc.nextLine();
        System.out.println("Salário fixo: ");
        double salF = sc.nextDouble();
        System.out.println("Vendas: ");
        double vendas = sc.nextDouble();
        double salT = salF + (vendas * 0.015);
        System.out.println("Total = R$ " + salT);
        sc.close();
 
    }
 
}
