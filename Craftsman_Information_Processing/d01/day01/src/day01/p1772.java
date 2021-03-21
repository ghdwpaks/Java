package day01;

public class p1772 {

	public static void main(String[] args) {
		int[][] a = { {11,12,13,14},{21,22,23,24}};
		int hap = 0;
		for (int i[] : a) {
			for (int j : i) {
				hap = hap + j;
			}
		}
		System.out.println("hap :"+hap);

	}

}
