package discounts;

public class FixedDiscount extends Discount {

	public FixedDiscount(double sub_price, double discount_rate) {
		super(sub_price, discount_rate, "fixed");
	}

	/**
	 * 
	 * @param discount_rate
	 */
	public void setDiscount_rate(double discount_rate) {
		// TODO - implement FixedDiscount.setDiscount_rate
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param discount_rate
	 */
	public float calculatePrice(double discount_rate) {
		// TODO - implement FixedDiscount.calculatePrice
		throw new UnsupportedOperationException();
	}
}