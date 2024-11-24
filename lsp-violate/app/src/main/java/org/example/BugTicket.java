package org.example;

public class BugTicket extends Ticket{
    public BugTicket(User assignee, TicketStatus status) {
        super(assignee, status);
    }
    @Override
    protected void onClose() {
        System.out.println("Bug Ticket Closed...");
    }
    @Override
    protected void onReopen() {}
}
