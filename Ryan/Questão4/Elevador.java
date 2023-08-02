
public class Elevador {

    private int terreo = 0;

    int andarAtual;
    int totalAndares;
    int capacidadeElevador;
    int totalPessoasElevador;

    Elevador (int adrAtual, int totAndares, int capElevador, int totPessoasElevador){
        this.andarAtual = adrAtual;
        this.totalAndares = totAndares;
        this.capacidadeElevador = capElevador;
        this.totalPessoasElevador = totPessoasElevador;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public int getCapacidadeElevador() {
        return capacidadeElevador;
    }

    public int getTotalPessoasElevador() {
        return totalPessoasElevador;
    }

    void contrutor(int adrAtual, int totAndares){
        int getAndarAtual = adrAtual;
        int getTotalAndares = totAndares;

        System.out.println("O andar atual eh: " + getAndarAtual);
        System.out.println("O totalAndares atual eh: " + getTotalAndares);

    }

    int entarElevador(){
        int entrarElevador = totalPessoasElevador; 

        if(entrarElevador < capacidadeElevador){
            entrarElevador ++;
            System.out.println("O total de pessoas no elevador eh: " + entrarElevador);
            return entrarElevador;
        }
        else{
            System.out.println("Não e possivel entrar no elevador: ");
            return 0;
        }
    }

    int sairElevador(){
        int sairElevador = totalPessoasElevador;

        if(sairElevador <= capacidadeElevador){
            sairElevador --;
            System.out.println("O tatal de pessoas Agora no elevador: " + sairElevador);
            return sairElevador;
        }
        else{
            System.out.println("não vai retornar nada: kkkk");
            return 0;
        }
    }

    void chamarElevador(int chamouElevador){
        int posiElevador = terreo;

        if(chamouElevador >= 0 && chamouElevador <= totalAndares){
            posiElevador = chamouElevador;
            System.out.println("O elevador esta no andar: " + posiElevador);
        }
        else{
            System.out.println("Erro! O elevador nao pode ser chamado para o andar: "+ chamouElevador);
        }
    }
    

    void imprimirInfor(){
        System.out.println();
        System.out.println("---------------------------");
        System.out.println("As informações do predio: ");
        contrutor(andarAtual, totalAndares);
        System.out.println("---------------------------");

        System.out.println();
        System.out.println("---------------------------");
        System.out.println("Adicionando uma pessoa ao Elevador ");
        System.out.println("Numero de pessoas no elevador antes: "+ totalPessoasElevador);
        entarElevador();
        System.out.println("---------------------------");
        System.out.println();
        System.out.println("Removendo uma pessoa ao Elevador ");
        System.out.println("Numero de pessoas no elevador antes: "+ totalPessoasElevador);
        sairElevador();
        System.out.println("---------------------------");
    }


}
