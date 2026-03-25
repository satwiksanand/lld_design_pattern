package designPattern.behavioral.iterator.musicPlayerExample.interfaces;

public interface IterableCollection<T> {
    Iterator<T> createIterator();
}
