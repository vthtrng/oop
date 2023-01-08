package mylist;

public class MyArrayList extends MyAbstractList {
    static final int INITIAL_SIZE = 16;
    Object[] elements;
    int size;

    public MyArrayList() {
        elements = new Object[INITIAL_SIZE];
        size = 0;
    }

    @Override
    public void add(Object o) {
        if (size >= elements.length - 1) {
            enlarge();
        }
        elements[size++] = o;
    }

    @Override
    public void add(Object o, int index) {
        checkBoundaries(index, size);
        add(0);
    }

    @Override
    public Object get(int index) {
        checkBoundaries(index, size-1);
        return elements[index];
    }

    @Override
    public void remove(int index) {
        checkBoundaries(index, size -1 );
        System.arraycopy(elements, index + 1, elements, index, size-1);
        elements[size] = null;
        --size;
    }

    @Override
    public int size() {
        return size;
    }

    void enlarge() {
        Object[] tmp = new Object[elements.length * 2];
        System.arraycopy(elements, 0, tmp, 0, elements.length);
        elements = tmp;
    }
}
