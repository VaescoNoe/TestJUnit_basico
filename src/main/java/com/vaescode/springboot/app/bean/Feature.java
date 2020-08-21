package com.vaescode.springboot.app.bean;

public class Feature {
	
	public int multiplicar(int numA, int numB) {
		return numA*numB;
	}
	
	
	public boolean isNull(int resultado) {
		return (resultado%2 == 0)?true:false;
	}

}
