package daspro_jobsheet10;
import java.util.Scanner;

public class TugasSurvei17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahResponden = 10;
        int jumlahPertanyaan = 6;
        int[][] hasilSurvey = new int[jumlahResponden][jumlahPertanyaan];

        for (int i = 0; i < jumlahResponden; i++) {
            System.out.println("Responden ke-" + (i + 1));
            for (int j = 0; j < jumlahPertanyaan; j++) {
                System.out.print("Nilai untuk pertanyaan ke-" + (j + 1) + " (1-5): ");
                hasilSurvey[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("Rata-rata nilai per responden:");
        for (int i = 0; i < jumlahResponden; i++) {
            int total = 0;
            for (int j = 0; j < jumlahPertanyaan; j++) {
                total += hasilSurvey[i][j];
            }
            double rata = (double) total / jumlahPertanyaan;
            System.out.println("Responden ke-" + (i + 1) + ": " + rata);
        }

        System.out.println("\nRata-rata nilai per pertanyaan:");
        for (int j = 0; j < jumlahPertanyaan; j++) {
            int total = 0;
            for (int i = 0; i < jumlahResponden; i++) {
                total += hasilSurvey[i][j];
            }
            double rata = (double) total / jumlahResponden;
            System.out.println("Pertanyaan ke-" + (j + 1) + ": " + rata);
        }

        int totalKeseluruhan = 0;
        for (int i = 0; i < jumlahResponden; i++) {
            for (int j = 0; j < jumlahPertanyaan; j++) {
                totalKeseluruhan += hasilSurvey[i][j];
            }
        }

        double rataKeseluruhan = (double) totalKeseluruhan / (jumlahResponden * jumlahPertanyaan);
        System.out.println("\nRata-rata keseluruhan: " + rataKeseluruhan);

        sc.close();
    }
}