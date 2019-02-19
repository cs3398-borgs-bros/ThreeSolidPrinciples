/*The Open Close Principle applies to the Worker class becuase 
the existing code is "Closed" for modification. The existing 
methods are not modified. "Open" for modification is shown by 
adding new functionality by implementing the new interfaces 
rather than modifying the existing code.

The Single Responsibility Principle applies to the Worker class 
because only the Worker role is responsible for each of the 
methods in the Worker class. This means only the Worker object 
will invoke the methods in the Worker class

The Interface Segregation Principle is shown in the Worker 
class because rather than implementing a big multi purposed 
interface that offers more functionality than needed, it implements 
2 focused interfaces that provide only what is needed by the Worker 
class. IWorkable and IFeedable were seperated into seperate interfaces 
due to the introduction of the Robot class. //Having the work and eat 
methods in one interface would violate //the Interface Segregation 
Principle because robots don't eat. //Providing an inteface to the Robot 
class with an eat method //would be the perfect example of a fat interface 
that provides //more functionlity than needed.
*/

package threesolid;

class Worker extends BaseWorker implements IEat, ISick{
	public void work() {
		System.out.format("working...");
	}

	public void eat() {
		System.out.format("eating...");
	}
	public void sick(){
		System.out.format("sick...");
}
}
