/**
 * Book My Stay App
 * Use Case 5: Booking Request Queue
 * Version 5.1
 */

public class UseCase5BookingRequestQueue {

    public static void main(String[] args) {

        System.out.println("===== BOOK MY STAY APP v5.1 =====");

        BookingRequestQueue queue = new BookingRequestQueue();

        Reservation r1 = new Reservation("Alice", "Single Room");
        Reservation r2 = new Reservation("Bob", "Double Room");
        Reservation r3 = new Reservation("Charlie", "Suite Room");

        queue.addRequest(r1);
        queue.addRequest(r2);
        queue.addRequest(r3);

        queue.displayRequests();

        System.out.println("\nRequests stored in FIFO order for processing.");
    }
}
