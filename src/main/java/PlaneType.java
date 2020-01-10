public enum PlaneType {

    BOEING747(400, 180000),
    BOEING313(300, 150000),
    BOEING911(200, 120000),
    BOEING250(150, 98000),
    BOEING212(5, 80000),
    BOEING500(250, 130000);

    private final int capacity;
    private final int weight;

    private PlaneType(int capacity, int weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int getWeight(){
        return this.weight;
    }
}
