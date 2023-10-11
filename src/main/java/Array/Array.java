package Array;

import java.util.Arrays;

public class Array<E> {
    public E[] arr;
    private int capacity;
    public int size;

    public Array(int n) {
        size = 0;
        capacity = n;
        arr = (E[]) new Object[capacity];
    }

    public void add(E elem) {
        if (capacity <= size) {
            capacity += (capacity / 2) + 1;
            arr = Arrays.copyOf(arr, capacity);
        }
        arr[size] = elem;
        size++;
    }

    public E getElem(int i) {
        if (i < size) return (arr[i]);
        else return (null);
    }

    public void delete(E elem) {
        int index = linearSearch(elem);
        if (index > -1) {
            arr = swap(arr, index);
            arr = Arrays.copyOf(arr, size - 1);
            size--;
            capacity = size;
        }

    }

    public int getSize() {
        return size;
    }

    private int linearSearch(E elem) {
        for (int i = 0; i < size; i++) {
            if (elem == arr[i]) return i;
        }
        return (-1);
    }

    private E[] swap(E[] a, int index) {
        for (int i = index; i < size - 1; i++) {
            E temp = a[i];
            a[i] = a[i + 1];
            a[i + 1] = temp;
        }
        return a;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj.getClass() != this.getClass())
            return false;

        Array other = (Array) obj;

        if (other.size != this.size)
            return false;

        for (int i = 0; i < size; i++) {
            if (this.arr[i] != other.arr[i])
                return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String result = "[" + arr[0];
        for (int i = 1; i < size; i++) {
            result += ", " + arr[i];
        }
        return (result + "]");
    }

    @Override
    public int hashCode() {
        final int prime = 11;
        return ((size * prime) % 100);
    }
}
