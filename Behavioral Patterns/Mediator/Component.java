public abstract class Component {
    private final Mediator mediator;
    private int id;

    public Component(Mediator mediator) {
        this.mediator = mediator;
        id = mediator.getComponentCount() + 1;
        mediator.addComponent(this);
    }

    public void send(String event) {
        System.out.println("Component " + id + " Sent: " + event);
        mediator.notify(this, event);
    }

    public void receive(String event) {
        System.out.println("Component " + id + " Received: " + event);
    }

    public int getId() {
        return id;
    }
}
