/**
 * Demo class demonstrating hierarchical chain of responsibility.
 *
 * You want an object to be able to send a command to another object without specifying the receiver. The sending object does not care
 * which object handles the command, only that an object will receive a command and handle it.
 *
 */
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
