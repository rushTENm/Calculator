public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Infix obj = new Infix("(1+3)*5");
		String postfix = obj.getResult();
		Postfix obj2 = new Postfix(postfix);
		System.out.println(obj2.getValue());
		
	}

}
