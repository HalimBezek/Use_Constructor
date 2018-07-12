package com.halimbezek;

public class Test {
	
	public static void main(String[] args) {
		
		Account account1 = new Account();//bu yapý ile boþ constructor çaðrýlmýþ olur 
		/*
		 * aslýnda java da her classýn bir contructoru vardýr. eðer özelleþtirmek istersek biz yazarýz
		 * 
		 * */
	   Account account2 = new Account("12345",5000.0,"halimbezek","halilm@gmail.com","0564654984");//cons çaðýrýldý
	   
	   account2.paraYatir(1000.0);//fonksiyonlar da  çalýþtýrýldý.
	   account2.paraCekme(16000.0);  	   
		
	   account2.verileri_yazdir();
	}

}
