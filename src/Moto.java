public class Moto {
   private final int id;
   private final String name;
   private final double price;
   private final int cylynderCapacity;
   static int idIncrement = 1;


    public Moto(String name, double price, int cylynderCapacity) {
        this.id = idIncrement;
        this.name = name;
        this.price = price;
        this.cylynderCapacity = cylynderCapacity;
        idIncrement ++;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getCylynderCapacity() {
        return cylynderCapacity;
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
