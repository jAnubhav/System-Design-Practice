package leaverequest.approvers.categories;

import leaverequest.approvers.Approver;

public class Manager extends Approver {
    @Override 
    public void processLeave(int days) {
        if (days < 7) {
            System.out.println("Manager: Processing Leave Request"); return;
        }

        Approver nextApprover = this.getNextApprover();
        if (nextApprover != null) nextApprover.processLeave(days);
    }
}
