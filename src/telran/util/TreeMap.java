package telran.util;

import java.util.Comparator;

public class TreeMap<K, V> extends AbstractMap<K, V> implements SortedMap<K, V> {

	@Override
	public K firstKey() {
		Entry<K, V> first = ((SortedSet<Entry<K,V>>) set).first();
		return first == null ? null : first.getKey();
	}

	@Override
	public K lastKey() {
		Entry<K, V> last = ((SortedSet<Entry<K, V>>) set).last();
		return last == null ? null: last.getKey();
	}

	@Override
	public K floorKey(K key) {
		Entry<K, V> floor = ((SortedSet<Entry<K, V>>) set).floor(new Entry<>(key, null));
		return floor == null ? null : floor.getKey();
	}

	@Override
	public K ceilingKey(K key) {
		Entry<K, V> ceiling = ((SortedSet<Entry<K, V>>) set).ceiling(new Entry<>(key, null));
		return ceiling == null ? null : ceiling.getKey();
	}

	@Override
	protected Set<K> getEmptyKeySet() {
		return new TreeSet<K>();
	}
	public TreeMap() {
		set = new TreeSet<>();
	}
	public TreeMap(Comparator<Entry<K, V>> comp) {
		set = new TreeSet<>(comp);
	}

}
