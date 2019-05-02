package borgs;

public class TempWorker extends BaseWorker implements IEat, ISick {
	@Override
	public String work() {
		return "Work work work temporarily\n";
	}
	
	public String eat() {
		return "Eatting temporary lunch.\n";
	}
	
	public String sick() {
		return "Temporarily sick\n";
	}
}