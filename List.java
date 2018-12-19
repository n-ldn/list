package ch.bbbaden.einkaufsliste;

public interface List {

    public void addFirst(String element);

    public void addLast(String element);

    public String getFirst();

    public String getLast();

    public String removeFirst();

    public String removeLast();

    public int size();

    public boolean isEmpty();
}
