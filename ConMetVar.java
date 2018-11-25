class SupCls 
{
  SupCls() 
  {
    System.out.println("Super Class default constructor");
  }
  SupCls(int a) // used to invoke current object class constructor
  {
    this();
    System.out.println("Super Class with Integer");
  }

}
class ConMetVar extends SupCls 
{
  ConMetVar(int i) // super is used to invoke the super class constructor
  {
    super(i);
    System.out.println("Subcalss with Integer");
  }
  public static void main(String[] k) 
  {
    ConMetVar t = new ConMetVar(1);
  }
}