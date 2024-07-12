import java.util.Scanner;;
public class level1 {
    public static class employee{
        Scanner s1=new Scanner(System.in);
        String name,empid;
        int basesalary=10000;
        employee(String post){
            System.out.println("enter the name of the"+post+"and theor employee id");
            this.name=s1.nextLine();
            this.empid=s1.nextInt();
        }
    }
    public void display(){
        System.out.println("employee name is "+this.name+" and employee id ="+this.empid);
    }
    static class manager extends employee{
        manager(){
            super("manager");

        }
        public void display(){
            super.display();

        }
        public void sal(){
            System.out.println("salary of the employee is"+this.basesalary*1.5);
        }
        public static void main(String[] args){
            manager obj1=new manager();
            obj1.display();
            obj1.sal();
            
        }
    }
    
}
