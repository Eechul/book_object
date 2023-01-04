package chapter02.movie;

public class Reservation {

    private Customer customer;
    private Screening screening;
    private Money money;
    private int audienceCount;

    public Reservation(Customer customer, Screening screening, Money fee, int audienceCount) {
        this.customer = customer;
        this.screening = screening;
        this.money = fee;
        this.audienceCount = audienceCount;
    }
}
