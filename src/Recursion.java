import java.util.ArrayList;
import java.util.List;
 /**
  * Remove duplicate consecutive items from a list.
  * @author Sathira Kittisukmongkol
  */
public class Recursion {

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

	public static void main( String[]args ) {
		List list = new ArrayList<>();
		list.add("a");
		list.add("b");
//		list.add("b");
		list.add("b");
		list.add("c");
//		list.add("b");
//		list.add("c");
//		list.add("c");
		System.out.println( unique( list ) );
	}

}
