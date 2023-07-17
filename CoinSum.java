import java.util.Scanner;

public class CoinSum {
    public static int coinsum(int n) {
        int k=0;
        while(n>=k+1) {
            n-=k+1;
            k++;
        }
        return k;


    }

    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        int value=coinsum(n);
        System.out.println(value);

    }

}