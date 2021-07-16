import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {

    public static void main(String[] args) {
        String[] names = {"xuxa", "seria", "nomes", "jander"};
        Integer[] numeros = {1,2,3,4,5,6,7,8,9};
        imprimirNumerosDobrados(numeros);
        imprimir(names);

    }

    public static void imprimir(String... nomes){
        String nomesParaImprimir = Stream.of(nomes)
                .filter(nome -> nome.equals("seria"))
                .collect(Collectors.joining());

        Stream.of(nomes)
                .forEach(nome -> System.out.println("foreach "+ nome));

        System.out.println("nomes lindos " + nomesParaImprimir);
    }

    public static void imprimirNumerosDobrados(Integer... numeros){
        Stream.of(numeros)
                .map(numero -> numero * 2)
                .forEach(System.out::println);
    }
}
