
import java.util.Scanner;

public class DemoElevador {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int totAndares;
        int capElevador;
        int totPessoasElevador;
        int chamarElevador;

        System.out.printf("Informar o total de andares do predio: ");
        totAndares = ent.nextInt();

        System.out.printf("Qual a capaciade maxima do elevador: ");
        capElevador = ent.nextInt();

        System.out.printf("Quantas pessoas estao no elevador: ");
        totPessoasElevador = ent.nextInt();

        System.out.printf("Chamar elevador para: ");
        chamarElevador = ent.nextInt();

        Elevador elevador = new Elevador(0, totAndares, capElevador, totPessoasElevador);
        

        elevador.imprimirInfor();
        elevador.chamarElevador(chamarElevador);
        
        ent.close();
    }
}
