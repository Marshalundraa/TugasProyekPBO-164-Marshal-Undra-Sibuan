package model;

public class BantuanUang extends Bantuan {
    private int nominal;

    public BantuanUang(Donatur donatur, int nominal) {
        super(donatur);
        this.nominal = nominal;
    }

    @Override
    public String getDetail() {
        return donatur.getNama() + " menyumbang uang sebesar Rp " + nominal;
    }
}
