public class EratosthenesPrimeSieve implements PrimeSieve {

    private int max;

    public EratosthenesPrimeSieve(int max){
        this.max = max;
    }

    public boolean isPrim(int value){

        if (value <= 2) {
            return (value == 2);
        }
        for (long i = 2; i * i <= value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;

    }
    public void printPrimes(){
        for (int i = 1; i < max; i++) {
            if (isPrim(i)) {
                System.out.println(i);
            }
        }
    }
}
