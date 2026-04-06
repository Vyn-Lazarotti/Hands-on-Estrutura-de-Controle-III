import java.io.IOException;
import java.util.Scanner;

public class bee1016 {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
      
        int spdX = 60;
        int spdY = 90;
      
        System.out.println("Distância: ");
        int distancia = sc.nextInt();

        int kmTempo = distancia * 2;
        System.out.println(kmTempo + " minutos");
      
        sc.close();
 
    }
 
}
