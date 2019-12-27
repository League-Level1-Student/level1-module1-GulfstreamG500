package _05_vault;

public class JamesBond {
	int findCode(vault v) {
		for (int i = 0; i < 999999999; i++) {
			boolean yes = v.tryCode(i);
			
			if (yes) {
				return i;

			}
		}
		return -1;

	}

}
