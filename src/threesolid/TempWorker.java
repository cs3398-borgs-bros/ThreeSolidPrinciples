package threesolid;

public class TempWorker extends BaseWorker implements IEat, ISick {
	@Override
	public String work() {
		System.out.format("Working temporarily\n");
		return ("Working temporarily\n");
	}
}