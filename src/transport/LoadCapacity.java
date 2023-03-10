package transport;

public enum LoadCapacity {
N1(3.5,12),
N2(0,3.5),
N3(0,12);
    private double min;
    private double max;

    LoadCapacity(double min, double max) {
        this.min=min;
        this.max=max;

    }
    LoadCapacity(){

    }

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }
    public static LoadCapacity getValue(double value) {
        for (LoadCapacity e : LoadCapacity.values()){
            if (value >= e.getMin() && value<=e.getMax()){
                System.out.println(e);
                return e;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "LoadCapacity{" +
                "min=" + min +
                ", max=" + max +
                '}' +super.toString();
    }
}
