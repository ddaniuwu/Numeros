package com.ordernumbers.NUmbers;

public class Numeros {
	public void getNumber() {
		  for(int i = 0; i< 1000 ; i++) {
				if(i % 2 == 0) {
					System.out.print(i + " ES PAR\n");
				}
				if(i % 5 == 0) {
					int number = i;
					if(number % 2 == 1) {
						System.out.print(i+" NUMERO ORDINAL\n");
					}
				}		
			  }
	}
}
