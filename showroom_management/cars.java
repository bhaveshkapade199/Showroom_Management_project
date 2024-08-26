import java.util.Scanner;

public class cars extends showroom implements utility{
    String car_name;
    String car_color;
    String car_fuel_type;
    String car_price;
    
    String car_transmission;

    @Override
    public void get_details(){
        System.out.println("NAME: "+car_name);
        System.out.println("COLOR: "+car_color);
        System.out.println("FUEL TYPE: "+car_fuel_type);
        System.out.println("PRICE: "+car_price);
        System.out.println("TRANSMISSION: "+car_transmission);
    }

    @Override
    public void set_details(){
        Scanner bk = new Scanner(System.in);
        System.out.println("======================= *** ENTER CAR DETAILS *** =======================");
        System.out.println();
        System.out.print("CAR NAME: ");
        car_name = bk.nextLine();
        System.out.print(("CAR COLOR: "));
        car_color = bk.nextLine();
        System.out.print("CAR FUEL TYPE(PETROL/DIESEL): ");
        car_fuel_type = bk.nextLine();
        System.out.print("CAR PRICE: ");
        car_price = bk.nextLine();
        System.out.print("TRANSMISSION TYPE(AUTOMATIC/MANUAL): ");
        car_transmission = bk.nextLine();
        total_cars_in_stock++;
    }
}