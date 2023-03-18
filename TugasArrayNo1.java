import java.util.Scanner;

public class TugasArrayNo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah data: ");
        int jumlahData = input.nextInt();
        
        double totalNilai = 0;
        
        System.out.println("________________________________");
        
        for (int i = 1; i <= jumlahData; i++) {
            System.out.println("Mahasiswa Ke : " + i);
            
            System.out.print("Nama: ");
            String nama = input.next();
            
            System.out.print("Nilai: ");
            int nilai = input.nextInt();
            
            totalNilai += nilai;
            
            System.out.println("________________________________");
        }
        
        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("================================");
        System.out.println("No\tNama\tNilai\tStatus");
        
        double rataRata = totalNilai / jumlahData;
        int nomor = 1;
        
        for (int i = 1; i <= jumlahData; i++) {
            System.out.print(nomor + "\t");
            nomor++;
            
            String nama = input.next();
            System.out.print(nama + "\t");
            
            int nilai = input.nextInt();
            System.out.print(nilai + "\t");
            
            if (nilai >= rataRata) {
                System.out.println("Lulus");
            } else {
                System.out.println("Tidak Lulus");
            }
        }
        
        System.out.println("================================");
        System.out.println("Jumlah: " + totalNilai);
        System.out.println("Nilai Rata-rata: " + rataRata);
    }
}