public class mataKuliah16 {
    String kodeMK;
    String namaMK;
    int sks;
    dosen16[] dosenPengampu;

    //Konstruktor untuk menginisialisasi semua atribut
    public mataKuliah16(String kodeMK, String namaMK, int sks, dosen16[] dosenPengampu) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
        this.dosenPengampu = dosenPengampu;
    }
    //tampilkanInfo() untuk menampilkan informasi Mata Kuliah beserta dosen pengampunya
    public void tampilkanInfo() {
        System.out.println("Kode MK     : " + kodeMK);
        System.out.println("Nama MK     : " + namaMK);
        System.out.println("SKS         : " + sks);
        System.out.println("Dosen Pengampu:");
        for (dosen16 dosen : dosenPengampu) {
            dosen.tampilkanInfo();
            System.out.println("-------------------");
        }
    }
    //ubahNamaMK(String namaMKBaru) untuk mengubah atribut nama mata kuliah
    public void ubahNamaMK(String namaMKBaru) {
        this.namaMK = namaMKBaru;
    }
    //ubahSKS(int SKS) untuk mengubah atribut SKS, di dalamnya terdapat pengecekkan untuk memvalidasi jumlah SKS hasil perubahan. Jumlah SKS hasil perubahan harus minimal 2 SKS (tidak boleh kurang dari 2)
    public void ubahSKS(int sksBaru) {
        if (sksBaru >= 2) {
            this.sks = sksBaru;
        } else {
            System.out.println("Jumlah SKS harus minimal 2. Perubahan SKS gagal.");
        }
    }
    // tambahDosen(Dosen dosen) untuk menambahkan dosen yang mengampu
    public void tambahDosen(dosen16 dosen) {
        dosen16[] dosenBaru = new dosen16[dosenPengampu.length + 1];
        for (int i = 0; i < dosenPengampu.length; i++) {
            dosenBaru[i] = dosenPengampu[i];
        }
        dosenBaru[dosenPengampu.length] = dosen;
        this.dosenPengampu = dosenBaru;
        System.out.println("Dosen berhasil ditambahkan.");
    }
}