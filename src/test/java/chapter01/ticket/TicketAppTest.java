package chapter01.ticket;

import org.junit.Test;

public class TicketAppTest {

    @Test
    public void 관람객이_소극장에_입장한다() {
        Ticket ticket = new Ticket(1000L);
        TicketOffice ticketOffice = new TicketOffice(10000L, ticket);
        TicketSeller ticketSeller = new TicketSeller(ticketOffice);

        Bag bag = new Bag(1000L);
        Audience audience = new Audience(bag);
        Theater theater = new Theater(ticketSeller);
        theater.enter(audience);
    }
}
