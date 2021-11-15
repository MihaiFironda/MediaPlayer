package test1;

import java.util.ArrayList;
import java.util.List;

public class playlist implements Element {
    private int number_of_elements;
    private List<Element> contents;

    public playlist() {
        number_of_elements = 0;
        contents = new ArrayList<>();
    }

    public List<Element> get_contents() {
        return this.contents;
    }

    @Override
    public void print() {
        System.out.println("Playlist are " + number_of_elements + " elemente.");
        for (Element elem : contents) {
            elem.print();
        }
    }

    public void add_element(Element element) {
        number_of_elements++;
        this.contents.add(element);
    }

    public void remove_element(Element element) {
        number_of_elements--;
        this.contents.remove(element);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

