import java.io.IOException;
import java.util.Scanner;

public class bee1014 {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
      
        System.out.println("Distância: ");
        int dis = sc.nextInt();
        System.out.println("Combustível gasto: ");
        double combGT = sc.nextDouble();

        double combGM = dis/combGT;
        System.out.println(combGM + " km/l");
          
        sc.close();
 
    }
 
}
