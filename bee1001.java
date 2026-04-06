import java.io.IOException;
import java.util.Scanner;

public class bee1001 {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int A, B;
        
        System.out.println("Digite o primeiro número: ");
        A = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        B = sc.nextInt();
        int X = A + B;
        System.out.println("X = " + X);
        
        sc.close();
 
    }
 
}
