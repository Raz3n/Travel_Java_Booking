public enum PlaneType {

    BOEING747(400, 180000),
    BOEING313(300, 150000),
    BOEING911(200, 120000),
    BOEING250(150, 98000),
    BOEING212(100, 80000),
    BOEING500(250, 130000);

    private final int capacity;
    private final int weight;

    PlaneType(int capacity, int weight);

    public int getWeight(){
        return this.weight;
    }
    
    public int getCapacity(){
        return this.capacity;
    }

}
