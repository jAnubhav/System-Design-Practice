package leaverequest;

import leaverequest.approvers.Approver;

import leaverequest.approvers.categories.Denied;
import leaverequest.approvers.categories.Director;
import leaverequest.approvers.categories.Manager;
import leaverequest.approvers.categories.Supervisor;

public class LeaveProcessor {
    private Approver primaryApprover;

    public LeaveProcessor() {
        this.primaryApprover = new Supervisor();

        Manager manager = new Manager();
        Director director = new Director();
        Denied denied = new Denied();

        director.setNextApprover(denied);
        manager.setNextApprover(director);
        primaryApprover.setNextApprover(manager);
    }

    public void processLeaveRequest(int days) {
        primaryApprover.processLeave(days);
    }
}
