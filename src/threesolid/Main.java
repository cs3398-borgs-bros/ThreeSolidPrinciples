package threesolid;

public class Main
{
  public static Manager regManager = new Manager();
  public static ProductManager prodManager = new ProductManager();
  public static ProjectManager projManager = new ProjectManager();
  
  // The entry main() method
  public static void main(String[] args) 
  {
    System.out.format("Starting management ... \n"); 
    try 
    {  
      System.out.format("\nManager hiring new TempWorker.. \n"); 
      regManager.setWorker(new TempWorker());
      System.out.format("Managing TempWorker.. \n"); 
      regManager.manage();

      System.out.format("\nProduct Manager hiring new SuperWorker.. \n"); 
      prodManager.setWorker(new SuperWorker());
      prodManager.defineproduct();
      System.out.format("Managing SuperWorker.. \n"); 
      prodManager.manage();

      System.out.format("\nProject Manager hiring new Robot.. \n");
      projManager.setWorker(new Robot());
      projManager.schedulework();
      System.out.format("Managing Robot.. \n");
      projManager.manage();
    } 
    catch (Exception main_except)
    {
      main_except.printStackTrace();
    }

    System.out.format("\nManagement complete. \n"); 
    System.exit(0);
  }
}