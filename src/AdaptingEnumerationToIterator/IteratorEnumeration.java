package AdaptingEnumerationToIterator;

public class IteratorEnumeration implements Enumeration{
    Iterator iterator;

    public IteratorEnumeration(Iterator iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return this.iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return this.iterator.next();
    }
}
