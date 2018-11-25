public class StudentGetSet
{
public static void main(String a[])
{
  Student stud= new Student(); 
  stud.setName("Jesu Albert");
  stud.setPhoneNumber(1234567890);
  stud.setRollNumber("080424");
  stud.setStandard("XII");

  System.out.println("This program is to explain the use of Getter and Setter method");
  System.out.println(stud.getName()+" Student Record");
  System.out.println("Student Name: "+stud.getName());
  System.out.println("Roll Number: "+stud.getRollNumber());
  System.out.println("Phone Number: "+stud.getPhoneNumber());
  System.out.println("Class: "+stud.getStandard());
}
}
class Student 
{
  private String name; //Private data declaration
  private String rollnumber; //Private data declaration
  private int phonenumber; //Private data declaration
  private String standard; //Private data declaration

  public String getName() //getter method for Name
  {
    return name;
  }
  public void setName(String name)  //Setter method Name
  {
    this.name = name;
  }
  public String getRollNumber() //getter method for Roll Number
  {
    return rollnumber;
  }
  public void setRollNumber(String rollnumber)  //getter method for Roll Number
  {
    this.rollnumber = rollnumber;
  }
  public int getPhoneNumber() //getter method for Phone Number
  {
    return phonenumber;
  }
  public void setPhoneNumber(int phonenumber) //getter method for Phone Number
  {
    this.phonenumber = phonenumber;
  }
  public String getStandard() //getter method for Class
  {
    return standard;
  }
  public void setStandard(String standard) //getter method for Class
  {
    this.standard = standard;
  }
}

