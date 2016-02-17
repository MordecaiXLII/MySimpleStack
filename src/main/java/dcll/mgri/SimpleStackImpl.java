package dcll.mgri;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by Mayeul on 2/17/2016.
 */
public class SimpleStackImpl implements SimpleStack {
    private int taille;
    private Stack<Item> pile;

    public SimpleStackImpl(){
        this.taille = 0;
        this.pile = new Stack<Item>();
    }

    @Override
    public boolean isEmpty() {
        return this.pile.isEmpty();
    }

    public int getTaille() {
        return this.taille;
    }

    @Override
    public void push(Item item) {
        this.pile.push(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        return this.pile.peek();
    }

    @Override
    public Item pop() throws EmptyStackException {
        return this.pile.pop();
    }
}
