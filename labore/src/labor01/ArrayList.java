package labor01;

import java.util.Iterator;

import labor02.List;

public class ArrayList<T> implements List<T> {

	private Object elements[]; // Speicher der Anzahl der Elemente
	private int size = 0;

	// konstruktur 1
	public ArrayList(int size) {
		elements = new Object[size];
	}

	// Konstruktor 2
	public ArrayList() {
		// elements = new Object[10];
		this(10);
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	 // anzahl der Elements
	public int size() {
		return this.size;
	}

	@SuppressWarnings("unchecked")
	public T get(int index) {
//		if (index >= size || index < 0) {
//			throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
//		}
		return (T) elements[index];
	}

	public void add(int index, T e) {
		if (index >= this.elements.length) { 
			this.elements = Arrays.expandArray(this.elements);
		}
		if (index < this.size()) { 
			Arrays.shiftElements(elements, index);
		}
		this.elements[index] = e;
		this.size++;

	}

	@Override
	public T remove(int index) {
		return null;
	}

	@Override
	public Iterator<Integer> iterator() {
		return null;
	}

	@Override
	public boolean search(T e) {
		return false;
	}

}
