package rectangle;

class AbstractRectangle {

	private int height;
	private int width;

	AbstractRectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}

	int height() {
		return height;
	}

	int width() {
		return width;
	}

	void setHeight(int h) {
		height = h;
	}

	void setWidth(int w) {
		width = w;
	}

	public int perimeter() {
		return 2 * (height + width);
	}

	public int surface() {
		return height * width;
	}
}