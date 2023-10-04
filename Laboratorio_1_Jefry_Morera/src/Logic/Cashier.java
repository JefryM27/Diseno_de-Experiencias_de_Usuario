
package Logic;

import java.util.List;

/**
 *
 * @author jefry
 */
public class Cashier {
  private int totalCustomersServed;
private User currentCustomer;
private List<User> waitingQueue;
private int checkoutNumber;
private int totalServiceTime;
private int currentCustomerTime;
private int customersServed;

public Cashier (int checkoutNumber) {
    this.checkoutNumber = checkoutNumber;
    this.currentCustomer = null;
    customersServed = 0;
    this.totalServiceTime = 0;
    this.currentCustomerTime = 0;
}

public int getTotalCustomersServed() {
    return totalCustomersServed;
}

public int getCheckoutNumber() {
    return checkoutNumber;
}

public User getCurrentCustomer() {
    return currentCustomer;
}

public int getCustomersServed() {
    return customersServed;
}

public int getTotalServiceTime() {
    return totalServiceTime;
}

public int incrementCustomersServed() {
    return customersServed++;
}

public boolean isAvailable() {
    return currentCustomer == null;
}

public void serveCustomer(User customer) {
    currentCustomer = customer;
    currentCustomerTime = 0;
}

public void serveCustomer() {
    if (currentCustomer != null) {
        currentCustomer.increaseTime();
        currentCustomerTime++;
        totalServiceTime++;
        if (currentCustomer.getTime() >= currentCustomer.getProcessingTimeSeconds()) {
            currentCustomer = null;
        }
    }
}

@Override
public String toString() {
    String status;
    if (currentCustomer == null) {
        status = "***********************************" + "\n"
                + "Caja " + checkoutNumber + ": Disponible" + "\n"
                + "Caja " + checkoutNumber + " Tiempo total: " + totalServiceTime + " minutos";
    } else {
        status = "******************************************" + "\n"
                + "Caja " + checkoutNumber + ": Se esta atendiendo a " + currentCustomer.getCustomerNumber()
                + " Prioridad segun la categoria " + currentCustomer.getPriority() + " Tiempo en la caja: " + currentCustomer.getTime() + " minutes" + "\n"
                + "Caja " + checkoutNumber + " Tiempo total: " + totalServiceTime + " minutos";
    }

    return status;
}  
}
