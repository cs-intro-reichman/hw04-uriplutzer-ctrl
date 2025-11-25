public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code
        int n = Integer.parseInt(args[0]);
        boolean[] allNums = new boolean[n + 1];
        allNums[0] = false;
        allNums[1] = false;

        for (int i = 2; i < allNums.length; i++) {
            allNums[i] = true;
        }

        int prime = 2;

        while (prime <= Math.sqrt(n)) {

            int i = prime;

            while (i < allNums.length) {
                if (i != prime && i % prime == 0) {
                    allNums[i] = false;

                }

                i++;
            }

            for (int j = prime + 1; j < allNums.length; j++) {
                if (allNums[j] == true) {

                    prime = j;
                    break;
                }
            }

        }

        System.out.println("Prime numbers up to " + n + ":");

        int count = 0;

        for (int i = 0; i < allNums.length; i++) {
            if (allNums[i] == true) {
                System.out.println(i);
                count++;
            }
        }

        double percentage = Math.floor(count * 100 / n);

        System.out.println(
                "There are " + count + " primes between 2 and " + n + " (" + (int) percentage + "% are primes)");
    }

}
