import sim.core.Manager;
import sim.core.RK4Value;
import sim.core.Value;
import sim.monitors.Diagram;
import sim.core.RealValue;
import sim.core.EulerValue;
class Main {
    public static Manager menager = Manager.getInstance(0.0,0.1);
    public static void main(String[] args) {
        Value val = new Value (0);
        RealValue realValue = new RealValue(menager,val);
        EulerValue eulerValue = new EulerValue(menager,val);
        RK4Value rk4Value = new RK4Value(menager,val);

        menager.setEndSimTime(40);
        menager.startSimulation();

        Diagram diagramObj = new Diagram(Diagram.DiagramType.TIME, "Wykres przedstawiajacy zmiany stanów zaimplementowanych metod");
        diagramObj.add(val.stateRealValue, java.awt.Color.RED);
        diagramObj.add(val.stateEulerValue, java.awt.Color.BLUE);
        diagramObj.add(val.stateRK4Value, java.awt.Color.BLACK);
        diagramObj.show();

    }
}

