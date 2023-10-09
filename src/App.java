
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            while(true){
                System.out.println("\n [ STUDENT MANAGEMENT SYSTEM ] \n");
                System.out.println("1:Create");
                System.out.println("2:Read");
                System.out.println("3:Update");
                System.out.println("4:Delete");
                System.out.println("Enter Your Choice:");
                int choice = scan.nextInt();
                switch(choice){
                    case 1: System.out.println("Enter ID:");
                            int id = scan.nextInt();
                            scan.nextLine();
                            System.out.println("Enter Name:");
                            String name = scan.nextLine();
                            System.out.println("Enter EmailId:");
                            String email = scan.nextLine();
                            Student st = new Student(id, name, email);
                            StudentDao.createStudent(st);
                            break;
                    
                    case 2:  StudentDao.readAllData(); 
                            break;
                    
                    case 3: System.out.println("Enter Student ID For Update: ");
                            int id2 = scan.nextInt();
                            scan.nextLine();
                            System.out.println("Enter new Student Name:");
                            String name2 = scan.nextLine();
                            System.out.println("Enter new EmailId:");
                            String email2 = scan.nextLine();
                            Student st2 = new Student(id2, name2, email2);
                            StudentDao.updateStudent(st2);
                            break;

                    case 4: System.out.println("Enter Student ID For Deleting: ");
                            int id3 = scan.nextInt();
                            StudentDao.deleteSpecificStudent(id3);
                            break;
                    
                    default: System.out.println("Enter Valid Choice...");
                            break;

                
                
                
                       
                       
                       
                       
                 } 
            }
        }








    }
    
}
