/*	The Open Close principle applies to the SuperWorker class since it is still 
	open for extension, but the existing code is closed for any modification.

	The Single Responsibility principle is presented in this class by having the eat and work
	functions seperate (due to the interfaces) rather then together as one function. 

	The Interface Segregation Principle is applied in this class through the IWorkable and IFeedable
	interfaces. The SuperWorker implements these interfaces since it requires the methods, but another 
	worker class may not require both methods.
*/
package borgs;

public class SuperWorker extends BaseWorker implements  IEat, ISick {

	@Override
	public String work() {
		return "Work work work super hard\n";
	}
	
	public String eat() {
		return "Eating super lunch\n";
	}

	public String sick() {
		return "Super sick\n";
	}
}