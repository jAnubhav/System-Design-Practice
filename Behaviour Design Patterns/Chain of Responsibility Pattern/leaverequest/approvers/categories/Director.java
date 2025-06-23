package leaverequest.approvers.categories;

import leaverequest.approvers.Approver;

public class Director extends Approver {
    @Override 
    public void processLeave(int days) {
        if (days < 14) {
            System.out.println("Director: Processing Leave Request"); return;
        }

        Approver nextApprover = this.getNextApprover();
        if (nextApprover != null) nextApprover.processLeave(days);
    }
}
