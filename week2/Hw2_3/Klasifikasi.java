package week2.Hw2_3;
//parent
public abstract class Klasifikasi {
    //1.inisialisasi fields
    public String Hewan;
    public int NumberOfLegs;
    public String FavoriteFood;
    //2.getter setter
    public String getHewan() {
        return Hewan;
    }

    public void setHewan(String hewan) {
        Hewan = hewan;
    }

    public int getNumberOfLegs() {
        return NumberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        NumberOfLegs = numberOfLegs;
    }

    public String getFavoriteFood() {
        return FavoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        FavoriteFood = favoriteFood;
    }
    //3.constructor
    public Klasifikasi(String Hewan, int NumberOfLegs, String FavoriteFood ){
        this.Hewan=Hewan;
        this.NumberOfLegs=NumberOfLegs;
        this.FavoriteFood=FavoriteFood;

    }
    //4.return value
    public String names(){
        return this.Hewan;
    }
    public int ages(){
        return this.NumberOfLegs;
    }
    public String foods(){
        return this.FavoriteFood;
    }

}
