package sim.core;

public class EulerValue extends SimStep {
    private double xi = 7;
    private final Value value;
    public EulerValue(Manager mngr,Value vvalue) {
        super(mngr);
        this.value = vvalue;

    }


    // dy/dx = y-x^3,c_1=1 because y(0)=1
    public double eq(double y, double x) {
        return y - Math.pow(x, 3);
    }


    public double solve() {
        double deltat = this.getSimMngr().getTimeStep();
        double ti = this.simTime();

        double xip1 = this.xi + deltat * this.eq(this.xi, ti);
        this.xi = xip1;
        return xip1;
    }

    @Override
    public void stateChange() {

        double res = this.solve();
        System.out.println("EulierValue = " + res);
        this.value.stateEulerValue.setValue(res,this.simTime());
    }
}
