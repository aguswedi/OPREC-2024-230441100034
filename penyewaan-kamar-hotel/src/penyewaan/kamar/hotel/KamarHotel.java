package penyewaan.kamar.hotel;

public class KamarHotel {
    String tipeKamar,namaPenyewa;
    int hargaKamar;
    
    public void tipeKamar(){
        System.out.println("masukkan tipe kamar");
    }
    public void namaPenyewa(){
        System.out.println("masukkan nama penyewa");
    }
    
    public void hargaKamar(){
        System.out.println("masukkan harga kamar");
    }
    
    public KamarHotel(){
        System.out.println("============");
        System.out.println("Sewa Kamar");
        System.out.println("============");
        System.out.println("1. Reguler (kapasitas : 1 orang)");
        System.out.println("Harga : Rp.100.000");
        System.out.println("2. Double Reguler (kapasitas : 2 orang)");
        System.out.println("Harga : Rp.200.000");
        System.out.println("3. Premium (kapasitas : 2 orang)");
        System.out.println("Harga : Rp.250.000");
        System.out.println("4. Deluxe (kapasitas : 2 orang)");
        System.out.println("Harga : Rp.350.000");
        System.out.println("5. Super Premium (kapasitas : 2 orang)");
        System.out.println("Harga : Rp.500.000");
    }
    
}
