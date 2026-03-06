public class dosen16 {
    String nidn;
    String nama;
    int tahunMasuk;
    String jenjangPendidikan;
    String prodi;


    //Konstruktor untuk menginisialisasi semua atribut
    public void dosen16(String nidn, String nama, int tahunMasuk, String jenjangPendidikan, String prodi) {
        this.nidn = nidn;
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.jenjangPendidikan = jenjangPendidikan;
        this.prodi = prodi;
    }
    //tampilkanInfo() untuk menampilkan informasi Dosen
    public void tampilkanInfo() {
        System.out.println("NIDN: " + nidn);
        System.out.println("Nama: " + nama);
        System.out.println("Tahun Masuk     : " + tahunMasuk);
        System.out.println("Jenjang Pendidikan  : " + jenjangPendidikan);
        System.out.println("Program Studi       : " + prodi);
    }
    //ubahProdi() untuk mengubah Program Studi tempat dosen ditugaskan
    public void ubahProdi(String prodiBaru) {
        this.prodi = prodiBaru;
    }
    // ubahPendidikan() untuk mengubah jenjang pendidikan dosen (misal S2, S3)
    public void ubahPendidikan(String jenjangBaru) {
        this.jenjangPendidikan = jenjangBaru;
    }
}