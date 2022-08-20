package org.learn.blockchains;

import java.util.Collection;
import java.util.function.Predicate;

public class LinkedListForBlock extends java.util.LinkedList<Block> {

    @Override
    public boolean remove(Object o) {
        throw new IllegalStateException("Illegal access to remove");
    }

    @Override
    public Block removeFirst() {
        throw new IllegalStateException("Illegal access to remove");
    }

    @Override
    public Block removeLast() {
        throw new IllegalStateException("Illegal access to remove");
    }

    @Override
    public Block remove(int index) {
        throw new IllegalStateException("Illegal access to remove");
    }

    @Override
    public Block remove() {
        throw new IllegalStateException("Illegal access to remove");
    }

    @Override
    public boolean removeFirstOccurrence(Object o) {
        throw new IllegalStateException("Illegal access to remove");
    }

    @Override
    public boolean removeLastOccurrence(Object o) {
        throw new IllegalStateException("Illegal access to remove");
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        throw new IllegalStateException("Illegal access to remove");
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new IllegalStateException("Illegal access to remove");
    }

    @Override
    public boolean removeIf(Predicate<? super Block> filter) {
        throw new IllegalStateException("Illegal access to remove");
    }
}
