package abstraction.components;

public abstract class Slider {
	private String caption;

	public abstract void slide();

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}
}
