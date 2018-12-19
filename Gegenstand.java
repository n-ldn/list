package ch.bbbaden.einkaufsliste;

public class Gegenstand {

    private String element;
    private Gegenstand next;

    public Gegenstand(){
        this.element = null;
        this.next = null;
    }

    public Gegenstand(String element, Gegenstand next) {
        this.element = element;
        this.next = next;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public Gegenstand getNext() {
        return next;
    }

    public void setNext(Gegenstand next) {
        this.next = next;
    }

}
