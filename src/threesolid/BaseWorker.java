/*
 * A class containing a work method and to be used by all worker classes.
*/
package threesolid;

class BaseWorker implements IWorkable{
	public void work() {
		System.format("work work work...");
	}
}