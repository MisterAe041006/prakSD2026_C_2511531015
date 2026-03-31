package pekan1_2511531015;

import java.util.Objects;

public final class Jam_2511531015 implements Comparable<Jam_2511531015> {
    private int hh; // 0..23
    private int mm; // 0..59
    private int ss; // 0..59

    // --- Validator ---
    public static boolean isValid(int h, int m, int s) {
        return (0 <= h && h <= 23) &&
               (0 <= m && m <= 59) &&
               (0 <= s && s <= 59);
    }

    // --- Konstruktor ---
    public Jam_2511531015(int h, int m, int s) {
        if (!isValid(h, m, s)) {
            throw new IllegalArgumentException("Waktu tidak valid");
        }
        this.hh = h;
        this.mm = m;
        this.ss = s;
    }

    // --- Selektor / Getter ---
    public int getHour() {
        return hh;
    }

    public int getMinute() {
        return mm;
    }

    public int getSecond() {
        return ss;
    }

    // --- Mutator / Setter ---
    public void setHour(int h) {
        if (!isValid(h, this.mm, this.ss)) {
            throw new IllegalArgumentException("Jam tidak valid");
        }
        this.hh = h;
    }

    public void setMinute(int m) {
        if (!isValid(this.hh, m, this.ss)) {
            throw new IllegalArgumentException("Menit tidak valid");
        }
        this.mm = m;
    }

    public void setSecond(int s) {
        if (!isValid(this.hh, this.mm, s)) {
            throw new IllegalArgumentException("Detik tidak valid");
        }
        this.ss = s;
    }

    // --- Konversi ---
    public int toSeconds() {
        return hh * 3600 + mm * 60 + ss;
    }

    public static Jam_2511531015 fromSeconds(int total) {
        if (total < 0) {
            throw new IllegalArgumentException("Detik negatif");
        }

        total %= 24 * 3600; // wrap 24 jam
        int h = total / 3600;
        total %= 3600;
        int m = total / 60;
        int s = total % 60;

        return new Jam_2511531015(h, m, s);
    }

    // --- Relasional ---
    @Override
    public int compareTo(Jam_2511531015 other) {
        return Integer.compare(this.toSeconds(), other.toSeconds());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Jam_2511531015 j)) return false;
        return hh == j.hh && mm == j.mm && ss == j.ss;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hh, mm, ss);
    }

    // --- Aritmatika ---
    public Jam_2511531015 plus(Jam_2511531015 other) {
        return fromSeconds(this.toSeconds() + other.toSeconds());
    }

    public Jam_2511531015 minus(Jam_2511531015 other) {
        return fromSeconds(Math.floorMod(this.toSeconds() - other.toSeconds(), 24 * 3600));
    }

    public Jam_2511531015 nextSecond() {
        return fromSeconds(this.toSeconds() + 1);
    }

    public Jam_2511531015 nextNSeconds(int n) {
        return fromSeconds(this.toSeconds() + Math.max(0, n));
    }

    public Jam_2511531015 prevSecond() {
        return fromSeconds(Math.floorMod(this.toSeconds() - 1, 24 * 3600));
    }

    public Jam_2511531015 prevNSeconds(int n) {
        return fromSeconds(Math.floorMod(this.toSeconds() - Math.max(0, n), 24 * 3600));
    }

    // --- Durasi ---
    public static int durasiDetik(Jam_2511531015 awal, Jam_2511531015 akhir) {
        return akhir.toSeconds() - awal.toSeconds();
    }

    // --- Override toString ---
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hh, mm, ss);
    }

    // --- Main untuk uji coba ---
    public static void main(String[] args) {
        Jam_2511531015 a = new Jam_2511531015(10, 20, 30);
        Jam_2511531015 b = new Jam_2511531015(1, 15, 40);

        System.out.println("Jam a           : " + a);
        System.out.println("Jam b           : " + b);
        System.out.println("a ke detik      : " + a.toSeconds());
        System.out.println("a + b           : " + a.plus(b));
        System.out.println("a - b           : " + a.minus(b));
        System.out.println("next 1 second a : " + a.nextSecond());
        System.out.println("next 10 second a: " + a.nextNSeconds(10));
        System.out.println("prev 1 second a : " + a.prevSecond());
        System.out.println("Durasi a ke b   : " + Jam_2511531015.durasiDetik(a, b) + " detik");
        System.out.println("compareTo       : " + a.compareTo(b));
    }
}