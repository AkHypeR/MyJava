public class practice {
    public static void isEvenNumber(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " is Even Number ");
        } else {
            System.out.println(n + " is odd Number ");
        }
    }
    public static void sumDigit(int n){
        int sum=0;
        if ((n>10)&&(n<100)){
            for (int i=1;i<n;i++){
                sum+=i;
            }
            System.out.println("Sum of the number ="+sum);
        }
        else if ((n>=100)&&(n<1000)) {
            while(n>0) {
                int digit= n % 10;
                sum+=digit;
                n/= 10;

            }
            System.out.println("Sum of the number = "+sum);

        } else if (n<10) {
            System.out.println("Sum of the number =-1");
        }
    }

    public static <string> void main(String[] args) {
  //      sumDigit(125);
//        int number = 0;
//        int totalnumber = 20;
//        while (number <= totalnumber) {
//            number++;
//            if (number % 2 == 0) {
//                continue;
//            }
//            isEvenNumber(number);
//        }
//        int count = 2;
//        while (true) {
//            count++;
//            if (count < 5) {
//                System.out.println("the skipping number is =" + count);
//                continue;
//            }
//            System.out.println("the main number =" + count);
//            if (count > 12) {
//                System.out.println("the skipping number is =" + count);
//                break;
//            }
//
//        }
        //Car bmw=new Car();
//        bmw.setColour("pink");
//        System.out.println(bmw.getColour());
//      String numberAsString="125";
//      String sum2=numberAsString+5;
//        System.out.println(sum2);
//
//        int number=Integer.parseInt(numberAsString);
//       int sum= number+5;
//        System.out.println(sum);
        Bank sbi=new Bank(7856,"Akash",78562.52,"Akash@gmail.com");
        System.out.println(sbi.getCustomerAccNumber());
        System.out.println(sbi.getCustomerName());
        System.out.println(sbi.getBalance());
        System.out.println(sbi.getEmail());
        sbi.deposite(550);
        sbi.withdraw(2000);

        Vipcustomer vip=new Vipcustomer("sushi",85,"Sushi@gmail.com");
        System.out.println(vip.getCreditLimit()+" "+vip.getName()+" "+vip.getEmail());

    }
}
