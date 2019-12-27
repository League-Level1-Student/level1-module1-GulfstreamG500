package _05_vault;

public class vault {
	int i = 344678543;

	boolean tryCode(int guess) {

		if (guess == i) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
 vault vo=new vault();
boolean bob = vo.tryCode(344678543);
System.out.println(bob);
JamesBond j = new JamesBond();
int no = j.findCode(vo);
System.out.println(no);
	}
}
