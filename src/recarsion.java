public class recarsion {
    public static void main(String[] args) {
      //  System.out.println(fibo(6));
        System.out.println(sumOfDigit(-10));
    }

    private static int sumOfDigit(int n) {
        if (n<0){
            return 0;
        }
        if((n<10)&&(n>0)){
            return n;
        }
        else {
            return n%10+sumOfDigit(n/10);
        }
    }

    static int fibo(int n){
        if (n<0){
            return -1;
        }
        if ((n==0)||(n==1)){
            return n;
        }
        else {
            n=fibo(n-1)+fibo(n-2);
        }
        return n;
    }

}
