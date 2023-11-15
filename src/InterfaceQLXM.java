import java.util.List;

public interface InterfaceQLXM <T> {
    void addNew(T t);
    void showAll();
    void edit(String name, T t);
    void delete(String name);
    void findByName(String name);
    void findValuesInRange(double lowPrice, double highPrice);
    void sortUpByCC();
    void sortDownByCC();
}
