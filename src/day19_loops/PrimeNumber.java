package day19_loops;

public class PrimeNumber {
    public static void main(String[] args) {
        /*
        Prime number

Give a number determine if it is a prime number. A prime number is a number that is only divisible by 1 and itself.
prime number is the number that divisible only by 1 and itself(ex: 2/ 1 && 2/ 2; 3/1 && 3/3)
not prime:(4/1 && 4/2 && 4/4) --> not prime
Ex:
	Input:
		11

	Output:
		prime


Ex:
	Input:
		10

	Output:
		not prime

         */
        int num = 10;
       boolean isPrime = true;
        for (int i = 2; i < num ; i++) {
            if (num % i == 0){
                isPrime = false;

            }

        }
        System.out.println(isPrime ? "Prime" : "Not prime");
    }

}
