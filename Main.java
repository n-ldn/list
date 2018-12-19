package ch.bbbaden.einkaufsliste;

public class Main {
    public static void main(String[] args) {

        Einkaufsliste einkaufsliste = new Einkaufsliste(new Gegenstand());

        einkaufsliste.addFirst("Kiwi");
        einkaufsliste.addLast("Apfel");
        einkaufsliste.addLast("Birne");
        einkaufsliste.addLast("Banane");

        System.out.println(einkaufsliste.size());

        System.out.println(einkaufsliste.getFirst());
        System.out.println(einkaufsliste.getLast());


        einkaufsliste.removeFirst();
        System.out.println(einkaufsliste.getFirst());

        System.out.println("ses");
        System.out.println(einkaufsliste.removeLast());






    }
}
