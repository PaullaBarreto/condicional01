import java.util.Scanner;

public class Condicional01 {

    public static void main(String[] args) {
        int numero;
        System.out.print("Digite a nota do estudando; ");

        Scanner input = new Scanner(System.in);
        numero = input.nextInt();

        if (numero > 70 ) {
            System.out.println("O aluno foi aprovado");
        }
    }
}