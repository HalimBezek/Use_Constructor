package com.halimbezek;

public class Account {
	
	/*bir hesaba ait bilgiler oldu�unu d���nelim*/
	private String hesap;
	private Double bakiye;
	private String isim;
	private String email;
	private String telefonNo;
	
	public Account() {
		// as�l�nda bos constractor java kendisi olu�turur.farkl� parametrelerde birden fazla yaz��ablir 
	
		this("Bilgi yok",0.00,"Bilgi yok","Bilgi yok","Bilgi yok");//default olarak ilk �al��t�r�ld���nda de�er aaatanm�� oldu.
		
		System.out.println("Bo� contructor �al���yor");
		
		
	}
	
	
	public Account(String hesap, Double bakiye, String isim, String email, String telefonNo) {
		/*kullan�lan yerlerde de�erler al�n�p buradaki de�i�kenlere atar�z*/
		super();
		this.hesap = hesap;
		this.bakiye = bakiye;
		this.isim = isim;
		this.email = email;
		this.telefonNo = telefonNo;
		
		System.out.println("de�i�ken de�eri alan cons: " + hesap+"/" + bakiye +"/" + isim +"/" +email +"/" +telefonNo);
		
	}

	public void verileri_yazdir() {
		System.out.println("Hesap : " + this.getHesap());
		System.out.println("isim : " + this.getIsim());
		System.out.println("email : " + this.getEmail());
		System.out.println("telefon : " + this.getTelefonNo());
		System.out.println("Bakiye : " + this.getBakiye());
		
	}


	public void paraYatir(Double miktar)
	{
		bakiye += miktar;
		System.out.println("Yeni bakiye : " + bakiye);
	}
	
	public void paraCekme(Double miktar)
	{
		if(miktar > 1500)
			System.out.println("1500 den fazla paray� bir anda �ekemezsiniz.");
		if(bakiye - miktar < 0)
			System.out.println("Yeterli bakiye yok bakiye:" + bakiye);
		else
		{
			bakiye -= miktar;
			System.out.println("kalan bakiye : " + bakiye);
		}
		
	}
	
	public String getHesap() {
		return hesap;
	}
	public void setHesap(String hesap) {
		this.hesap = hesap;
	}
	public Double getBakiye() {
		return bakiye;
	}
	public void setBakiye(Double bakiye) {
		this.bakiye = bakiye;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefonNo() {
		return telefonNo;
	}
	public void setTelefonNo(String telefonNo) {
		this.telefonNo = telefonNo;
	}

}
