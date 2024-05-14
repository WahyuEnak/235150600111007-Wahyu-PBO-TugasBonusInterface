class Resepsionis extends Civitas {
    int idResepsionis;
    String jabatan;

    public Resepsionis(String nama, int umur, boolean jenisKelamin, int idResepsionis, String jabatan) {
        super(nama, umur, jenisKelamin);
        this.idResepsionis = idResepsionis;
        this.jabatan = jabatan;
    }

    public void melayani() {
        System.out.println(nama + " melayani tamu");
    }

    public void melapor() {
        System.out.println(nama + " melaporkan keadaan");
    }
}
