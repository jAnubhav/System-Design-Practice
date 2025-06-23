import leaverequest.LeaveProcessor;

public class Main {
    public static void main(String[] args) {
        LeaveProcessor processor = new LeaveProcessor();
        
        processor.processLeaveRequest(2);
        processor.processLeaveRequest(5);
        processor.processLeaveRequest(12);
        processor.processLeaveRequest(20);
    }
}