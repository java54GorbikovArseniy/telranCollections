package telran.util;

import telran.util.LinkedList.Node;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedHashSet<T> extends AbstractCollection<T> implements Set<T> {
	HashMap<T, Node<T>> map = new HashMap<>();
	LinkedList<T> list = new LinkedList<>();

	@Override
	public T get(T pattern) {
		Node<T> node = map.get(pattern);

		return node == null ? null : node.data;
	}

	@Override
	public boolean add(T obj) {
		boolean res = false;
		if (!contains(obj)){
			res = true;
			list.add(obj);
			map.put(obj, new Node<>(obj));
			size++;
		}
		return res;
	}

	@Override
	public boolean remove(T pattern) {
		Node<T> node = map.get(pattern);
		boolean res = false;
		if (node != null) {
			res = true;
			list.removeNode(node);
			map.remove(pattern);
			size--;
		}

		return res;
	}

	@Override
	public boolean contains(T pattern) {
		return list.contains(pattern);
	}

	@Override
	public Iterator<T> iterator() {
		return new LinkedHashSetIterator();
	}

	private class LinkedHashSetIterator implements Iterator<T>{
		Iterator<T> iterator = list.iterator();

		@Override
		public boolean hasNext() {
			return iterator.hasNext();
		}

		@Override
		public T next() {
			if (!hasNext()){
				throw new NoSuchElementException();
			}
			return iterator.next();
		}

		@Override
		public void remove() {
			iterator.remove();
		}
	}

}
