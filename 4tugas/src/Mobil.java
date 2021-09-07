public class Mobil extends Kendaraan {
    private long harga;
    protected String namaClass = "Mobil";

    protected void setHarga(String harga) {
        this.harga = Long.parseLong(harga);
        harga = null;
    }

    protected long getHarga() {
        return harga;
    }
}
