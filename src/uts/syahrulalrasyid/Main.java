package uts.syahrulalrasyid;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        int timeSleep = 3 * 1000; // 3 second in ms

        Scanner scan = new Scanner(System.in);
        PertemuanSatusdEmpat pertemuanSatusdEmpat = new PertemuanSatusdEmpat();
        PertemuanLimasdEnam pertemuanLimasdEnam = new PertemuanLimasdEnam(scan);
        PertemuanTujuhsdSepuluh pertemuanTujuhsdSepuluh = new PertemuanTujuhsdSepuluh(scan);
        PertemuanSebelassdDuaBelas pertemuanSebelassdDuaBelas = new PertemuanSebelassdDuaBelas();

        while (true) {
            System.out.println("\nSYAHRUL AL-RASYID");
            System.out.println("191011400371");
            System.out.println("04TPLE007");
            System.out.println("UTS");

            System.out.println("\nMENU");
            System.out.println("1. Tugas Pertemuan 1-4");
            System.out.println("2. Tugas Pertemuan 5-6");
            System.out.println("3. Tugas Pertemuan 7-10");
            System.out.println("4. Tugas Pertemuan 11-12");
            System.out.println("5. Tugas Pertemuan UTS");
            System.out.println("0. Exit");

            System.out.print("\nPilih : ");
            int choice = scan.nextInt();

            switch (choice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    Pilihan1(scan, pertemuanSatusdEmpat, timeSleep);
                    break;
                case 2:
                    Pilihan2(scan, pertemuanLimasdEnam, timeSleep);
                    break;
                case 3:
                    Pilihan3(scan, pertemuanTujuhsdSepuluh, timeSleep);
                    break;
                case 4:
                    Pilihan4(scan, pertemuanSebelassdDuaBelas, timeSleep);
                    break;
                case 5:
                    Pilihan5(timeSleep);
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        }
    }

    static void Pilihan1(Scanner scan, PertemuanSatusdEmpat pse, int timeSleep) throws InterruptedException {
        System.out.println("\nSource : https://sites.google.com/view/syahrul-al-rasyid/pertemuan/pertemuan-1-4");
        int choice;
        boolean tmpStatus = true;
        while (tmpStatus) {
            System.out.println("\n1.Pertemuan 1");
            System.out.println("2.Pertemuan 2");
            System.out.println("3.Pertemuan 3");
            System.out.println("4.Pertemuan 4");
            System.out.print("\nPilih : ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    pse.pertemuanSatu();
                    tmpStatus = false;
                    Thread.sleep(timeSleep);
                    break;
                case 2:
                    pse.pertemuanDua();
                    tmpStatus = false;
                    Thread.sleep(timeSleep);
                    break;
                case 3:
                    pse.pertemuanTiga();
                    tmpStatus = false;
                    Thread.sleep(timeSleep);
                    break;
                case 4:
                    pse.pertemuanEmpat();
                    tmpStatus = false;
                    Thread.sleep(timeSleep);
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        }
    }
    static void Pilihan2(Scanner scan, PertemuanLimasdEnam pse, int timeSleep) throws InterruptedException {
        System.out.println("\nSource : https://sites.google.com/view/syahrul-al-rasyid/pertemuan/pertemuan-5-6");
        int choice;
        boolean tmpStatus = true;
        while (tmpStatus) {
            System.out.println("\n1.Installing Java JDK");
            System.out.println("2.Compile and Running Java");
            System.out.println("3.Simple App");
            System.out.print("\nPilih : ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    pse.installingJavaJDK();
                    tmpStatus = false;
                    Thread.sleep(timeSleep);
                    break;
                case 2:
                    pse.compileAndRunningJava();
                    tmpStatus = false;
                    Thread.sleep(timeSleep);
                    break;
                case 3:
                    pse.simpleApp();
                    tmpStatus = false;
                    Thread.sleep(timeSleep);
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        }
    }
    static void Pilihan3(Scanner scan, PertemuanTujuhsdSepuluh pse, int timeSleep) throws InterruptedException {
        System.out.println("\nSource : https://sites.google.com/view/syahrul-al-rasyid/pertemuan/pertemuan-7-10");
        int choice;
        boolean tmpStatus = true;
        while (tmpStatus) {
            System.out.println("\n1.For loop program");
            System.out.println("2.While loop program");
            System.out.println("3.Do while program");
            System.out.println("4.App");
            System.out.print("\nPilih : ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    pse.forLoopProgram();
                    tmpStatus = false;
                    Thread.sleep(timeSleep);
                    break;
                case 2:
                    pse.whileProgram();
                    tmpStatus = false;
                    Thread.sleep(timeSleep);
                    break;
                case 3:
                    pse.doWhileProgram();
                    tmpStatus = false;
                    Thread.sleep(timeSleep);
                    break;
                case 4:
                    pse.app();
                    tmpStatus = false;
                    Thread.sleep(timeSleep);
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        }
    }
    static void Pilihan4(Scanner scan, PertemuanSebelassdDuaBelas pse, int timeSleep) throws InterruptedException {
        System.out.println("\nSource : https://sites.google.com/view/syahrul-al-rasyid/pertemuan/pertemuan-11-12");
        int choice;
        boolean tmpStatus = true;
        while (tmpStatus) {
            System.out.println("\n1.Pertemuan 11 study case 1");
            System.out.println("2.Pertemuan 11 study case 2");
            System.out.println("3.Pertemuan 11 study case 3");
            System.out.println("4.Pertemuan 12 study case 1");
            System.out.println("5.Pertemuan 12 study case 2");
            System.out.print("\nPilih : ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    pse.studyCaseOneSebelas();
                    tmpStatus = false;
                    Thread.sleep(timeSleep);
                    break;
                case 2:
                    pse.studyCaseTwoSebelas();
                    tmpStatus = false;
                    Thread.sleep(timeSleep);
                    break;
                case 3:
                    pse.studyCaseThreeSebelas();
                    tmpStatus = false;
                    Thread.sleep(timeSleep);
                    break;
                case 4:
                    pse.studCaseOneDuaBelas();
                    tmpStatus = false;
                    Thread.sleep(timeSleep);
                    break;
                case 5:
                    pse.studCaseTwoDuaBelas();
                    tmpStatus = false;
                    Thread.sleep(timeSleep);
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        }
    }
    static void Pilihan5(int timeSleep) throws InterruptedException {
        System.out.println("\nSource : https://sites.google.com/view/syahrul-al-rasyid/pertemuan/pertemuan-uts");
        Thread.sleep(timeSleep);
    }
}
