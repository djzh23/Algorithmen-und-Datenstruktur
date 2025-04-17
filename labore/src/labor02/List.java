package labor02;

import java.util.Iterator;

public interface List<T> {

	public boolean isEmpty();
	public void add(int index, T e);
	public T get(int index);
	public int size();
	public T remove(int index);
	public boolean search(T e) ;
	public Iterator<Integer> iterator();
	
}
