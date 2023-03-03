package tv.oled.entity;

import java.util.UUID;

public class Led {
	 //This is a LED class to create newly released SONY LEDS in 2023
	private final String id;
	private String model;
	private Double price;

	public Led(final String id, final String model, final Double price) {
		super();
		this.id = id;
		this.model = model;
		this.price = price;
	}
	
	public Led(final String model, final Double price) {
		this(UUID.randomUUID().toString(),model,price);
	}

	public String getModel() {
		return model;
	}

	public void setModel(final String model) {
		this.model = model;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(final Double price) {
		this.price = price;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Led [id=" + id + ", model=" + model + ", price=" + price + "]";
	}
}
