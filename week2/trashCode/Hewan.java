package week2.trashCode;

public abstract class Hewan {
    protected String namaHewan;
    protected int NumberOfLeg;
    protected String faVoritFood;

   public int getNumberOfLeg(int i) {
        return NumberOfLeg;
    }

    public String getFaVoritFood() {
        return faVoritFood;
    }

    public void setFaVoritFood(String faVoritFood) {
        this.faVoritFood = faVoritFood;
    }

    public void setNumberOfLeg(int numberOfLeg) {
        NumberOfLeg = numberOfLeg;
    }

    public String getNamaHewan() {
        return namaHewan;

    }

    public void setNamaHewan(String namaHewan) {
        this.namaHewan = namaHewan;

    }
}
