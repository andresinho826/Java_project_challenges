package codigo_practice;
/*
Serie fibonaci parte 2 -> 1,1,2,3,5,8,13...
 */
public class Fibonacci_Dos {
        int x=1;
        int temp = 0;
        int anterior = 0;

    public static void main(String[] args) {
        Fibonacci_Dos fd = new Fibonacci_Dos();
        fd.fibo(30);
    }



    public void fibo(int n){

        while (true){

            System.out.println(temp);
            temp = x;
            x=x+anterior;
            anterior = temp;

            if (x >= n) {
                break;

            }
        }
    }

}
