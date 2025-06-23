package leaverequest.approvers;

public abstract class Approver {
    private Approver nextApprover;

    public abstract void processLeave(int days);

    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    public Approver getNextApprover() {
        return this.nextApprover;
    }
}
