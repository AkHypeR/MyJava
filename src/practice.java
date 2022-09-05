public class practice {
    static void recarsion(int n) {
        if (n < 1) {
            System.out.println("n is now less than 1");

        } else {
            recarsion(n - 1);
            System.out.println(n);
        }
    }

    public static void isEvenNumber(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " is Even Number ");
        } else {
            System.out.println(n + " is odd Number ");
        }
    }

    public static void sumDigit(int n) {
        int sum = 0;
        if ((n > 10) && (n < 100)) {
            for (int i = 1; i < n; i++) {
                sum += i;
            }
            System.out.println("Sum of the number =" + sum);
        } else if ((n >= 100) && (n < 1000)) {
            while (n > 0) {
                int digit = n % 10;
                sum += digit;
                n /= 10;

            }
            System.out.println("Sum of the number = " + sum);

        } else if (n < 10) {
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
//        Bank sbi=new Bank(7856,"Akash",78562.52,"Akash@gmail.com");
//        System.out.println(sbi.getCustomerAccNumber());
//        System.out.println(sbi.getCustomerName());
//        System.out.println(sbi.getBalance());
//        System.out.println(sbi.getEmail());
//        sbi.deposite(550);
//        sbi.withdraw(2000);
//
//        Vipcustomer vip=new Vipcustomer("sushi",85,"Sushi@gmail.com");
//        System.out.println(vip.getCreditLimit()+" "+vip.getName()+" "+vip.getEmail());
//        animal an=new animal("cat",52,1);
//        System.out.println(an.getLeg()+"  "+an.getSize()+"  "+an.getName());
//        dog lab=new dog("labrodor",85,22,12,"yes");
//        System.out.println(lab.getTail()+"  "+lab.getName()+"  "+lab.getTeeth());
//    lab.eat("y");
        //recarsion(4);
        int i = 0;
        int power = 1;
        while (i < 2) {
            power *= 2;
            i++;

        }
        // System.out.println(power);
        System.out.println(factoyial(1));
    }

    static int recarsion2(int n) {
        if (n == 0) {
            return 1;
        } else {
            int c = (n* recarsion2(n - 1));//2*1=2  =>  2*
            System.out.println(n);
            return c;
        }

    }
    static int factoyial( int y){
        if (y == 0) {
            return 1;
        } else {
            int c = (y * factoyial(y - 1));//4*3*2*1
            System.out.println(y);
            return c;
        }
    }
}

