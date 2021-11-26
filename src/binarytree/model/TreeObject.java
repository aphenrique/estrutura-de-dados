package binarytree.model;

public abstract class TreeObject<T> implements Comparable<T> {

    public abstract boolean equals(Object object);
    public abstract int hashCode();
    public abstract int compareTo(T objectToCompare);
    public abstract String toString();
    
}
