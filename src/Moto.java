public class Moto {
    int id;
    String name;
    double price;
    int cylynderCapacity;
    static int idIncrement = 1;

    public Moto() {

    }

    public Moto(String name, double price, int cylynderCapacity) {
        this.id = idIncrement;
        this.name = name;
        this.price = price;
        this.cylynderCapacity = cylynderCapacity;
        idIncrement ++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCylynderCapacity() {
        return cylynderCapacity;
    }

    public void setCylynderCapacity(int cylynderCapacity) {
        this.cylynderCapacity = cylynderCapacity;
    }


    @Override
    public String toString() {
        return "Moto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", cylynderCapacity=" + cylynderCapacity + "} ";
    }
}
