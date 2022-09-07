import java.util.Scanner;

public class recarsion {
    public static int sumOfDigit(int n) {
        if (n < 0) {
            return 0;
        }
        if ((n < 10) && (n > 0)) {
            return n;
        }

        return n % 10 + sumOfDigit(n / 10);

    }

    public static int fibo(int n) {
        if (n < 0) {
            return -1;
        }
        if ((n == 0) || (n == 1)) {
            return n;
        }
        int ans = (fibo(n - 1) + fibo(n - 2));
        return ans;
    }
    public  static int power(int x,int n){
        if(n==1){
            return x;
        }
        return (x*power(x,n-1));
    }
    public static void  printn(int n){
        if(n==1){
            System.out.println(1);
           return;
        }System.out.println(n);

        printn(n-1);

    }
    public static int  count(int n){
        if (n<=0){
            return 0;
        }
        int c=1+count(n/10);
        return c;
    }
    public static int multipication(int m,int n){
        if(n==0){
            return 0;
        }
        return m+multipication(m,n-1);
    }
    public static int countZeroes(int n){
        int lastdigit =0;
        if (n==0){
            return 0;
        }

       int small =countZeroes(n/10);

        lastdigit=n%10;
        if (lastdigit==0){
            return small+1;
        }
        else{
            return small;
        }
    }
    public static double gsum(int n){
        if (n==0){
            return 1;
        }
        double sort=gsum(n-1);
        return sort+1.0/power(2,n);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // int m=sc.nextInt();
        //int n=sc.nextInt();
        //System.out.println(countZeroes(n));
        System.out.println(gsum(3));
        //System.out.println(fibo(6));
        //System.out.println(power(3,3));
        //printn(5);
        //System.out.println(multipication(m,n));
        //System.out.println(count(40255));
        //System.out.println(sumOfDigit(10));
    }
}





