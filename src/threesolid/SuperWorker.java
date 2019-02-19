/*	The Open Close principle applies to the SuperWorker class since it is still 
	open for extension, but the existing code is closed for any modification.

	The Single Responsibility principle is presented in this class by having the eat and work
	functions seperate (due to the interfaces) rather then together as one function. 

	The Interface Segregation Principle is applied in this class through the IWorkable and IFeedable
	interfaces. The SuperWorker implements these interfaces since it requires the methods, but another 
	worker class may not require both methods.
*/
package threesolid;

class SuperWorker implements IWorkable, IFeedable{
	public void work() {
		//.... working much more
	}

	public void eat() {
		//.... eating in launch break
	}
}