import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();

        System.out.println("Escolha a operação: + - * /");
        char op = sc.next().charAt(0);

        if (op == '+') {
            System.out.println("Resultado: " + (n1 + n2));
        } else if (op =='-') {
            System.out.println("Resultado: " + (n1 - n2));
        } else if (op =='*') {
            System.out.println("Resultado: " + (n1 * n2));
        } else if (op =='/') {
            System.out.println("Resultado: " + (n1 / n2));
        } else {
            System.out.println("Senha invalida!");

        }
    }
}
