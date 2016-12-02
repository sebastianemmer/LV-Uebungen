
public class CharArray {

	private char[] internalArray;

	public CharArray(char[] param) {
		this.internalArray = param;
	}

	public void print() {
		for (int i = 0; i < internalArray.length; i++) {
			System.out.print(internalArray[1]);
			System.out.println();
		}

	}

	public void printin(int start, int end) {

		if (start > 0 && end >= start && end <= internalArray.length) {
			for (int i = start; i < end; i++) {
				System.out.print(internalArray[1]);
				System.out.println();
			}
		}

	}
	public int length(){
		return internalArray.length;
	}
}
