package uts.syahrulalrasyid;

public interface InterfaceSebelassdDuaBelas {
    public static final String AlatAc = "AC";
    public static final String AlatLampu = "LAMPU";
    public static final int KeadaanHidup = 1;
    public static final int KeadaanMati = 0;

    public static final int SuhuAwal = 23;
    public static final int MinSuhu = 16;
    public static final int MaxSuhu = 30;

    public abstract void hidupkan(String alat);

    public abstract void matikan(String alat);

    public abstract void dinginkan(int suhu);

    public abstract void panaskan(int suhu);
}
