public class WaterBottle {

    private int volume;
    private int water;

    public WaterBottle(int volume, int water){
        this.volume = volume;
        this.water = water;

    }

    public int getVolume(){
        return this.volume;
    }

    public int waterLevel(){
        return this.water;
    }

    public int takeSip(){
        return this.water -= 10;
    }

    public int empty(){
        return this.water = 0;
    }

    public int fill(){
        return this.water = 100;
    }

}
