package Asd;

public class Proses {
	
	    int varisZamani;
	    int oncelik;
	    int islemSuresi;
	    int bellek;
	    int yaziciSayisi;
	    int tarayiciSayisi;
	    int modemSayisi;
	    int cdSayisi;
	    int prosesSirasi;
	    int MAX_ONCELIK =1;
	    private boolean tamamlandi;
	    
	    // Proses sınıfı kurucusu
	    public Proses(int varisZamani, int oncelik, int islemSuresi, int bellek, 
                int yaziciSayisi, int tarayiciSayisi, int modemSayisi, int cdSayisi, int prosesSirasi) {
      this.varisZamani = varisZamani;
      this.oncelik = oncelik;
      this.islemSuresi = islemSuresi;
      this.bellek = bellek;
      this.yaziciSayisi = yaziciSayisi;
      this.tarayiciSayisi = tarayiciSayisi;
      this.modemSayisi = modemSayisi;
      this.cdSayisi = cdSayisi;
      this.prosesSirasi = prosesSirasi;
  }

	    public void basladi() {
	        System.out.println("Proses " + this + ": Islem basladi.");
	    }

	    public void herSaniye() {
	        System.out.println("Proses " + this + ": Islem devam ediyor.");
	    }

	    public void askiyaAlindi() {
	        System.out.println("Proses " + this + ": Islem askiya alindi.");
	    }

	    public void devamEtti() {
	        System.out.println("Proses " + this + ": Islem devam ediyor.");
	    }

	    public void sonlandi() {
	        System.out.println("Proses " + this + ": Islem sonlandirildi.");
	    }

	    public int getIslemSuresi() {
	        return islemSuresi;
	    }

	    public void setIslemSuresi(int islemSuresi) {
	        this.islemSuresi = islemSuresi;
	    }
	    
	    public int getOncelik() {
	        return this.oncelik;
	    }
	    
	    public void oncelikAzaltma() {
	        if (this.oncelik < MAX_ONCELIK) { // MAX_PRIORITY, maksimum öncelik değeridir.
	            this.oncelik++;
	        }
	    }
}
