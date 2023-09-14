package classwork.chapter5;
public class FindPrime {
    public static void main(String[] args) { //проверка на простые числа

        int num;
        boolean isPrime;
        num = 14;
        if (num < 2) isPrime = false;
        else isPrime = true;

        for (int i = 2; i <= num / i; i++) { // если число делится на 2, то считается простым,
            if ((num % i) == 0) {             // если написать !=0, то получим нечетное число
                isPrime = false;
                break;
            }
        }
        if (isPrime) System.out.println("Prime");
        else System.out.println(" \nNot Prime ");
    }
}
