package Logic;

import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author jefry
 */
public class Logic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Menu:");
            System.out.println("1. Entrar");
            System.out.println("2. Salir");
            System.out.print("Seleccione la opcion que desea: ");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Ingrese la cantidad de clientes: ");
                    int numberOfCustomers = scanner.nextInt();
                    simulateBank(numberOfCustomers);
                    break;
                case 2:
                    exit = true;
                    break;
                default:
                    System.out.println("Algo salio mal, intente de nuevo.");
                    break;
            }
        }
        scanner.close();
    }

    public static void simulateBank(int numberOfCustomers) {
        List<Cashier> checkoutCounters = new ArrayList<>();
        Queue<User> waitingQueue = new PriorityQueue<>(Comparator.comparing(User::getPriority));

        // Initialize the checkout counters
        for (int i = 1; i <= 4; i++) {
            checkoutCounters.add(new Cashier(i));
        }

        // Fill the waiting queue with customers
        for (int i = 1; i <= numberOfCustomers; i++) {
            waitingQueue.add(new User(i));
        }

        List<User> customersOrderedByNumber = new ArrayList<>(waitingQueue);
        customersOrderedByNumber.sort(Comparator.comparing(User::getCustomerNumber));

        System.out.println("Generated Customers:");
        for (User customer : customersOrderedByNumber) {
            System.out.println("Usuario " + customer.getCustomerNumber() + " - Prioridad segun la categoria2"
                    + " " + customer.getPriority());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Presione intro para empezar la ejecucion");
        scanner.nextLine(); // Ask the user to press any key

        int timeElapsed = 0;

        while (!waitingQueue.isEmpty() || checkoutCounters.stream().anyMatch(counter -> !counter.isAvailable())) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("");
            System.out.println("");
            System.out.println("Tiempo que ha pasado: " + timeElapsed + " minutos");

            for (Cashier counter : checkoutCounters) {
                if (counter.isAvailable() && !waitingQueue.isEmpty()) {
                    User customer = waitingQueue.poll();
                    counter.serveCustomer(customer);
                    counter.incrementCustomersServed();
                } else {
                    counter.serveCustomer();
                }
                System.out.println(counter.toString());
            }
            timeElapsed++;
            try {
                TimeUnit.SECONDS.sleep(1); // Wait for 1 second to simulate real-time
            } catch (InterruptedException e) {
                System.out.println("Error");
            }
        }
        System.out.println("");
        System.out.println("Al final");
        for (Cashier counter : checkoutCounters) {
            System.out.println("************************************");
            System.out.println("Caja " + counter.getCheckoutNumber() + ":");
            System.out.println("Clientes: " + counter.getCustomersServed());
            System.out.println("Total del tiempo de atencion: " + counter.getTotalServiceTime() + " minutes");
        }
        System.out.println("*************************************");
        System.out.println("Cantidad de clientes dentro del banco: " + numberOfCustomers);
        System.out.println("Tiempo total de atencion " + timeElapsed + " minutos.");
    }
}
