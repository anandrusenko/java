package model;

public abstract class AbstractUnit implements WithHead {

    private String name;
    private Human head;

    protected AbstractUnit(String name, Human head) {
        this.name = name;
        this.head = head;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Human getHead() {
        return head;
    }

    @Override
    public void setHead(Human head) {
        this.head = head;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", head=" + (head != null ? head.getFullName() : "no head");
    }
}
