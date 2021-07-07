package uts.syahrulalrasyid;

import java.util.Scanner;

public class PertemuanTujuhsdSepuluh {
    private final Scanner scan;
    private boolean status;
    private String statusString;

    private String nama;
    private int loopingCounterNama;

    private String peminatanMahasiswa;
    private int loopingCounterPeminatan;

    private float nilaiMahasiwa;
    private int kehadiran;
    private int loopingCounterNilaiMahasiswa;


    public PertemuanTujuhsdSepuluh(Scanner scan) {
        this.scan = scan;
    }

    void forLoopProgram() {
        System.out.println("forLoopProgram");
        String loop;
        for (loop = "Y"; loop.equals("y") || loop.equals("Y"); ) {
            System.out.println("Start");
            System.out.print("apakah andah ingin mengulang [y/t]: ");
            loop = scan.next();
        }
        System.out.println("Finish");
    }

    void whileProgram() {
        System.out.println("whileProgram");
        String whileLoop = "Y";
        while (whileLoop.equals("Y") || whileLoop.equals("y")) {
            System.out.println("Start");
            System.out.print("apakah andah ingin mengulang [y/t]: ");
            whileLoop = scan.next();
        }
        System.out.println("Finish");
    }

    void doWhileProgram() {
        System.out.println("doWhileProgram");
        String doWhileLoop;
        do {
            System.out.println("Start");
            System.out.print("apakah andah ingin mengulang [y/t]: ");
            doWhileLoop = scan.next();
        } while (doWhileLoop.equals("Y") || doWhileLoop.equals("y"));
    }

    void app() {
        while (!status) {
            int choice;
            System.out.println("\nApp Minggu Ke -3");
            System.out.println("1. Input nama mahasiswa");
            System.out.println("2. Input nilai mahasiswa");
            System.out.println("3. Input peminatan mahasiswa");
            System.out.println("4. Exit ...");
            System.out.print("Pilihan : ");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    defineNamaMahasiswa();
                    break;
                case 2:
                    defineNilaiMahasiwa();
                    break;
                case 3:
                    definePeminatanMahasiswa();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Piihan tidak valid");
            }
        }
        System.out.println(printApp());
    }

    public String printApp() {
        return "\nKesimpulan\n" +
                "Nama:\t" + nama + "\n" +
                "Kehadiran:\t" + kehadiran + "\n" +
                "Nilai Akhir:\t" + nilaiMahasiwa + "\n" +
                "Grade:\t" + defineGrade() + "\n" +
                "Peminatan:\t" + peminatanMahasiswa + "\n" +
                "\nCounter looping nama mahasiswa = " + loopingCounterNama +
                "\nCounter looping nilai mahasiswa = " + loopingCounterNilaiMahasiswa +
                "\nCounter looping peminatan mahasiswa = " + loopingCounterPeminatan;
    }

    void defineNamaMahasiswa() {
        System.out.print("Masukan nama mahasiswa: ");
        this.nama = scan.next();

        this.loopingCounterNama++;
        System.out.print("Apakah anda ingin cetak sekarang(y/t): ");
        statusString = scan.next();
        if (statusString.equals("y") || statusString.equals("Y")) {
            status = true;
        }
    }

    void defineNilaiMahasiwa() {
        float jmlKehadiranMahasiswa;
        float realisasiMahasiswa;
        float nilaiKehadiran;
        float nilaiTugasMahasiswa;
        float nilaiUtsMahasiwa;
        float nilaiUasMahasiswa;

        System.out.print("Masukan jumlah kehadiran mahasiwa: ");
        jmlKehadiranMahasiswa = scan.nextFloat();
        this.kehadiran = (int) jmlKehadiranMahasiswa;
        System.out.print("Masukan jumlah realisasi mahasiwa: ");
        realisasiMahasiswa = scan.nextFloat();
        nilaiKehadiran = (float) (jmlKehadiranMahasiswa / realisasiMahasiswa * 0.1);
        System.out.print("Masukan nilai tugas mahasiwa: ");
        nilaiTugasMahasiswa = (float) (scan.nextFloat() * 0.2);
        System.out.print("Masukan nilai uts mahasiwa: ");
        nilaiUtsMahasiwa = (float) (scan.nextFloat() * 0.3);
        System.out.print("Masukan nilai uas mahasiwa: ");
        nilaiUasMahasiswa = (float) (scan.nextFloat() * 0.4);

        this.nilaiMahasiwa = nilaiKehadiran +
                nilaiTugasMahasiswa +
                nilaiUtsMahasiwa +
                nilaiUasMahasiswa;

        this.loopingCounterNilaiMahasiswa++;
        System.out.print("Apakah anda ingin cetak sekarang(y/t): ");
        statusString = scan.next();
        if (statusString.equals("y") || statusString.equals("Y")) {
            status = true;
        }
    }

    void definePeminatanMahasiswa() {
        int choice;
        String loop = "Y";

        System.out.println("1. Pemrograman");
        System.out.println("2. Sistem Informasi");
        System.out.print("Masukan pilihan: ");
        choice = scan.nextInt();
        switch (choice) {
            case 1:
                this.peminatanMahasiswa = "PEMROGRAMAN";
                break;
            case 2:
                this.peminatanMahasiswa = "SISTEM INFORMASI";
                break;
            default:
                System.out.println("Pilihan tidak di temukan");
        }

        this.loopingCounterPeminatan++;
        System.out.print("Apakah anda ingin cetak sekarang(y/t): ");
        statusString = scan.next();
        if (statusString.equals("y") || statusString.equals("Y")) {
            status = true;
        }
    }

    String defineGrade() {
        if (this.nilaiMahasiwa >= 80) {
            return "A";
        }
        if (this.nilaiMahasiwa >= 70 && nilaiMahasiwa < 80) {
            return "B";
        }
        if (this.nilaiMahasiwa >= 60 && nilaiMahasiwa < 70) {
            return "C";
        }
        if (this.nilaiMahasiwa >= 55 && nilaiMahasiwa < 60) {
            return "D";
        }
        return "E";
    }
}
