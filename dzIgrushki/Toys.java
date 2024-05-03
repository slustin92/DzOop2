public class Toys {
    private String toysName;
    private int quantity;
    private double weight;
    private int toysId;


    public Toys(int toysId, String toysName, int quantity, double weight) {
        this.toysName = toysName;
        this.quantity = quantity;
        this.weight = weight;
        this.toysId = toysId;
    }



    public String getToysName() {
        return toysName;
    }

    public void setToysName(String toysName) {
        this.toysName = toysName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getToysId() {
        return toysId;
    }

    public void setToysId(int toysId) {
        this.toysId = toysId;
    }

    @Override
    public String toString() {
        return "Toys{" +
                "toysId= " + toysId +
                ", toysName= '" + toysName + '\'' +
                ", quantity= " + quantity +
                ", weight= " + weight +
                '}';
    }
}
