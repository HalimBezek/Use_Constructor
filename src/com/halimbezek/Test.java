package com.halimbezek;

public class Test {
	
	public static void main(String[] args) {
		
		Account account1 = new Account();//bu yap� ile bo� constructor �a�r�lm�� olur 
		/*
		 * asl�nda java da her class�n bir contructoru vard�r. e�er �zelle�tirmek istersek biz yazar�z
		 * 
		 * */
	   Account account2 = new Account("12345",5000.0,"halimbezek","halilm@gmail.com","0564654984");//cons �a��r�ld�
	   
	   account2.paraYatir(1000.0);//fonksiyonlar da  �al��t�r�ld�.
	   account2.paraCekme(16000.0);  	   
		
	   account2.verileri_yazdir();
	}

}
