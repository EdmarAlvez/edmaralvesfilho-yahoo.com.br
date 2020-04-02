package com.projeto.variaveisjava;

public class Variavel {

	//Variaveis
	//Byte - N�meros - 1,2,10
	//Int - N�meros - 100, 25005, 2, 1
	//Long - N�meros - 1000000000, 2, 1
	//Float = Numeros decimais - 1.253, 2.654
	//double - N�meros decimais - 1.54654
	//boolean - valores booleanos treue/false
	//String - textos - "caf�"..
	
	public static void main(String[] args) {
		
		byte minhaVariavelByte = 10;
		int minhaVariavelInt = 10000;
		long minhaVariavelLong = 5000000;
		float minhaVariavelFloat = 1.8f;
		double minhaVariavelDouble = 1.22222;
		boolean minhaVariavelBoolean = true;
		String minhaVariavelString = "Edmar Alves";
		
		
		System.out.println(minhaVariavelByte);
		System.out.println(minhaVariavelInt);
		System.out.println(minhaVariavelLong);
		System.out.println(minhaVariavelFloat);
		System.out.println(minhaVariavelDouble);
		System.out.println(minhaVariavelBoolean);
		System.out.println(minhaVariavelString + minhaVariavelByte );
	}

}
