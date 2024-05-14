class Asprak extends Mahasiswa {
    public Asprak(String nama, int umur, boolean jenisKelamin, String nim, double ipk, int golUKT) {
        super(nama, umur, jenisKelamin, nim, ipk, golUKT);
    }

    public void ngasihKomenDiGCR() {
        System.out.println(nama + " memberikan komentar di GCR");
    }
}
