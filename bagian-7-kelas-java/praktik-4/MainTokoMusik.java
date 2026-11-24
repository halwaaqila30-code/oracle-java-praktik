class Instrument {
    protected String namaAlat;
    protected double harga;
    protected boolean onSale;

    public Instrument(String namaAlat, double harga, boolean onSale) {
        this.namaAlat = namaAlat;
        this.harga = harga;
        this.onSale = onSale;
    }

    public double getPrice() {
        double hargaAkhir = harga;
        if (onSale) {
            hargaAkhir = hargaAkhir * 0.85; // 15% lebih murah saat onSale
        }
        return hargaAkhir;
    }

    public double getEmployeePrice() {
        return getPrice() * 0.75; // diskon karyawan 25% (75% dari harga)
    }
}

class StringInstrument extends Instrument {
    protected int jumlahSenar;

    public StringInstrument(String namaAlat, double harga, boolean onSale, int jumlahSenar) {
        super(namaAlat, harga, onSale);
        this.jumlahSenar = jumlahSenar;
    }

    public int getJumlahSenar() {
        return jumlahSenar;
    }
}

class Guitar extends StringInstrument {
    private String tipeBody;

    public Guitar(String namaAlat, double harga, boolean onSale, int jumlahSenar, String tipeBody) {
        super(namaAlat, harga, onSale, jumlahSenar);
        this.tipeBody = tipeBody;
    }

    public String getTipeBody() {
        return tipeBody;
    }
}

public class MainTokoMusik {
    public static void main(String[] args) {
        Guitar gitar1 = new Guitar("Akustik Seri A", 1000.0, true, 6, "Dreadnought");
        System.out.println("Alat: " + gitar1.namaAlat + " (" + gitar1.getTipeBody() + ", " + gitar1.getJumlahSenar() + " senar)");
        System.out.println("Harga setelah aturan getPrice(): " + gitar1.getPrice());
        System.out.println("Harga diskon karyawan (25%): " + gitar1.getEmployeePrice());
    }
}