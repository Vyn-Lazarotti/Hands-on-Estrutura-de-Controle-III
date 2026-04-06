import java.io.IOException;
import java.util.Scanner;

public class bee1038 {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Código Especificação Valor");
        System.out.println("1 Cachorro Quente R$4.00");
        System.out.println("2 X-Salada R$4.50");
        System.out.println("3 X-Bacon R$5.00");
        System.out.println("4 Torrada simples R$2.00");
        System.out.println("5 Refrigerante R$1.50");

        System.out.println("Digite o código: ");
        int code = sc.nextInt();
        System.out.println("Digite a quantidade: ");
        int qt = sc.nextInt();

        switch (code) {
          case 1:
              int hotDog = qt * 4;
              System.out.println("Total: R$ " + hotDog);
              break;
            
          case 2:
              double saladX = qt * 4.50;
              System.out.println("Total: R$ " + saladX);
              break;

          case 3:
              int baconX = qt * 5;
              System.out.println("Total: R$ " + baconX);
              break;

          case 4:
              int toast = qt * 2;
              System.out.println("Total R$ " + toast);
              break;

          case 5:
              double soda = qt * 1.50;
              System.out.println("Total: R$ " + soda);
              break;
            
          default:
              System.out.println("Código não encontrado");
              break;
        }
      
        sc.close();
 
    }
 
}
