package io.stream;

import java.util.ArrayList;
import java.util.List;

public class PrimeNuberArray {

	public static void main(String[] args) {

		List<Integer> primeNum = new ArrayList<>();
		int findPNum = 0;
		
		for(int i = 2; i < 20 ; i++){
			
			if(i == 2){
				primeNum.add(i);
			}else{
				
				for(int pNum : primeNum){
					if(i%pNum==0){
						break;
					}else if(pNum==primeNum.get(primeNum.size()-1)){
						findPNum = i;
					}
				}
				
				if(findPNum!=0){
					primeNum.add(findPNum);
					findPNum = 0;
				}
				
			}
			
		}
		
		primeNum.forEach(System.out::println);
	}

}
