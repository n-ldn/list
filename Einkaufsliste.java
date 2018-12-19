package ch.bbbaden.einkaufsliste;

public class Einkaufsliste implements List{

    private Gegenstand head;

    public Einkaufsliste(Gegenstand head) { this.head = head; }

    @Override
    public void addFirst(String element) {

        Gegenstand first = new Gegenstand(element, head.getNext());
        head.setNext(first);
    }

    @Override
    public void addLast(String element) {

        Gegenstand next = head;
        while(next.getNext() != null){
            next = next.getNext();
        }
        Gegenstand last = new Gegenstand(element, null);
        next.setNext(last);
    }

    @Override
    public String getFirst() {
        return head.getNext().getElement();
    }

    @Override
    public String getLast() {
        Gegenstand next = head;
        while(next.getNext() != null){
            next = next.getNext();
        }
        return next.getElement();
    }

    @Override
    public String removeFirst() {
        if(isEmpty()){
            return null;
        }
        Gegenstand next = head;
        int i = 0;
        while(i < 1){
            if(next.getNext() != null) {
                next = next.getNext();
                i++;
            }
            else {
                return null;
            }
        }
        Gegenstand nextOfFirst = next.getNext();
        head.setNext(nextOfFirst);
        return "Successfully removed " + next.getElement();
    }

    @Override
    public String removeLast() {
        if(isEmpty()){
            return null;
        }
        Gegenstand next = head;
        while(next.getNext().getNext() != null){
            next = next.getNext();
        }
        String output = "Successfully removed " + next.getElement();
        next.setNext(null);
        return output;
    }

    @Override
    public int size() {
        int counter = 0;
        Gegenstand next = head;
        while(next.getNext() != null){

            counter++;
            next = next.getNext();
        }
        return counter;
    }

    @Override
    public boolean isEmpty() {
        return (head.getNext() == null);
    }
}
