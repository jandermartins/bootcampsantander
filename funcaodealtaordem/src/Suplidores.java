import java.util.function.Supplier;

public class Suplidores {

    public static void main(String[] args) {

        Supplier<Pessoa> pessoa = () -> new Pessoa();
        System.out.println(pessoa.get());

    }
}

class Pessoa{
    String pessoa;
    String idade;

    public Pessoa() {
        this.pessoa = "jander";
        this.idade = "27";
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "pessoa='" + pessoa + '\'' +
                ", idade='" + idade + '\'' +
                '}';
    }
}
