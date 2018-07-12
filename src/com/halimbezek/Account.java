package com.halimbezek;

public class Account {
	
	/*bir hesaba ait bilgiler olduğunu düşünelim*/
	private String hesap;
	private Double bakiye;
	private String isim;
	private String email;
	private String telefonNo;
	
	public Account() {
		// asılında bos constractor java kendisi oluşturur.farklı parametrelerde birden fazla yazışablir 
	
		this("Bilgi yok",0.00,"Bilgi yok","Bilgi yok","Bilgi yok");//default olarak ilk çalıştırıldığında değer aaatanmış oldu.
		
		System.out.println("Boş contructor çalışıyor");
		
		
	}
	
	
	public Account(String hesap, Double bakiye, String isim, String email, String telefonNo) {
		/*kullanılan yerlerde değerler alınıp buradaki değişkenlere atarız*/
		super();
		this.hesap = hesap;
		this.bakiye = bakiye;
		this.isim = isim;
		this.email = email;
		this.telefonNo = telefonNo;
		
		System.out.println("değişken değeri alan cons: " + hesap+"/" + bakiye +"/" + isim +"/" +email +"/" +telefonNo);
		
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
			System.out.println("1500 den fazla parayı bir anda çekemezsiniz.");
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
