package operation03;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入您要驾驶的车型:");
        String name = in.next();
        switch (name){
            case "货车":
                truck truck = new truck();
                truck.drive();
                Menu();
                String operation = in.next();
                switch (operation){
                    case "前进":
                        truck.forward();
                        break;
                    case "后退":
                        truck.back();
                        break;
                    case "刹车":
                        truck.brake();
                        break;
                }
                break;
            case "电动车":
                ElectricVehicle electricVehicle = new ElectricVehicle();
                electricVehicle.drive();
                Menu();
                String operation1 = in.next();
                switch (operation1){
                    case "前进":
                        electricVehicle.forward();
                        break;
                    case "后退":
                        electricVehicle.back();
                        break;
                    case "刹车":
                        electricVehicle.brake();
                        break;
                    case "充电":
                        electricVehicle.charge();
                        break;
                }
                break;
            case "小客车":
                smallPassengerCar smallPassengerCar = new smallPassengerCar();
                smallPassengerCar.drive();
                Menu();
                String operation2 = in.next();
                switch (operation2){
                    case "前进":
                        smallPassengerCar.forward();
                        break;
                    case "后退":
                        smallPassengerCar.back();
                        break;
                    case "刹车":
                        smallPassengerCar.brake();
                        break;
                }
                break;
            case "老头乐":
                laoLaoLe laoLaoLe = new laoLaoLe();
                laoLaoLe.drive();
                Menu();
                String operation3 = in.next();
                switch (operation3){
                    case "前进":
                        laoLaoLe.forward();
                        break;
                    case "后退":
                        laoLaoLe.back();
                        break;
                    case "刹车":
                        laoLaoLe.brake();
                        break;
                    case "充电":
                        laoLaoLe.charge();
                        break;
                }
                break;
            case "自行车":
                Bicycle bicycle = new Bicycle();
                bicycle.drive();
                Menu();
                String operation4 = in.next();
                switch (operation4){
                    case "前进":
                        bicycle.forward();
                        break;
                    case "后退":
                        bicycle.back();
                        break;
                    case "刹车":
                        bicycle.brake();
                        break;
                }
        }
    }

    public static void Menu(){
        System.out.println("前进");
        System.out.println("后退");
        System.out.println("刹车");
        System.out.println("充电(仅限电动车和老头乐)");
    }
}
