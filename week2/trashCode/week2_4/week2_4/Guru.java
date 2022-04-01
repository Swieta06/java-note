package week2.trashCode.week2_4.week2_4;

import week2.trashCode.Hewan;

public class Guru extends Person {
    @Override
    public void kerjaUjian() {
        System.out.println("Guru pantau ujian");
    }

    @Override
    public String printNama() {
        return "print nama dari guru";
    }

    static class GuruTk {
        public void printGuruTk() {
            System.out.println("Hello guru tk");
        }
    }
    class GuruSd {
        public void printGuruSd() {
            System.out.println("Hello guru sd");
        }
    }
}
