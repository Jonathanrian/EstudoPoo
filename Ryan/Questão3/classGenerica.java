

public class classGenerica <T> {
    private T atributo1;
    private T atributo2;
    private T atributo3;
    
    public classGenerica(T atribut1, T atribut2, T atribut3){
        this.atributo1 = atribut1;
        this.atributo2 = atribut2;
        this.atributo3 = atribut3;
    }

    public int contarIguais(){
        int contador = 0;

        if (atributo1.equals(atributo2)) {
            contador++;
        }
        if (atributo1.equals(atributo3)) {
            contador++;
        }
        if (atributo2.equals(atributo3)) {
            contador++;
        }

        return contador;
    }

    public void imprimirInformacao(){
        System.out.println("Atributo 1: "+ atributo1);
        System.out.println("Atributo 2: "+ atributo2);
        System.out.println("Atributo 3: "+ atributo3);
    }

    public static void main(String[] args) {
        classGenerica <Integer> generica1 = new classGenerica<Integer>(1, 1, 1);
        System.out.println("Quantidade de atributos iguais: " + generica1.contarIguais());
        generica1.imprimirInformacao();

        classGenerica <String> generical2 = new classGenerica<String>("World", "World", "World");
        System.out.println("A quantidade de atributos iguais: " + generical2.contarIguais());
        generical2.imprimirInformacao();

        classGenerica <Double> generical3 = new classGenerica<Double>(2.88, 2.88, 2.88);
        System.out.println("A quantidade de atributos iguais: "+ generical3.contarIguais());
        generical3.imprimirInformacao();
    }

}
