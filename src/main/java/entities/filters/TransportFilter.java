package entities.filters;

import entities.Client;
import entities.filters.BaseFilter;

public class TransportFilter extends BaseFilter {
    private String destination;
    private Client sender;
    private Client receiver;

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Client getSender() {
        return sender;
    }

    public void setSender(Client sender) {
        this.sender = sender;
    }

    public Client getReceiver() {
        return receiver;
    }

    public void setReceiver(Client receiver) {
        this.receiver = receiver;
    }
}
