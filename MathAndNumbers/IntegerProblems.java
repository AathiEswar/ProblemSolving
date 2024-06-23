package ProblemSolving.MathAndNumbers;

import java.util.Scanner;

public class IntegerProblems {
    public static boolean isPrime(int n){
        if(n<2){
            return false;
        } else if (n==2) {
            return true;
        } else if(n%2==0){
            return false;
        }
        else {
            for (int i = 3; i < Math.sqrt(n); i++) {
                if(n%i == 0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void printPrime(int n){
        for (int i = 1; i <=n ; i++) {
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static int sumOfDig(int n ){
        if(n == 0){
            return 0;
        }
        return (n%10) + sumOfDig(n/10);
    }
    public static void revInt(int n){
        int rev=0;
        while(n!=0){
            int temp= n%10;
            rev = rev * 10 + temp;
            n = n/10;
        }
        System.out.println(rev);
    }
    public static boolean isArmstrong(int n){
        final int len = String.valueOf(n).length();
        int sum = 0;
        final int num = n;
        while(n!=0){
            int temp = n%10;
            sum += (int)Math.pow(temp,len);
            n = n/10;
        }
        if(num == sum){
            return true;
        }
        return false;
    }
    public static void allArmstrong(int n){
        for (int i = 1; i <=n ; i++) {
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }

    }
    public static void fibonacci(int n){
        int a = 0;
        int b = 1;
        System.out.println(a + "\n" + b);
        for (int i = 2; i <=n ; i++) {
            int c = a+b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
    public static int factorial(int n){
        if(n <= 1){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static int power(int base , int expo){

        if ( expo == 0){
            return 1;
        }
        return base*power(base , expo-1);
    }
    public static void factors(int n){
        for(int i = 1;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                if (i == n/i){
                    System.out.println(i+"\n");
                }
                else{
                    System.out.println(i+"\n"+n/i);
                }
            }
        }
    }
    public static void primeFactors(int n){
        for (int i = 2; i <=n ; i++) {
            if(isPrime(i)){
                while(n%i == 0){
                    System.out.println(i+" ");
                    n/= i;
                }
            }
        }
    }
    public static void strongNum(int n){
        int sum = 0;
        int temp = n;
        while(n!=0){
            int r = n%10;
            sum = sum+ factorial(r);
            n = n/10;
        }
        System.out.println(temp +" "+ sum);
        System.out.println((temp== sum)?"Is strong number":"not strong number");
    }
    public static void isAutomorphic(int n){
        //Own code :
//        if(n == Integer.parseInt(String.valueOf(Integer.toString(n*n).charAt(Integer.toString(n*n).length()-1)))){
//            System.out.println("it is automorphic");
//        }
//        else {
//            System.out.println("not automorphic");
//        }
        //easy code :
        System.out.println(((n*n)%10 == n%10)?"is automorphic":"not automorphic");
    }
    public static void isperfect(int n){
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if(n%i == 0){
                sum += i;
            }

        }
        System.out.println((sum == n)?"is perfect":"not perfect");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//        System.out.println(isPrime(num));
//        printPrime(num);
//        System.out.println(sumOfDig(num));
//        revInt(num);
//        allArmstrong(num);
//        fibonacci(num);
//        System.out.println(factorial(num));
//        {
//        int expo = sc.nextInt();
//        System.out.println(power(num,expo));
//        factors(num);'
//        primeFactors(num);
//        strongNum(num);
//        isAutomorphic(num);
        isperfect(num);
    }
    }

