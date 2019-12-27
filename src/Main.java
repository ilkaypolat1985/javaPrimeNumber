public class Main {

    public static void main(String[] args) {
	    int number = 4;

	 	if(isPrimeNumber(number)){
			System.out.println(number + " is a prime number!");
		}else{
			System.out.println(number + " is not a prime number!");
		}
    }

    public static boolean isPrimeNumber(int number){

    	if(number < 2) return false;

    	for(int i = 2; i < number/2; i++){
			if(number % i == 0){
				System.out.println(number + " is not a prime number!");
				return false;
			}
		}

		return true;
	}

}
