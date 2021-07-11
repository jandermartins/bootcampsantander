import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorTeste {

    private static final ExecutorService executor = Executors.newFixedThreadPool(3);

    public static void main(String[] args) {
        Casa casa = new Casa(new Quarto());
        casa.obterAFazerDeCasa().forEach(atividade -> executor.execute(() -> atividade.realizar()));
        executor.shutdown();

    }


}

class Casa{
    private List<Comodo> comodos;

    Casa(Comodo ... comodos){
        this.comodos = Arrays.asList(comodos);
    }

    List<Atividade> obterAFazerDeCasa(){
        return this.comodos.stream().map(Comodo::obterAfazeresComodo)
                .reduce(new ArrayList<Atividade>(), (pivo, atividades) -> {
                    pivo.addAll(atividades);
                    return pivo;
                });
    }
}

abstract class Comodo{
    abstract List<Atividade> obterAfazeresComodo();
}

interface Atividade{
    void realizar();
}

class Quarto extends Comodo{

    @Override
    List<Atividade> obterAfazeresComodo() {
        return null;
    }


    private void ArrumarGuardaRoupa(){
        System.out.println("Arrumando guarda roupa");
    }


    private void ArrumarACasa(){
        System.out.println("Arrumando a casa");
    }


    private void ArrumarOQuarto(){
        System.out.println("Arrumando o quarto");
    }
}
