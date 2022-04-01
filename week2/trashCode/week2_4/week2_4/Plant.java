package week2.trashCode.week2_4.week2_4;

public class Plant {
    public static void main(String[] args) {
        printTipe("matahari");

        Plant plant = new Plant();
        plant.printNama("matahari");
    }

    public void printNama(String nama) {
        System.out.println("nama = " + nama);
    }

    public static void printTipe(String nama) {
        System.out.println("nama = " + nama);
    }
}
