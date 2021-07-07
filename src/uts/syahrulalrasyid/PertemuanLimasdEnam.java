package uts.syahrulalrasyid;

import java.util.Scanner;

public class PertemuanLimasdEnam {
    private final Scanner scan;
    public PertemuanLimasdEnam(Scanner scan) {
        this.scan = scan;
    }

    void installingJavaJDK() {
        System.out.println("Download Software JDK");
        System.out.println("http://www.google.com/url?q=http%3A%2F%2Fwww.oracle.com%2Ftechnetwork%2Fjava%2Fjavase%2Fdownloads%2Fjdk8-downloads-2133151.html&sa=D&sntz=1&usg=AFQjCNF9OdixZIQRO7jwOBfAUYUH8e3jCA");
        System.out.println("Buka program yang telah di download dengan cara double klik dan kilik Next.");
        System.out.println("Kliki Next hingga masuk ke proses instalasi. Tunggu hingga proses instalasi selesai.");
        System.out.println("Setelah selesai, klik Close untuk menutup proses instalasi.");
        System.out.println("Setelah selesai instalasi, selanjutnya mari setting path JDK. Salin lokasi folder instalasi JDK.");
        System.out.println("Selanjutnya klik kanan pada This PC > pilih Properties.");
        System.out.println("Setelah itu akan muncul Window baru (System) dan pilih Advanced System Settings.");
        System.out.println("Selanjutnya pilih Environment Variables.");
        System.out.println("Pada bagian System Variables cari Path kemudian klik Edit.");
        System.out.println("Maka akan terbuka window baru yaitu Edit System Variable. Arahkan kursor pada box bagian Variable Value dan arahkan kursor kebagian paling kanan. Tambahkan titik koma (;) dan Paste alamat lokasi folder JDK yang telah kita Copy sebelumnya dan klik OK.");
        System.out.println("Setelah itu akan kembali ke Window Environment Variables dan klik OK, setelah itu akan kembali ke windows System Properties dan klik OK kembali.");
    }

    void compileAndRunningJava() {
        System.out.println("javac Latihan4.java");
        System.out.println("java Latiahan4");
    }

    void simpleApp() {
        int pilihan;

        System.out.println("1. percepatan ");
        System.out.println("2. massa jenis");
        System.out.println("3. gaya ");
        System.out.print("Masukan pilian rumus: ");
        pilihan = scan.nextInt();

        if (pilihan == 1) {
            float v;
            float t;
            System.out.print("Masukan nilai v: ");
            v = scan.nextFloat();

            System.out.print("Masukan nilai t: ");
            t = scan.nextFloat();

            System.out.println(percepatan(v, t)+"m/s2");
        }
        else if (pilihan == 2) {
            float v;
            float m;
            System.out.print("Masukan nilai m: ");
            m = scan.nextFloat();

            System.out.print("Masukan nilai v: ");
            v = scan.nextFloat();

            System.out.println(massaJenis(m, v)+"kg/m3");
        }
        else if (pilihan == 3) {
            float m;
            float a;
            System.out.print("Masukan nilai m: ");
            m = scan.nextFloat();

            System.out.print("Masukan nilai a: ");
            a = scan.nextFloat();

            System.out.println(gaya(m, a)+"N");
        }
    }

    static float percepatan(float v, float t) {
        return v/t;
    }

    static float massaJenis(float m, float v) {
        return m/v;
    }

    static float gaya(float m, float a) {
        return m*a;
    }
}
