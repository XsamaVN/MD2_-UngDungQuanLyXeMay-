import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class MotoManage implements InterfaceQLXM<Moto>{
    List<Moto> listMoto = new ArrayList<>();

    public MotoManage() {
        listMoto.add(new Moto("Yamaha",5000,150));
        listMoto.add(new Moto("Honda",6999.99,200));
        listMoto.add(new Moto("Kawasaki z1000",18000,1000));
        listMoto.add(new Moto("Ducati",24000,1500));
        listMoto.add(new Moto("Kawasaki",15000,400));
    }

    @Override
    public void addNew(Moto moto) {
        listMoto.add(moto);
    }

    @Override
    public void showAll() {
        for (Moto moto:listMoto) {
            System.out.println(moto);
        }
    }

    @Override
    public void edit(String name, Moto moto) {
        int indexEdit = -1;
        for (int i = 0; i < listMoto.size(); i++) {
            if(listMoto.get(i).getName().equals(name)){
                indexEdit = i;
            }
        }
        if(indexEdit != -1){
            System.out.println("Sửa thông tin xe máy " + name);
            listMoto.set(indexEdit,moto);
        }
        else {
            System.out.println("Không tìm thấy thông tin xe máy " + name+ "\n Vui lòng nhập lại");
        }

    }

    @Override
    public void delete(String name) {
        int indexDelete = -1;
        for (int i = 0; i < listMoto.size(); i++) {
            if(listMoto.get(i).getName().equals(name)){
                indexDelete = i;
            }
        }
        if(indexDelete != -1){
            listMoto.remove(indexDelete);
            System.out.println("Xóa thành công thông tin xe máy " + name);
        }
        else {
            System.out.println("Không tìm thấy thông tin xe máy " + name+ "\n Vui lòng nhập lại");
        }
    }

    @Override
    public void findByName(String name) {
        boolean find = false;
        for (Moto moto : listMoto) {
            if (moto.getName().contains(name)) {
                System.out.println(moto);
                find = true;
            }
        }
        if(!find){
            System.out.println("Không tìm thấy thông tin xe máy ");
        }
    }

    @Override
    public void findValuesInRange(double lowPrice, double highPrice) {
    List<Moto> listFindValuesInRange = new LinkedList<>();
        for (Moto moto : listMoto) {
            if (lowPrice < moto.getPrice() && moto.getPrice() < highPrice) {
                listFindValuesInRange.add(moto);
            }
        }
        System.out.println("Các xe có giá trong khoảng trong khoảng từ "+ lowPrice+ " đến " + highPrice+  " là: ");
        for (Moto find: listFindValuesInRange) {
            System.out.println(find);
        }
    listFindValuesInRange.clear();
    }

    @Override
    public void sortUpByCC() {
        List<Moto> listSort = new LinkedList<>();
        listSort.addAll(listMoto);
        listSort.sort(Comparator.comparingInt(Moto::getCylynderCapacity));
//            System.out.println(listMoto);
        for (Moto item: listSort) {
            System.out.println(item);
        }
    }

    @Override
    public void sortDownByCC() {
        List<Moto> listSort2 = new LinkedList<>();
        listSort2.addAll(listMoto);
        listSort2.sort((a, b) -> Integer.compare( b.getCylynderCapacity() , a.getCylynderCapacity()));
        for (Moto item2: listSort2) {
            System.out.println(item2);
        }
    }
}
