/* 
The open close principle apples to this becasue the
SuperWorker class is open for extension and the original code is closed for modification 

The single responsiblity principle applies to this because both the IWorkable and IFeedable both have a 
single responsiblity or function. 


The interface segregation principle applies to the IWorker interface by splittin it up into seperate interfaces IWorkable and Ifeedable. 
This is more benefical because the original interface was polluted because of the two different types of workers and there different needs,
the robot class doesnt need the eat function. Thus by using the interface segregation principle solves this. 

*/


package threesolid;

interface IWorkable {
	public void work();
}

interface IFeedable{
	public void eat();
}
