package model;

public abstract class Bantuan {
    protected Donatur donatur;

    public Bantuan(Donatur donatur) {
        this.donatur = donatur;
    }

    public abstract String getDetail();
}
