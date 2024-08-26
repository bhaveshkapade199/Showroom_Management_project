import java.util.*;
public class Customer extends showroom implements utility{
    
    String Customer_Id;
    String Customer_name;
    String Customer_Address;
    String Customer_bank_name;
    long Customer_Adhar_number;
    long Customer_contact_number;
    int age;


    @Override
    public void get_details(){
        System.out.println("Customer Id: "+Customer_Id);
        System.out.println("Customer Name: "+Customer_name);
        System.out.println("Customer Address: "+Customer_Address);
        System.out.println("Customer Bank Name: "+Customer_bank_name);
        System.out.println("Customer Adhar card Number: "+Customer_Adhar_number);
        System.out.println("Customer Contact Number: "+Customer_contact_number);
        System.out.println("Customer age: "+age);
    }

    @Override
    public void set_details(){
        Scanner bk=new Scanner(System.in);
        UUID uuid = UUID.randomUUID();
        Customer_Id = String.valueOf(uuid);
        System.out.println("======================= *** ENTER Customer DETAILS *** =======================");
        System.out.println();
        System.out.print("Enter the Customer Name: ");
        Customer_name=bk.nextLine();
        System.out.print("Enter the Address: ");
        Customer_Address=bk.nextLine();
        System.out.println("Enter the Customer Bank Name: ");
        Customer_bank_name=bk.nextLine();
        System.out.print("Enter the Adhar card Number: ");
        Customer_Adhar_number=bk.nextLong();
        System.out.print("Enter the Customer Contact Number: ");
        Customer_contact_number=bk.nextLong();
        System.out.print("Enter the Customer Age: ");
        age=bk.nextInt();
        
    }
}
