public class teste {

    public static void main(String[] args) {
        BarraDeCarregamento barraDeCarregamento = new BarraDeCarregamento();
        BarraDeCarregamento barraDeCarregamento1 = new BarraDeCarregamento();


        GerarPdf gerarPdf = new GerarPdf();
        GerarPdf gerarPdf1 = new GerarPdf();

        gerarPdf.run();
        gerarPdf1.run();

        barraDeCarregamento.run();
        barraDeCarregamento1.run();

    }


}

class GerarPdf implements Runnable{

    @Override
    public void run() {
        System.out.println("gerando pdf");
    }
}

class BarraDeCarregamento implements Runnable{

    @Override
    public void run() {
        System.out.println("carregando...");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


