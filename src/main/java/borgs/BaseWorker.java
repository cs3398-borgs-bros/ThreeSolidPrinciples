/*
 * A class containing a work method and to be used by all worker classes.
*/
package borgs;

class BaseWorker implements IWorkable{
	public void work() {
		System.out.format("work work work...");
	}
}