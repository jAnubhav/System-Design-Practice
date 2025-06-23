package leaverequest.approvers.categories;

import leaverequest.approvers.Approver;

public class Denied extends Approver {
    @Override 
    public void processLeave(int days) {
        System.out.println("Leave Request Denied");
    }
}
