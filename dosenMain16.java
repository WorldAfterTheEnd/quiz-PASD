import java.util.Scanner;

public class dosenMain16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dummy;
        //Masukkan jumlah dosen
        dosen16[] dosenList = new dosen16[2];
        for (int i = 0; i < dosenList.length; i++) {
            System.out.println("Masukkan data Dosen ke-" + (i + 1));
            System.out.print("NIDN: ");
            String nidn = scanner.nextLine();
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Tahun Masuk: ");
            int tahunMasuk = scanner.nextInt();
            dummy = scanner.nextLine(); // untuk menangkap newline
            System.out.print("Jenjang Pendidikan: ");
            String jenjangPendidikan = scanner.nextLine();
            System.out.print("Program Studi: ");
            String prodi = scanner.nextLine();

            dosenList[i] = new dosen16();
            dosenList[i].dosen16(nidn, nama, tahunMasuk, jenjangPendidikan, prodi);
        }

        //tampilkan informasi dosen
        System.out.println("=====Informasi Dosen=====");
        for (int i = 0; i < dosenList.length; i++) {
            System.out.println("Dosen ke-" + (i + 1) + ":");
            dosenList[i].tampilkanInfo();
        }

        //ubah prodi dosen
        System.out.print("Masukkan NIDN dosen yang ingin diubah prodi: ");
        String nidnCari = scanner.nextLine();
        for (dosen16 dosen : dosenList) {
            if (dosen.nidn.equals(nidnCari)) {
                System.out.print("Masukkan prodi baru: ");
                String prodiBaru = scanner.nextLine();
                dosen.ubahProdi(prodiBaru);
                System.out.println("Prodi berhasil diubah.");
                break;
            }
        }

        //ubah jenjang pendidikan dosen
        System.out.print("Masukkan NIDN dosen yang ingin diubah jenjang pendidikan: ");
        String nidnCariPendidikan = scanner.nextLine();
        for (dosen16 dosen : dosenList) {
            if (dosen.nidn.equals(nidnCariPendidikan)) {
                System.out.print("Masukkan jenjang pendidikan baru: ");
                String jenjangBaru = scanner.nextLine();
                dosen.ubahPendidikan(jenjangBaru);
                System.out.println("Jenjang pendidikan berhasil diubah.");
                break;
            }
        }
    }
}