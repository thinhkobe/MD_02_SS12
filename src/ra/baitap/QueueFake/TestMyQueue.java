package ra.baitap.QueueFake;

public class TestMyQueue {
    public static void main(String[] args) {
        MyQueue myQueue=new MyQueue();
        myQueue.enQueue(10);
        myQueue.enQueue(20);
        myQueue.displayQueue();
        myQueue.deQueue();
        myQueue.displayQueue();
    }
}
