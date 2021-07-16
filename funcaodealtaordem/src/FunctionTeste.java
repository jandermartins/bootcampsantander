import java.util.function.Function;

public class FunctionTeste {

    public static void main(String[] args) {

        Function<String, String> retornaNome = texto -> new StringBuilder(texto).reverse().toString();

        System.out.println(retornaNome.apply("jander"));


    }
}
