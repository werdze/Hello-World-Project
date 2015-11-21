
public class PlayingWithChars {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int iRow=0; iRow<10; iRow++){
			System.out.printf("%4d", iRow);
		for(int iCol=0; iCol<10; iCol++){
		int index = (iRow*10) + iCol    ;
		System.out.printf("%4d", index);
		}
		System.out.println();
		}
		
		
		for(int iRow=1000; iRow<1500; iRow++){
			System.out.printf("%4d", iRow);
		for(int iCol=0; iCol<10; iCol++){
		int index = (iRow*10) + iCol    ;
		System.out.printf("%4s", (char)index);
		}
		System.out.println();
		}
		
		int newIndex = 97;
		System.out.println("The unicode character at number " + newIndex + " is " + (char)newIndex);
		
	}

}
