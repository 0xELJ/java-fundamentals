package cap02.genericClass;

public class Collection<T> {
	private Object[] data = null;
	private int len = 0;
	
	public Collection(int initialSize) {
		data = new Object[initialSize];
	}
	
	public void add(T item) {
		this.insert(item, len);
	}
	
	public void insert(T item, int i) {
		if (len == data.length) {
			Object[] aux = data;
			data = new Object[data.length * 2];
			for (int j = 0; j < len; j++) {
				data[j] = aux[j];
			}
			aux = null;
		}
		for (int j = len - 1; j >= i; j --) {
			data[j + 1] = data[j];
		}
		data[i] = item;
		len++;
	}
	
	public int search(T item) {
		int i = 0;
		for (; i < len && !data[i].equals(item); i++);
		return i < len ? i : -1;
	}
	
	public T delete(int i) {
		Object aux = data[i];
		for (int j = i; j < len - 1; j ++) {
			data[j] = data[j + 1];
		}
		len--;
		return (T) aux;
	}
	
	public T get(int i) {
		return (T) data[i];
	}
	
	public int size() {
		return len;
	}
}
