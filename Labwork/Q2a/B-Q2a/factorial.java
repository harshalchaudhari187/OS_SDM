public class factorial {

    public static void main(String[] args) {
        int num = 6;
        System.out.println("Factorial of " + num + " is " + factorial(num));
    }

    public static long factorial(int num) {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
}