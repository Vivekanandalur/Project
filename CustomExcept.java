
public class CustomExcept {

	public static void main(String[] args) throws CreateCustomException {
		String str1="";
		if (str1.isEmpty()) {
			throw new CreateCustomException("String is empty");
		}
		else {
			System.out.println("String conatins value : "+str1);
		}
	}

}
