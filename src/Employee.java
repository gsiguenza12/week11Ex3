public class Employee implements HReporter_IF {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public void seeDanger(HReporter_IF reporter, Hazard h) {

        System.out.println(getName() + " " + typeChecker(this) + " reported " + h.getType() + " to supervisor.");
    }

    @Override
    public void setDirectOverseen(HReporter_IF reporter) {

    }

    @Override
    public HReporter_IF getDirectOverseen() {
        return null;
    }

    public void evacuate() {
        System.out.println("Evacuating the premises.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String typeChecker(HReporter_IF reporter) {
        String type = "";
        if (reporter.getClass() == Worker.class)
            type = "(Worker)";
        else if (reporter.getClass() == CEO.class)
            type = "(CEO)";
        else if (reporter.getClass() == Manager.class)
            type = "(Manager)";
        else if (reporter.getClass() == Supervisor.class)
            type = "(Supervisor)";
        else if (reporter.getClass() == ProjectLeader.class)
            type = "(Project Leader)";


        return type;
    }
}
