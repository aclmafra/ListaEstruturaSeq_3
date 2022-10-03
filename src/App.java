import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double n1, n2;

        System.out.println("Digite dois numeros: ");
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        System.out.println("A soma dos dois numeros e: " + (n1 + n2));

        sc.close();
    }
}
