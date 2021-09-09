package Study;



public class main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			GenericArrayList<Integer> intList = new GenericArrayList<>();
			intList.add(1);
			intList.add(2);
			int intValue1 = intList.get(0);
			int intValue2 = intList.get(1);
			System.out.println(intValue1 + "   " + intValue2);
			
			
			GenericArrayList<String> strList = new GenericArrayList<>();
			strList.add("ghdwpaks");
			strList.add("qkqh");
			String strvalue1 = strList.get(0);
			String strvalue2 = strList.get(1);
			System.out.println(strvalue1 + "   " + strvalue2);
			
			GenericArrayList<String> strpara = new GenericArrayList<>();
			strpara.justprintpara("ghdwpaks123");
			strpara.PrintFirstChar("ghdwpaksghdwpaks");
			
	}

}
	