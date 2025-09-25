package modul_1.tipedata;

public class DataDiri {
    public static void main(String[] args) {
        // Deklarasi variabel
        String nama, alamat, hobi, jurusan, universitas, agama, jenisKelamin;
        int usia, beratBadan;
        double tinggi;

        // Inisialisasi variabel
        nama = "Salwa Iska";
        alamat = "Lhokseumawe";
        usia = 19;
        tinggi = 165.5;
        beratBadan = 45;
        hobi = "Membaca & Coding";
        jurusan = "Teknik Informatika";
        universitas = "Politeknik Negeri Lhokseumawe";
        agama = "Islam";
        jenisKelamin = "Perempuan";

        // Output data
        System.out.println("=== BIODATA MAHASISWA ===");
        System.out.println("Nama         : " + nama);
        System.out.println("Alamat       : " + alamat);
        System.out.println("Usia         : " + usia + " tahun");
        System.out.println("Tinggi       : " + tinggi + " cm");
        System.out.println("Berat Badan  : " + beratBadan + " kg");
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Agama        : " + agama);
        System.out.println("Hobi         : " + hobi);
        System.out.println("Jurusan      : " + jurusan);
        System.out.println("Universitas  : " + universitas);
    }
}
