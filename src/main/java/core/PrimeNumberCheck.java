package core;

public class PrimeNumberCheck {
	public Boolean validate (final Integer primeNum){
		for (int i = 2; i <= (primeNum / 2); i++){
			if (primeNum % i == 0){
				return false;
			}
		}
		return true;
	}

}
