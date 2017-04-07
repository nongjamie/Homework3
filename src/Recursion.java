import java.util.ArrayList;
import java.util.List;
 /**
  * Remove duplicate consecutive items from a list.
  * @author Sathira Kittisukmongkol
  */
public class Recursion {

	/**
	 * Remove duplicate consecutive items from a list, 
	 * changing the list parameter.
	 * Only consecutive duplicates are removed.
	 * @param list of any kind of object. The elements are not null.
	 * @return reference to the list parameter with consecutive duplicates removed.
	 */
	public static List unique(List list) {
		if( list.size() != 1 ) {
			if( list.get( 0 ).equals( list.get( 1 ) ) ) {
				list.remove( 0 );
				return unique( list );
			}
			else {
				List subList = list.subList( 1 , list.size());
				unique( subList );
				return list;
			}
		}
		else{
			return list;
		}
	}

	/**
	 * Main method to run the program.
	 * Add items into the list.
	 * @param args
	 */
	public static void main( String[]args ) {
		List list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("b");
		list.add("c");
		list.add("c");
		System.out.println( unique( list ) );
	}

}
