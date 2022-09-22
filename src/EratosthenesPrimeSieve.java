public class EratosthenesPrimeSieve implements PrimeSieve {

    private int max;

    public EratosthenesPrimeSieve(int max){
        this.max = max;
    }

    public boolean isPrim(int p){

        boolean primNumber =true;

        while(p>0){

            if(p%2==0){
                primNumber=false;

            }
            else if(p%3==0){
                primNumber=false;

            }

        }return primNumber;

    }
    public void printPrimes(){
        for (int i = 1; i < max; i++) {
            if (isPrim(i)) System.out.println(i);
        }
    }
}
