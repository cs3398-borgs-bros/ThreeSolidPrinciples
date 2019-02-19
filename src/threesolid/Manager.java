/*	The Open Close principle is present in the Manager class because the 
	variables and methods are specific to there requirements and more than likely
	do not need to be altered, but the Manager class may need more responsibilites and 
	extending the class would be ideal.

	The Single Responsibility principle applies to this class by having a "manager" only have
	to deal with the "workers" of the project, but not any other classes that do not work.

	The Interface Segregation Principle is displayed in this class by using the IWorkable interface
	due to only needing objects that have the method work() in them. Whether or not they have other
	methods is not a concern for the Manager class.
*/
package threesolid;

class Manager {
	IWorkable worker;

	public void setWorker(IWorkable w) {
		worker=w;
	}
	
	public void manage() {
		worker.work();
	}
}
