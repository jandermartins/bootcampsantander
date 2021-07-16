import java.util.function.Consumer;

public class Consume {

    public static void main(String[] args) {

        //Consumer<String> imprimir = frase -> System.out.println(frase);

        Consumer<String> imprimir = System.out::println;

        imprimir.accept("iae mona");
    }
}
