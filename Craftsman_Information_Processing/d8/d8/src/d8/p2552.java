package d8;

public class p2552 {

	public static void main(String[] args) {
		int i , hap = 0;
		for (i = 1; i <= 10; ++i, hap += i);
		System.out.printf("%d, %d\n",i ,hap);
		/*
		 * 2	2
		 * 3	5
		 * 4	9
		 * 5	14
		 * 6	20
		 * 7	27
		 * 8	35
		 * 9	44
		 * 10	54
		 * 11	65
		 */
	}

}
