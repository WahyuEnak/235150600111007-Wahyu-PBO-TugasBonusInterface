class Mahasiswa extends Civitas implements PesertaKelas {
    String nim;
    double ipk;
    int golUKT;

    public Mahasiswa(String nama, int umur, boolean jenisKelamin, String nim, double ipk, int golUKT) {
        super(nama, umur, jenisKelamin);
        this.nim = nim;
        this.ipk = ipk;
        this.golUKT = golUKT;
    }

    @Override
    public void masukKelas() {
        System.out.println(nama + " masuk kelas");
    }
}
