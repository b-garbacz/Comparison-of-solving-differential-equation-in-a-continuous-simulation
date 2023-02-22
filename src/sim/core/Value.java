package sim.core;

import sim.monitors.MonitoredVar;

public class Value {
    public MonitoredVar stateRealValue = new MonitoredVar();
    public MonitoredVar stateEulerValue = new MonitoredVar();
    public MonitoredVar stateRK4Value = new MonitoredVar();

    public Value(double value) {
        stateRealValue.setValue(value, 0.0);
        stateEulerValue.setValue(value, 0.0);
        stateRK4Value.setValue(value, 0.0);
    }
}