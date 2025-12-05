public class group {
    public static void main(String[] args) {
        long number = 600851475143L;
        System.out.print("Largest prime factor of " + number + " is: ");
        long largestFactor = 1;
        for (long i = 2; i <= number / i; i++) {
            while (number % i == 0) {
                if (i > largestFactor) {
                    largestFactor = i;
                }
                number /= i;
            }
        }
        if (number > 1) {
            if (number > largestFactor) {
                largestFactor = number;
                System.out.println(largestFactor);
            }
            System.out.println(largestFactor);
            
        }
    }
}

    