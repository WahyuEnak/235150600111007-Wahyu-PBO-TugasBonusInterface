public class Main {
    public static void main(String[] args) {
        // Membuat instance dari masing-masing konkret class
        Mahasiswa mahasiswa = new Mahasiswa("Slamet Kopling", 20, true, "123456789", 3.5, 1);
        Dosen dosen = new Dosen("Farhan Kebab", 35, true, "101010", 5000.0);
        Resepsionis resepsionis = new Resepsionis("Lucinta Luna", 25, false, 1001, "Front Desk");

        // Memanggil metode dari masing-masing instance
        mahasiswa.makanDiKantin("Kantin GKM");
        dosen.mengajar("PBO");
        resepsionis.melayani();

        // Menerapkan konsep upcasting pada instance konkret
        Civitas upcastedMahasiswa = new Mahasiswa("Bocchi Oli Samping", 22, false, "987654321", 3.8, 2);
        Civitas upcastedDosen = new Dosen("Sigit Rendang", 40, true, "202020", 7000.0);
        Civitas upcastedResepsionis = new Resepsionis("Wahyu Enak", 28, true, 1002, "Reception");

        // Memanggil metode yang didefinisikan di superclass Civitas
        upcastedMahasiswa.naikLift();
        upcastedDosen.mainGameCorner();
        upcastedResepsionis.makanDiKantin("Kantin Griya UB");
    }
}
