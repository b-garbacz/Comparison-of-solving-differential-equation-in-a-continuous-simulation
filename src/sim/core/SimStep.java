package sim.core;

public abstract class SimStep {
	private Manager simMngr;
	public SimStep(Manager mngr) {
		if (mngr!=null) {
			this.simMngr = mngr;
			// 	rejestracja w Managerze symulacji
			this.simMngr.registerSimStep(this);

		}		
	}

	public Manager getSimMngr() {
		return simMngr;
	}




	public final double simTime() {
		if (this.simMngr!=null)
			return this.simMngr.simTime();
		else 
			return 0.0;
	}

	public abstract void stateChange();
}
