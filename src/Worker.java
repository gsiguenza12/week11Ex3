public class Worker extends Employee {

    Hazard hazard;

    public Worker(String name) {
        super(name);
    }


    @Override
    public void seeDanger(HReporter_IF reporter, Hazard h) {
        super.seeDanger(reporter, h);
    }

    @Override
    public void evacuate() {
        super.evacuate();
    }

    public void fixit() {
        System.out.println("The employee " + getName() + " is fixing it.");
    }
}
