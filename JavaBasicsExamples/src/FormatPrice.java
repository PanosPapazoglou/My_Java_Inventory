import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;


public class FormatPrice {
	// test2
	private final static String PRICE_FORMAT =  "###.00";
	
	
	public String formatPrice(double price) {
		DecimalFormatSymbols unusualSymbols = new DecimalFormatSymbols();
		unusualSymbols.setDecimalSeparator(',');
		unusualSymbols.setGroupingSeparator('.');
		DecimalFormat format = new DecimalFormat(PRICE_FORMAT, unusualSymbols);
		format.setGroupingSize(4);
		return format.format(price);
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String myformatPrice,priceText;
		priceText="23,5";
		
		String formatPrice = new FormatPrice(priceText);
		
		myformatPrice = formatPrice.formatPrice(Double.parseDouble(priceText));
		
		System.out.println("My format Price :"+myformatPrice);
		
	}	
}

