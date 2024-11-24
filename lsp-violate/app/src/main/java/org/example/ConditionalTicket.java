package org.example;

public class ConditionalTicket extends Ticket{
    private boolean isClosable;
    public ConditionalTicket(User assignee, TicketStatus status) {
        super(assignee, status);
        isClosable = true;
    }
    public void setClosable(boolean isClosable) {
        this.isClosable = isClosable;
    }
    @Override
    protected void onClose() {
        // クローズ要件を満たしていない場合は、リオープンする
        if(!isClosable){
            reopen();
        }
    }
}
