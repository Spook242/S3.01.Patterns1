package nivel2AbstractFactory;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<ContactEntry> entries = new ArrayList<>();

    public void addEntry(ContactEntry entry) {
        entries.add(entry);
    }

    public void showAll() {
        entries.forEach(entry -> {
            System.out.println("Contact");
            System.out.println(entry);
            System.out.println();
        });
    }
}
