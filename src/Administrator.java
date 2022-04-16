public class Administrator extends Employee {
    public Administrator(String name) {
        super(name);
    }

    @Override
    public void seeDanger(HReporter_IF reporter, Hazard h) {

        /*
        System.out.println("Testing " + this.typeChecker(reporter));
        System.out.println( "Reporter: " + typeChecker(reporter));
        System.out.println( "This: " + typeChecker(this));
         */

        if (this.getClass() == Supervisor.class & reporter.getClass() == Worker.class) {
            System.out.println(this.getName() + " (Supervisor) instructed team members to fix the hazard.");
            System.out.println("And informed the manager.");
            ((Worker) reporter).fixit();
        }

        if (this.getClass() == Manager.class & reporter.getClass() == Supervisor.class)
            System.out.println(this.getName() + " asked " + ((Supervisor) reporter).getName() + " for feedback.");
    }

    @Override
    public void evacuate() {
        super.evacuate();
    }
}
