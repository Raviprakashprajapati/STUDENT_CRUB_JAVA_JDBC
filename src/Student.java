
public class Student {

    private int id;
    private String name;
    private String email;

    public Student(){}

    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }

    public String toString(){
        return  "[ "+" Id = " + id+  "Name = " + name + ", Email = " + email +" ]" ;
    }

    public  void headerMain() {
        System.out.println();
        for (int i = 0; i < 84; i++) {
            System.out.print("=");
        }
        System.out.println();
        System.out.printf("%-10s%-20s%-20s%n", "I.D", "Student Name", "EmailId");

        for (int i = 0; i < 84; i++) {
            System.out.print("=");
        }
        System.out.println();
    }
    
}
