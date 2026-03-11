import java.util.LinkedList;
import java.util.Queue;

/**
 * Manages booking requests using FIFO queue
 */

public class BookingRequestQueue {

    private Queue<Reservation> requestQueue;

    public BookingRequestQueue() {
        requestQueue = new LinkedList<>();
    }

    // Add booking request
    public void addRequest(Reservation reservation) {
        requestQueue.add(reservation);
        System.out.println("Booking request added for " + reservation.getGuestName());
    }

    // Display all requests
    public void displayRequests() {

        System.out.println("\nCurrent Booking Requests:");

        for (Reservation r : requestQueue) {
            r.displayReservation();
        }
    }
}
