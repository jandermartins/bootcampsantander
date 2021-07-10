public class teste {

    public static void main(String[] args){

        System.out.println(fatorial(5));



    }

    public static int fatorial(int numero){
        if(numero == 1) {
            return numero;
        }return numero*fatorial(numero--);
    }
}
