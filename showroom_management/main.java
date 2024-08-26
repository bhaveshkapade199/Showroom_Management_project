import java.util.*;
// import java.lang.*;

interface utility{
    public void get_details();
    public void set_details();
}


public class main {

    static void main_menu(){
        System.out.println();
        System.out.println("======================= *** WELCOME TO SHOWROOM MANAGEMENT SYSTEM *** =======================");
        System.out.println();
        System.out.println("=============================== *** ENTER YOUR CHOICE *** ===============================");
        System.out.println();
        System.out.println("1].ADD SHOWROOMS \t\t\t 2].ADD EMPLOYEES \t\t\t 3].ADD CARS \t\t\t 4].Add Customer");
        System.out.println();
        System.out.println("5].GET SHOWROOMS \t\t\t 6].GET EMPLOYEES \t\t\t 7].GET CARS \t\t\t 8].Get Customer");
        System.out.println();
        System.out.println("=============================== *** ENTER 0 TO EXIT *** ===============================");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        showroom showroom[] = new showroom[5];
        employee employee[] = new employee[5];
        cars car[] = new cars[5];
        Customer customer[]=new Customer[5];
        int car_counter = 0;
        int showroom_counter = 0;
        int employees_counter = 0;
        int Customer_counter=0;
        int choice = 100;
        while(choice!=0){

            main_menu();
            choice = sc.nextInt();

            while(choice!=9 && choice!=0){
                switch (choice) {
                    case 1:
                        showroom[showroom_counter] = new showroom();
                        showroom[showroom_counter].set_details();
                        showroom_counter++;
                        System.out.println();
                        System.out.println("1].ADD NEW SHOWROOM");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 2:
                        employee[employees_counter] = new employee();
                        employee[employees_counter].set_details();
                        employees_counter++;
                        System.out.println();
                        System.out.println("2].ADD NEW EMPLOYEE");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 3:
                        car[car_counter] = new cars();
                        car[car_counter].set_details();
                        car_counter++;
                        System.out.println();
                        System.out.println("3].ADD NEW CAR");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 4:
                        customer[Customer_counter]=new Customer();
                        customer[Customer_counter].set_details();
                        Customer_counter++;
                        System.out.println();
                        System.out.println("3].ADD NEW Customer");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 5:
                        for (int i = 0; i < showroom_counter; i++) {
                            showroom[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    case 6:
                        for (int i = 0; i < employees_counter; i++) {
                    employee[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    case 7:
                        for (int i = 0; i < car_counter; i++) {
                            car[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    case 8: 
                        for(int i=0; i < Customer_counter; i++){
                            customer[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice=sc.nextInt();
                        break;
                    default:
                        System.out.println("ENTER VALID CHOICE: ");
                        break;
                        
                       
                }
            }
        }


    }
}
