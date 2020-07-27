import java.io.File;  
import java.io.IOException; 

class CreateFile {
  public static void main(String[] args) {
    try {
      File myObj = new File("filename.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}

class Person {
  protected String name = "First + Last";        
  public void update() {                    
    System.out.println("Name updated");
  }
}

class CRM extends Person {
  private String who = "Employee / Customer";    
  public static void main(String[] args) {

    
    CRM myCRM = new CRM();

    
    myCRM.update();

    
    System.out.println(myCRM.name + " " + myCRM.who);
  }
}

class Employee {
  public void EmployeeStatus() {
    System.out.println("Employee status updated");
  }
}

class Sales extends Employee {
  public void EmployeeStatus() {
    System.out.println("Sales worker");
  }
}

class Manager extends Employee {
  public void EmployeeStatus() {
    System.out.println("Sales manager");
  }
}

class Data {
  public static void main(String[] args) {
    Employee myEmployee = new Employee();  
    Employee mySales = new Sales();  
    Employee myManager = new Manager();  
    myEmployee.EmployeeStatus();
    mySales.EmployeeStatus();
    myManager.EmployeeStatus();
  }
}