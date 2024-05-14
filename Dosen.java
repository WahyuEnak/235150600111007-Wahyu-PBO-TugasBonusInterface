class Dosen extends Civitas implements Pengajar {
    String nip;
    double gaji;

    public Dosen(String nama, int umur, boolean jenisKelamin, String nip, double gaji) {
        super(nama, umur, jenisKelamin);
        this.nip = nip;
        this.gaji = gaji;
    }

    @Override
    public void mengajar(String matkul) {
        System.out.println(nama + " mengajar mata kuliah " + matkul);
    }

    @Override
    public void mengasihTugas() {
        System.out.println(nama + " memberikan tugas");
    }

    @Override
    public void menilaiTugas() {
        System.out.println(nama + " menilai tugas");
    }

    public void ikutPenelitian() {
        System.out.println(nama + " ikut penelitian");
    }
}
