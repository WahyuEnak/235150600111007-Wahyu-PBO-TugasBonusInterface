class Civitas {
    String nama;
    int umur;
    boolean jenisKelamin;

    public Civitas(String nama, int umur, boolean jenisKelamin) {
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
    }

    public void makanDiKantin(String kantin) {
        System.out.println(nama + " makan di kantin " + kantin);
    }

    public void mainGameCorner() {
        System.out.println(nama + " main di game corner");
    }

    public void naikLift() {
        System.out.println(nama + " naik lift");
    }
}
