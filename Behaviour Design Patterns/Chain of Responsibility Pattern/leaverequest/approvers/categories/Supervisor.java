package leaverequest.approvers.categories;

import leaverequest.approvers.Approver;

public class Supervisor extends Approver {
    @Override 
    public void processLeave(int days) {
        if (days < 3) {
            System.out.println("Supervisor: Processing Leave Request"); return;
        }

        Approver nextApprover = this.getNextApprover();
        if (nextApprover != null) nextApprover.processLeave(days);
    }
}
