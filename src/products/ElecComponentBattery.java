package products;

public enum ElecComponentBattery {


    BATTERY_2500(2500),
    BATTERY_3000(3000),
    BATTERY_4000(4000);

    private int battery;

    ElecComponentBattery(int battery) {
        this.battery = battery;
    }

    public double getBattery() {
        return battery;
    }

}