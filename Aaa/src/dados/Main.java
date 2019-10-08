package dados;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		
		Deck x = new Deck(1);
		
	
		System.out.println(x.getArray().size());
		Collections.shuffle(x.getArray());
		Collections.shuffle(x.getArray());
		Collections.shuffle(x.getArray());
		System.out.println(x.getArray().toString());
		
		System.out.println(x.escolher());
		System.out.println(x.escolher());
		System.out.println(x.escolher());
		System.out.println(x.escolher());
		System.out.println(x.escolher());
		System.out.println(x.escolher());
		System.out.println(x.escolher());
		System.out.println(x.escolher());
		
		System.out.println(x.getArray().size() + x.getArray().toString() );
	}
			
	
	
	
}
