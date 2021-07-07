package uts.syahrulalrasyid;

public class PertemuanSatusdEmpat {

    public PertemuanSatusdEmpat() {
    }

    void url() {
        System.out.println("https://sites.google.com/view/syahrul-al-rasyid/pertemuan/pertemuan-1-4");
    }

    void pertemuanSatu() {
        System.out.println("Pengenalan Java");
        System.out.println("Java adalah bahasa pemrograman yang dapat dijalankan di berbagai komputer termasuk telepon genggam. Bahasa ini awalnya dibuat oleh James Gosling saat masih bergabung di Sun Microsystems, yang saat ini merupakan bagian dari Oracle dan dirilis tahun 1995. Bahasa ini banyak mengadopsi sintaksis yang terdapat pada C dan C++ namun dengan sintaksis model objek yang lebih sederhana serta dukungan rutin-rutin aras bawah yang minimal. Aplikasi-aplikasi berbasis java umumnya dikompilasi ke dalam p-code (bytecode) dan dapat dijalankan pada berbagai Mesin Virtual Java (JVM). Java merupakan bahasa pemrograman yang bersifat umum/non-spesifik (general purpose), dan secara khusus didesain untuk memanfaatkan dependensi implementasi seminimal mungkin. Karena fungsionalitasnya yang memungkinkan aplikasi java mampu berjalan di beberapa platform sistem operasi yang berbeda, java dikenal pula dengan slogannya, \"Tulis sekali, jalankan di mana pun\". Saat ini java merupakan bahasa pemrograman yang paling populer digunakan, dan secara luas dimanfaatkan dalam pengembangan berbagai jenis perangkat lunak aplikasi ataupun aplikasi");
    }

    void pertemuanDua(){
        System.out.println("Dasar Pemrograman");
        System.out.println("Macam-macam Tipe Data");
        System.out.println("Berikut ini macam-macam tipe data pada Java:");
        System.out.println("-\tchar: Tipe data karakter, contoh Z");
        System.out.println("-\tint: angka atau bilangan bulat, contoh 29");
        System.out.println("-\tfloat: bilangan desimal, contoh 2.1");
        System.out.println("-\tdouble: bilangan desimal juga, tapi lebih besar kapasistanya, contoh 2.1");
        System.out.println("-\tString: kumpulan dari karakter yang membentuk teks, contoh Hello World!");
        System.out.println("-\tboolean: tipe data yang hanya bernilai true dan false");
    }

    void pertemuanTiga(){
        System.out.println("Input & Output");
        System.out.println("Stream Standar");
        System.out.println("Pada Java, sama seperti pada bahasa pemrograman lainnya, memiliki dukungan untuk standar I/O. Ini berguna ketika user memberikan input melalui keyboard dan kemudian menghasilkan output melalui layar komputer. Java memiliki 3 standar streams, yaitu:");
        System.out.println("-\tSystem.in menangani pembacaan dari keyboard (standar input)");
        System.out.println("-\tSystem.out mengirimkan keluaran ke layar (standar output)");
        System.out.println("-\tSystem.err mengirimkan kesalahan (standar error).");
        System.out.println("");
        System.out.println("Metode input berbasis Console");
        System.out.println("Java sendiri sudah menyediakan tiga class untuk mengambil input berbasis console, yaitu:");
        System.out.println("");
        System.out.println("-\tScanner Class kelas scanner berada di java.util dan digunakan untuk mendapatkan input dari keyboard dan dari seluruh file");
        System.out.println("-\tBufferedReader Class kelas ini berada di java.io dan digunakan untuk mendapatkan input dari keyboard berbasis console");
        System.out.println("-\tConsole Class sama seperti kelas BufferedReader, kelas Console juga berada di java.io dan digunakan untuk mendapatkan input dari keyboard.");
        System.out.println("");
        System.out.println("Membaca Input dari Keyboard");
        System.out.println("Dalam tutorial ini kita akan menggunakan Scanner Class (java.util.Scanner) dengan method sebagai berikut:");
        System.out.println("-\tnextInt() untuk menerima tipe data integer");
        System.out.println("-\tnextShort() untuk menerima tipe data short");
        System.out.println("-\tnextLong() untuk menerima tipe data long");
        System.out.println("-\tnextDouble() untuk menerima tipe data double");
        System.out.println("-\tnextFloat() untuk menerima tipe data float");
        System.out.println("-\tnextLine() untuk menerima tipe data string");
        System.out.println("-\tnextBoolean() untuk menerima tipa data boolean.");
    }

    void pertemuanEmpat(){
        System.out.println("Struktur Kontrol");
        System.out.println("1.Percabangan IF");
        System.out.println("2.Percabangan IF/ELSE");
        System.out.println("3.Percabangan IF/ELSE/IF dan SWITCH/CASE");
        System.out.println("4.Percabangan dalam Percabangan (Nested)");
    }
}
