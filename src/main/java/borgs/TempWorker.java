package borgs;

public class TempWorker extends BaseWorker implements IEat, ISick {
	@Override
	public void work() {
		System.out.format("Work work work temporarily\n");
	}
	
	public void eat() {
		System.out.format("Eatting temporary lunch.\n");
	}
	
	public void sick() {
		System.out.format("Temporarily sick\n");
	}
}