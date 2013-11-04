package models;

public class GenericPair<T> {
	T first;
	T second;

	public GenericPair(T first, T second) {
		this.first = first;
		this.second = second;
	}

	public GenericPair(GenericPair<T> copy) {
		this.first = copy.first;
		this.second = copy.second;
	}

	public static <T> void swap(GenericPair<T> poi) {
		poi.swap();
	}

	public void swap() {
		T temp = first;
		first = second;
		second = temp;
	}

	public T getFirst() {
		return first;
	}

	public void setFirst(T first) {
		this.first = first;
	}

	public T getSecond() {
		return second;
	}

	public void setSecond(T second) {
		this.second = second;
	}

	@Override
	public String toString() {
		return "(" + first + ", " + second + ")";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof GenericPair))
			return false;
		GenericPair<?> other = (GenericPair<?>) obj;
		return (other.first.equals(first) && other.second.equals(second));
	}

}
