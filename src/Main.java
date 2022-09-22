import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        EratosthenesPrimeSieve eps = new EratosthenesPrimeSieve(Integer.parseInt(s.nextLine()));
        eps.printPrimes();
    }


}