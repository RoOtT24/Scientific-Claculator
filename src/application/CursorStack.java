package application;

public class CursorStack<T extends Comparable<T>> implements StackInterface<T> {
	private CursorArray<T> cursor = new CursorArray<>(200);
	private int l;

	public CursorStack() {
		setL(cursor.createList());
	}

	@Override
	public void push(T data) throws IndexOutOfBoundsException {
		cursor.insertFirst(data, l);
	}

	@Override
	public T pop() {
		return cursor.deleteFirst(l);
	}

	@Override
	public T peek() {
		return cursor.returnFirst(l);
	}

	@Override
	public boolean isEmpty() {
		return cursor.isEmpty(l);
	}

	@Override
	public void clear() {
		cursor = new CursorArray<>(l);

	}

	public int getL() {
		return l;
	}

	public void setL(int l) {
		this.l = l;
	}

	@Override
	public String toString() {
		return cursor.toString(l);
	}

}
