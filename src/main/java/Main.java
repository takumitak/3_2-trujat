    import java.util.Scanner;

    // import org.junit.jupiter.api.Test;

    public class Main {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz liczbe: ");
        int a = scanner.nextInt();
        System.out.println("Znak: ");
        char znak = scanner.next().charAt(0);
        for(int i = 0; i < a+1; i++)
          {
            for(int j = 0; j < i; j++)
              {
                System.out.print(znak);
                
              }
            System.out.print('\n');
          }

      }
    }