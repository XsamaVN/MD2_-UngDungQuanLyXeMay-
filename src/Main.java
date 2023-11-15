import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      MotoManage motoManage = new MotoManage();
        Scanner number = new Scanner(System.in);
        Scanner word = new Scanner(System.in);
        int choice = 1;
            while (choice != 0){
                System.out.println(" ======= Menu quản lý xe máy =======\n" +
                                   "|1. Thêm xe máy.                    |\n" +
                                   "|2. Sửa thông tin xe máy.           |\n" +
                                   "|3. Xóa thông tin xe máy.           |\n" +
                                   "|4. Xem toàn bộ xe máy.             |\n" +
                                   "|5. Tìm kiếm theo tên xe máy.       |\n" +
                                   "|6. Tìm kiếm theo khoảng giá.       |\n" +
                                   "|7. Sắp xếp theo phân khối tăng dần |\n" +
                                   "|8. Sắp xếp theo phân khối giảm dần |\n" +
                                   "|0. Thoát.                          |\n" +
                                   "|___________________________________|");
                System.out.print("Choice:  ");
                choice = number.nextInt();
                if(choice == 1){
                    System.out.println("---Nhập thông tin xe máy---\n" +
                            "Nhập tên xe máy: ");
                    String motoName = word.nextLine();
                    System.out.println("Nhập giá tiền: ");
                    double motoPrice = number.nextDouble();
                    System.out.println("Nhập số phân khối: ");
                    int motoCylynderCapacity = number.nextInt();
                    motoManage.addNew(new Moto(motoName,motoPrice,motoCylynderCapacity));
                    System.out.println("thêm thành công!!!");
                }
                if(choice == 2){
                    System.out.println("Nhập tên xe muốn sửa:");
                    String motoName1 = word.nextLine();
                    System.out.println("Nhập tên mới: ");
                    String motoName2 = word.nextLine();
                    System.out.println("Nhập giá tiền mới:  ");
                    double motoPrice2 = number.nextDouble();
                    System.out.println("Nhập số phân khối mới: ");
                    int motoCylynderCapacity2 = number.nextInt();
                    motoManage.edit(motoName1, new Moto(motoName2,motoPrice2,motoCylynderCapacity2));
                }
                if(choice == 3){
                    System.out.println("Nhập tên xe máy muốn xóa:");
                    String motoName3 = word.nextLine();
                    motoManage.delete(motoName3);
                }
                if(choice == 4){
                    System.out.println("Thông tin toàn bộ xe máy: ");
                    motoManage.showAll();
                }
                if(choice == 5){
                    System.out.println("Nhập để tìm kiếm xe máy");
                    String randomWord = word.nextLine();
                    motoManage.findByName(randomWord);
                }
                if(choice == 6){
                    System.out.println("---Tìm kiếm theo khoảng giá---\n" +
                            "Nhập vào số tiền giới hạn dưới:");
                    double lowPrice = number.nextDouble();
                    System.out.println("Nhập vào số tiền giới hạn trên:");
                    double highPrice = number.nextDouble();
                    motoManage.findValuesInRange(lowPrice,highPrice);
                }
                if(choice == 7){
                    System.out.println("Sắp xếp theo thứ tự phân khối tăng dần: ");
                    motoManage.sortUpByCC();
                }
                if(choice == 8){
                    System.out.println("Sắp xếp theo thứ tự phân khối giảm dần: ");
                    motoManage.sortDownByCC();
                }
            }
    }
}