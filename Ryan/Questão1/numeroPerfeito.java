public class numeroPerfeito {
    /*Escreva um programa que escreve os 4 primeiros números perfeitos. Um número perfeito
    é aquele que é igual à soma dos seus divisores (exceto o próprio número). Exemplos:
    6 = 1 + 2 + 3, 28 = 1 + 2 + 4 + 7 + 14. */

    public static boolean ehperfeito(int num){
        int somaDivisores = 0;


        for(int i = 1; i <= num/2; i++){
            if (num % i == 0 ) {
                somaDivisores += i;
            }
        }

        return num == somaDivisores;
    }

    public static void main(String[] args) {
        int cont = 0;
        int numero = 1; 

        System.out.println("Os quatros primeiros numeros perfeitos são: ");

        while (cont < 4) {
            if (ehperfeito(numero)) {
                System.out.println(numero);
                cont++;
            }

            numero++;
        }
    }
}