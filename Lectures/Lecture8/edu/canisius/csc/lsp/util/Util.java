package edu.canisius.csc.lsp.util;

import java.util.Random;

public class Util{

	private static final Random RANDOM = new Random();

	
	public static int randomInt(){
		return RANDOM.nextInt();
	}

}