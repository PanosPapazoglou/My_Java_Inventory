package gr.panos.arrays;

import java.awt.Point;

public class Find2DIndex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		  String[][] array = {{"two", "d"},{"twos","2"}, {"three","3"}};
		  Point index = find2DIndex(array, "two");

		  // change one value at index
		  if (index != null)
 			//array[index.x][index.y] = "TWO";
			System.out.println("x="+index.x+"  |  y="+index.y);
		  
		  /*

		  // change everything in the whole row
		  if (index != null) {
		     String[] row = array[index.x];
		     // change the values in that row
		  }
		  
		  System.out.println("testme");
		  */
	}
	
	
	private static Point find2DIndex(Object[][] array, Object search) {

	    if (search == null || array == null) return null;

	    for (int rowIndex = 0; rowIndex < array.length; rowIndex++ ) {
	       Object[] row = array[rowIndex];
	       if (row != null) {
	          for (int columnIndex = 0; columnIndex < row.length; columnIndex++) {
	             if (search.equals(row[columnIndex])) {
	                 return new Point(rowIndex, columnIndex);
	             }
	          }
	       }
	    }
	    return null; // value not found in array
	 }	

}
