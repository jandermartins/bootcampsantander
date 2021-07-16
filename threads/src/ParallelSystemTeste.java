public class ParallelSystemTeste {


    public static void main(String[] args) {

        long inicio

        System.out.println(fatorial(500000000));
    }


    public static long fatorial(long n){
        long fat = 1;

        for (long i = 2; i <= n; i++){
            fat *= i;
        }
        return fat;
    }
}
