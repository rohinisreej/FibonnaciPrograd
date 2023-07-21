import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static int fib(int N){
        if(N==0)
        {
            return 0;
        }
        if(N==1)
        {
            return 1;
        }
        return fib(N-1)+fib(N-2);
    }
    public static void main(String[] args) {

        Scanner scanner=new Scanner(in);
        out.println("Enter n");
        int n=scanner.nextInt();
        out.println(fib(n));
    }
}