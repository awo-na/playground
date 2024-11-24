package org.example;

public abstract class Ticket {
    private User assignee; 
    private TicketStatus status;
    public Ticket(User assignee, TicketStatus status) {
        this.assignee = assignee;
        this.status = status;
    }
    public final void close(){
        status = TicketStatus.CLOSED;
        onClose();
    }
    // 追加されたリオープンメソッド
    public final void reopen(){
        status = TicketStatus.REOPEND;
        onReopen();
    }
    public TicketStatus getStatus() {
        return status;
    }
    public User getAssignee() {
        return assignee;
    }
    protected abstract void onClose();
    protected void onReopen(){
        // 既存クラスへの影響を回避するためデフォルトでは何もしない
    };
}
