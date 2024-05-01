package dio;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número:");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        int numero2 = scanner.nextInt();
        scanner.close();
        
        try {
            contar(numero1, numero2);
        } catch (ParametrosInvalidosException ex) {
            System.out.println(ex.getMessage());
        }
    }

    static void contar(int numero1, int numero2) throws ParametrosInvalidosException {

        if (numero1 > numero2) {
            throw new ParametrosInvalidosException("O parâmetro numero1 é maior que o parâmetro numero2");
        }

        int contagem = numero2 - numero1;
        for (int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo o número " + (i + 1));
        }
    }
}

class ParametrosInvalidosException extends Exception {
    
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}
