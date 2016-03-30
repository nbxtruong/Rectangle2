package rectangle;

public class Square extends AbstractRectangle {
	public Square(int size) {
		super(size, size);
	}

	public int size() {
		return height();
	}

	public void setSize(int s) {
		setHeight(s);
		setWidth(s);
	}
}
