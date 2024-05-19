package mk.ukim.finki.emt.accommodationsmanagement.domain.exceptions;

public class AccommodationNotFoundException extends RuntimeException{
    public AccommodationNotFoundException() {
        super("Accommodation was not found!");
    }
}
