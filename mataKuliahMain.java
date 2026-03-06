import java.util.Scanner;
public class mataKuliahMain {
//main method untuk menjalankan program dari class mataKuliah16
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dummy;
        mataKuliah16[] mataKuliahList = new mataKuliah16[2];

        for (int i = 0; i < mataKuliahList.length; i++) {
            System.out.println("Masukkan data Mata Kuliah ke-" + (i + 1));
            System.out.print("Kode MK: ");
            String kodeMK = scanner.nextLine();
            System.out.print("Nama MK: ");
            String namaMK = scanner.nextLine();
            System.out.print("SKS: ");
            int sks = scanner.nextInt();
            dummy = scanner.nextLine(); // untuk menangkap newline

            //Masukkan jumlah dosen pengampu untuk mata kuliah ini
            System.out.print("Jumlah Dosen Pengampu: ");
            int jumlahDosen = scanner.nextInt();
            dummy = scanner.nextLine(); // untuk menangkap newline
            dosen16[] dosenPengampu = new dosen16[jumlahDosen];
            for (int j = 0; j < jumlahDosen; j++) {
                System.out.println("Masukkan data Dosen Pengampu ke-" + (j + 1));
                System.out.print("NIDN: ");
                String nidn = scanner.nextLine();
                System.out.print("Nama: ");
                String namaDosen = scanner.nextLine();
                System.out.print("Tahun Masuk: ");
                int tahunMasuk = scanner.nextInt();
                dummy = scanner.nextLine(); // untuk menangkap newline
                System.out.print("Jenjang Pendidikan: ");
                String jenjangPendidikan = scanner.nextLine();
                System.out.print("Program Studi: ");
                String prodi = scanner.nextLine();

                dosenPengampu[j] = new dosen16(nidn, namaDosen, tahunMasuk, jenjangPendidikan, prodi);
            }
            mataKuliahList[i] = new mataKuliah16(kodeMK, namaMK, sks, dosenPengampu);
        }
       
        //menu
        System.out.println("=====Menu=====");
        System.out.println("1. Tampilkan semua mata kuliah");
        System.out.println("2. Ubah nama mata kuliah");
        System.out.println("3. Ubah SKS mata kuliah");
        System.out.println("4. Tambah dosen pengampu mata kuliah");
        System.out.println("0. Keluar");
        System.out.print("Pilih menu: ");
        int pilihan = scanner.nextInt();
        dummy = scanner.nextLine(); // untuk menangkap newline
        switch (pilihan) {
            case 1:
                System.out.println("Daftar Mata Kuliah:");
                for (mataKuliah16 mataKuliah : mataKuliahList) {
                    mataKuliah.tampilkanInfo();
                    System.out.println("-------------------");
                }
                break;
            case 2:
                System.out.print("Masukkan Kode MK yang ingin diubah nama: ");
                String kodeCari = scanner.nextLine();
                mataKuliah16 mataKuliahDitemukan = null;
                for (mataKuliah16 mataKuliah : mataKuliahList) {
                    if (mataKuliah.kodeMK.equals(kodeCari)) {
                        mataKuliahDitemukan = mataKuliah;
                        break;
                    }
                }
                if (mataKuliahDitemukan != null) {
                    System.out.print("Masukkan nama MK baru: ");
                    String namaMKBaru = scanner.nextLine();
                    mataKuliahDitemukan.ubahNamaMK(namaMKBaru);
                    System.out.println("Nama MK berhasil diubah.");
                } else {
                    System.out.println("Mata Kuliah dengan kode tersebut tidak ditemukan.");
                }
                break;
            case 3:
                    System.out.print("Masukkan Kode MK yang ingin diubah SKS: ");
                    String kodeCariSKS = scanner.nextLine();
                    mataKuliah16 mataKuliahDitemukanSKS = null;
                    for (mataKuliah16 mataKuliah : mataKuliahList) {
                        if (mataKuliah.kodeMK.equals(kodeCariSKS)) {
                            mataKuliahDitemukanSKS = mataKuliah;
                            break;
                        }
                    }
                    if (mataKuliahDitemukanSKS != null) {
                        System.out.print("Masukkan SKS baru: ");
                        int sksBaru = scanner.nextInt();
                        dummy = scanner.nextLine(); // untuk menangkap newline
                        mataKuliahDitemukanSKS.ubahSKS(sksBaru);
                    } else {
                        System.out.println("Mata Kuliah dengan kode tersebut tidak ditemukan.");
                    }
                    break;
            case 4:
                    System.out.print("Masukkan Kode MK yang ingin ditambah dosen pengampu: ");
                    String kodeCariDosen = scanner.nextLine();
                    mataKuliah16 mataKuliahDitemukanDosen = null;
                    for (mataKuliah16 mataKuliah : mataKuliahList) {
                        if (mataKuliah.kodeMK.equals(kodeCariDosen)) {
                            mataKuliahDitemukanDosen = mataKuliah;
                            break;
                        }
                    }
                    if (mataKuliahDitemukanDosen != null) {
                        System.out.println("Masukkan data Dosen Pengampu baru");
                        System.out.print("NIDN: ");
                        String nidn = scanner.nextLine();
                        System.out.print("Nama: ");
                        String namaDosen = scanner.nextLine();
                        System.out.print("Tahun Masuk: ");
                        int tahunMasuk = scanner.nextInt();
                        dummy = scanner.nextLine(); // untuk menangkap newline
                        System.out.print("Jenjang Pendidikan: ");
                        String jenjangPendidikan = scanner.nextLine();
                        System.out.print("Program Studi: ");
                        String prodi = scanner.nextLine();
    
                        dosen16 dosenBaru = new dosen16(nidn, namaDosen, tahunMasuk, jenjangPendidikan, prodi);
                        mataKuliahDitemukanDosen.tambahDosen(dosenBaru);
                } else {
                        System.out.println("Mata Kuliah dengan kode tersebut tidak ditemukan.");
                    } break;

            case 0:
                System.out.println("Terima kasih! Program selesai.");
                break;
                }
            }
        }

