package transport;

import java.util.Queue;

public class Station {
    private Transport transport;
    static Queue<Transport> queue;

    public static Queue<Transport> getQueue() {
        return queue;
    }

    public void setQueue(Queue<Transport> queue) {
        this.queue = queue;
    }

    public void addCarYoQueue(Transport transport) {
        if (transport.getClass() != Bus.class) {

            queue.add(transport);
        }
    }


    public void carryOutAVehicleInspection() {
        queue.remove();
    }



    public Transport getTransport() {
        return transport;
    }



    public void setTransport(Transport transport) {
        this.transport = transport;
    }
}
