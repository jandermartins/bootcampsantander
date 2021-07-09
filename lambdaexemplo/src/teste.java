public class teste {

    public static void main(String[] args){
        Funcao colocarNome = valor -> "Guevara " + valor;
        System.out.println(colocarNome.gera("Jander"));
    }


    @FunctionalInterface
        interface Funcao{
        String gera(String valor);
    }

}
