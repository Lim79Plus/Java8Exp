package io.stream;

public class PrimeNumber {

	public static void main(String[] args) {

		System.out.println("print prime numbers");
		
		
		for(int i = 2 ; i < 20; i++){
			for(int j = 2; j < i ;j++){
				if(i%j==0){
					break;
				}else if(j ==(i-1)){
					System.out.println(i + " is prime number");
				}
			}
		}
	}
	
}
