package uts.syahrulalrasyid;

public class PertemuanSebelassdDuaBelas implements InterfaceSebelassdDuaBelas {
    int kecepatan, gir;
    String judul, pengarang, penerbit, tahun;
    int statusAC;
    int suhuAwal = SuhuAwal;
    int suhuAkhir;
    int statusLampu;

    public PertemuanSebelassdDuaBelas() {
    }

    void studyCaseOneSebelas() {
        kecepatan = 10;
        gir = 2;

        tambahKecepatan(30);
        ubahGir(3);
    }

    void studyCaseTwoSebelas() {
        pertambahan(20, 20);
        pengurangan(10, 5);
        perkalian(10, 20);
        pembagian(21, 2);
    }

    void studyCaseThreeSebelas() {
        judul = "Teach Yourself Java 6 in 21 Days";
        pengarang = "Rogers Cadenhead & Laura Lemay";
        penerbit = "Sams Publishing";
        tahun = "2007";
        cetakBuku();

        judul = "Java How to Program 7th Edition";
        pengarang = "Deitel & Deitel";
        penerbit = "Prentice Hall";
        tahun = "2007";
        cetakBuku();
    }

    void studCaseOneDuaBelas() {
        // LAMPU
        System.out.println("Status Lampu Saat Ini: Mati");
        hidupkan("LAMPU");
        matikan("LAMPU");
        matikan("LAMPU");
        hidupkan("LAMPU");
        hidupkan("LAMPU");
    }

    void studCaseTwoDuaBelas() {
        // AC
        matikan("AC");
        hidupkan("AC");
        dinginkan(4);
        panaskan(1);
    }


    void ubahGir(int pertambahanGir) {
        gir = gir + pertambahanGir;
        System.out.println(" Gir: " + gir);
    }

    void tambahKecepatan(int pertambahanKecepatan) {
        kecepatan = kecepatan + pertambahanKecepatan;
        System.out.println(" Kecepatan: " + kecepatan);
    }

    void pertambahan(int a, int b) {

        System.out.println("pertambahan : " + a + " + " + b + " = " + (a + b));
    }

    void pengurangan(int a, int b) {
        System.out.println("pengurangan : " + a + " + " + b + " = " + (a - b));
    }

    void perkalian(int a, int b) {
        System.out.println("perkalian : " + a + " + " + b + " = " + (a * b));
    }

    void pembagian(int a, int b) {
        System.out.println("pembagian : " + a + " + " + b + " = " + (a / b));
    }

    void cetakBuku() {
        System.out.println(pengarang + ", " + judul + ", " + penerbit + ", " + tahun);
    }

    @Override
    public void hidupkan(String alat) {
        if (alat.toUpperCase() == AlatLampu) {
            if (this.statusLampu == KeadaanMati) {
                this.statusLampu = KeadaanHidup;
                System.out.println("Hidupkan Lampu! --> Lampu Hidup");

            } else {
                System.out.println("Hidupkan Lampu! --> Lampu Sudah Hidup Kok");
            }
        }
        if (alat.toUpperCase() == AlatAc) {
            if (this.statusAC == KeadaanMati) {
                this.statusAC = KeadaanHidup;
                System.out.println("Hidupkan AC! --> AC Hidup");

            } else {
                System.out.println("Hidupkan AC! --> AC Sudah Hidup Kok");
            }
        }
    }

    @Override
    public void matikan(String alat) {
        if (alat.toUpperCase() == AlatLampu) {
            if (this.statusAC == KeadaanHidup) {
                this.statusAC = KeadaanMati;
                System.out.println("Matikan AC! --> AC Mati");

            } else {
                System.out.println("Matikan AC! --> AC Sudah Mati Kok");
            }
        }
        if (alat.toUpperCase() == AlatAc) {
            if (this.statusLampu == KeadaanHidup) {
                this.statusLampu = KeadaanMati;
                System.out.println("Matikan Lampu! --> Lampu Mati");

            } else {
                System.out.println("Matikan Lampu! --> Lampu Sudah Mati Kok");
            }
        }
    }

    @Override
    public void dinginkan(int suhu) {
        suhuAkhir = suhuAwal - suhu;
        if (suhuAkhir < MinSuhu) {
            System.out.println("Suhu akhir tidak boleh lebih kecil dari 16C");
        } else {
            System.out.printf("Suhu berhasil di dinginkan, suhu awal %dC, suhu akhir %dC +%dC\n", suhuAwal, suhuAkhir, suhu);
            suhuAwal = suhuAkhir;
        }
    }

    @Override
    public void panaskan(int suhu) {
        suhuAkhir = suhuAwal + suhu;
        if (suhuAkhir > MaxSuhu) {
            System.out.println("Suhu akhir tidak boleh lebih besar dari 30C");
        } else {
            System.out.printf("Suhu berhasil di di panaskan, suhu awal %dC, suhu akhir %dC, +%dC\n", suhuAwal, suhuAkhir, suhu);
            suhuAwal = suhuAkhir;
        }
    }
}
