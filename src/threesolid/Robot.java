/*The Open Close Principle applies to the Robot class becuase 
the code is closed for modification and open for modification for any 
futher implemations of interfaces.

The Single Responsibility Principle applies to the Robot class 
because only the Robot is responsable to be working. This means only the Robot object 
will only (currently) be performing the work function.

The Interface Segregation Principle is shown in the Robot class
by only implementing the IWorkable interface. Instead of implementing a 
interface that is cluttered with functions it would never use ie. Eat().
The IWorkable interface fits the needs of Robot with work().
*/
package threesolid;

import java.awt.*;

 class Robot implements IWorkable{
	public void work() {
		// ....working
	}
 }
