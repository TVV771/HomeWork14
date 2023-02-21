package transport;

import java.util.Queue;

public class Station {
    private Transport transport;
    Queue<Transport> queue;

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
