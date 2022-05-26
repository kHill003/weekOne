
public class WaterBottle {
    private int BottleVolume;

    public WaterBottle() {
        this.BottleVolume = 100;
    }

    public void drink(){
        this.BottleVolume -= 10;
    }

    public void empty(){
        this.BottleVolume = 0;
    }

    public void fill(){
        this.BottleVolume = 100;
    }

    public int getVolume() {
        return this.BottleVolume;
    }
    }