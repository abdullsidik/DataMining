class DasarPemrograman{
	public static void main(String[] args){
		//Contoh kometar C++ style
		//Mendeklarasikan variable
		float f = 1234567890;
		double d = 1234567890;
		int x=10, y=20;
		
		System.out.println("f = " + f);
		System.out.println("d = " + d);
		System.out.println();

		/*Contoh Komentar C style
		Contoh operator increment, parameter didepan dan dibelakang operand
		*/
		System.out.println("x = "+ x + " y=" + y);
		System.out.println("x++ = " + x++);
		System.out.println("++y = " + ++y);
		System.out.println("x = " + x + " y="+ y);
		System.out.println();

		/*Contoh komentar java doc
		Contoh operator logika AND dengan dan dua simbol &
		*/
		System.out.println("(x==10) && (y++==20) : " + ((x==10) && (y++==20)));
		System.out.println("x = " + x + " y =" + y);
		System.out.println("(x==10) & (y++==20) : " + ((x==10) & (y++==20)));
		System.out.println("x = " + x + " y=" + y);
		System.out.println();

		double nilai=76.78;
		System.out.print("nilai>=56?\"Lulus\":\"Tidak Lulus\" = ");
		System.out.println(nilai>=56?"Lulus" :"Tidak Lulus");
	}
}
	
	
	