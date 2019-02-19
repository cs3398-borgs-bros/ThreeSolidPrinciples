package threesolid;


public class Main
{   
  public static Manager testManager = new Manager();


  // The entry main() method
  public static void main(String[] args) 
  {
    System.out.format("Starting management ... \n"); 
    try 
    {  
      System.out.format("Hiring new Worker.. \n"); 
      testManager.setWorker(new Worker());
      System.out.format("Managing Worker.. \n"); 
      testManager.manage();

      
      System.out.format("Hiring new SuperWorker.. \n");
      testManager.setWorker(new SuperWorker());
      System.out.format("Managing SuperWorker.. \n");
      testManager.manage();


      System.out.format("Hiring new Robot.. \n");
      testManager.setWorker(new Robot());
      System.out.format("Managing Robot.. \n");
      testManager.manage();
    } 
    catch (Exception main_except)
    {
      main_except.printStackTrace();
    }

    System.out.format("Management complete. \n"); 
    System.exit(0);
  }
}
