public class leak
{
    public static void main(String[] args) {
        Worker worker = new Worker("John");
        //System.out.println(worker.getName());

        HReporter_IF supervisor = new Supervisor("Jack");
        Hazard leak = new Hazard("leak", "Ceiling fan leak.", 3);

        worker.seeDanger(supervisor, leak);

        supervisor.seeDanger(worker, leak);

        Manager manager = new Manager("Bob");

        manager.seeDanger(supervisor, leak);
    }
}
