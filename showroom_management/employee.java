import java.util.Scanner;
import java.util.UUID;
public class employee extends showroom implements utility{
    String emp_id;
    String emp_name;
    String emp_Address;
    String emp_department;
    long emp_contact_number;
    long emp_Adhar_card_number;
    int emp_age;
    


    @Override
    public void get_details() {
        System.out.println("ID: "+emp_id);
        System.out.println("Name: "+emp_name);
        System.out.println("Age: "+emp_age);
        System.out.println("Department: "+emp_department);
        System.out.println("Address: "+emp_Address);
        System.out.println("Adhar_number: "+emp_Adhar_card_number);
        System.out.println("Contact Number: "+emp_contact_number);
       

    }
    @Override
    public void set_details(){
        Scanner bk = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();
        emp_id = String.valueOf(uuid);
        System.out.println("======================= *** ENTER EMPLOYEE DETAILS *** =======================");
        System.out.println();
        System.out.print("Enter EMPLOYEE NAME: ");
        emp_name = bk.nextLine();
        System.out.print(("Enter EMPLOYEE AGE: "));
        emp_age = bk.nextInt();
        bk.nextLine();
        System.out.print("Enter EMPLOYEE DEPARTMENT: ");
        emp_department = bk.nextLine();
        System.out.print("Enter Employee Address: ");
        emp_Address=bk.nextLine();
        System.out.print("Enter Employee Adhar Number: ");
        emp_Adhar_card_number=bk.nextLong();
        System.out.print("Enter the employee Contact Number: ");
        emp_contact_number=bk.nextLong();


    }
}