package sim.core;

public class RK4Value extends SimStep {
    private double xi = 7;
    private final Value value;

    public RK4Value(Manager mngr, Value vvalue) {
        super(mngr);
        this.value = vvalue;
    }

    public double eq(double y, double x) {
        return y - Math.pow(x, 3);
    }

    public double solve() {

        if (this.simTime() == this.getSimMngr().getStartSimTime()) {
            return this.xi;
        }

        double deltat;
        double ti;
        double k1;
        double k2;
        double k3;
        double k4;
        double xip1;


        deltat = this.getSimMngr().getTimeStep();

        ti = this.simTime();
        k1 = this.eq(this.xi, ti);
        k2 = this.eq(this.xi + k1 * (deltat / 2), ti + (deltat / 2));
        k3 = this.eq(this.xi + k2 * (deltat / 2), ti + (deltat / 2));
        k4 = this.eq(this.xi + k3 * (deltat), ti + deltat);
        xip1 = this.xi + (deltat / 6) * (k1 + 2 * k2 + 2 * k3 + k4);

        this.xi = xip1;
        return xip1;
    }

    @Override
    public void stateChange() {
        double res = this.solve();
        System.out.println("RK4Value = " + res);
        this.value.stateRK4Value.setValue(res, this.simTime());

    }
}
