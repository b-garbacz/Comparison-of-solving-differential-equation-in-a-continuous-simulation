package sim.core;

public class RealValue extends SimStep {
    Value value;

    public RealValue(Manager mngr,Value v) {
        super(mngr);
        value = v;
    }

    //y(x) = c1*EXP(x) + x^3 + 3x^2 + 6x + 6, c1=1
    public double solve(double c1, double h) {
        return c1 * Math.exp(h) + Math.pow(h, 3) + 3 * Math.pow(h, 2) + 6 * h + 6;
    }

    @Override
    public void stateChange() {
        double res = this.solve(1,this.simTime());

        System.out.println("RealValue="+res);
        value.stateRealValue.setValue(res, simTime());

    }
}
