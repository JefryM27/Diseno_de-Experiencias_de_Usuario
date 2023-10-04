
package Logic;

import java.util.Random;

/**
 *
 * @author jefry
 */
public class User {
    private int customerNumber;
private String priority;
private int processingTimeSeconds;
private int time;

public User(int customerNumber) {
    this.customerNumber = customerNumber;
    this.priority = generateRandomPriority(customerNumber);
    this.processingTimeSeconds = generateRandomTime();
    this.time = 0;
}

public String getPriority() {
    return priority;
}

public int getTime() {
    return time;
}

public void increaseTime() {
    time++;
}

private int generateRandomTime() {
    return (int) (Math.random() * 23) + 2; // Between 2 and 24 seconds
}

public int getCustomerNumber() {
    return customerNumber;
}

public int getProcessingTimeSeconds() {
    return processingTimeSeconds;
}

private String generateRandomPriority(int customerNumber) {
    Random rand = new Random();
    int randomPriority = rand.nextInt(4);
    char priorityLetter;
    switch (randomPriority) {
        case 0:
            priorityLetter = 'A';
            break;
        case 1:
            priorityLetter = 'B';
            break;
        case 2:
            priorityLetter = 'C';
            break;
        default:
            priorityLetter = 'D';
            break;
    }
    return priorityLetter + Integer.toString(customerNumber); // Combines priority letter with customer number
}
}
