package arrayprac;

public class AndroidPhoneMain {
	public static void main(String args[])
	{
		AndroidPhone a1 = new AndroidPhone("Poco M2", 6.9, 12, "Silver", 8, 128);
		AndroidPhone a2 = new AndroidPhone("Redmi Not 9", 7.4, 11, "Gold", 6, 64);
		AndroidPhone a3 = new AndroidPhone("Samsung A50", 6.12, 11, "Blue", 12, 256);
		AndroidPhone a4 = new AndroidPhone("Vivo Y50", 7.8, 12, "Red", 8, 128);
		AndroidPhone a5 = new AndroidPhone("Narzo 20", 5.9, 12, "Black", 4, 32);
		
		AndroidPhone[] arr = new AndroidPhone[5];
		arr[0] = a1;
		arr[1] = a2;
		arr[2] = a3;
		arr[3] = a4;
		arr[4] = a5;
		
		for(AndroidPhone a : arr)
		{
			System.out.println("Phone name:"+a.name +"   Display size:"+ a.display + "   Version:" + a.ram + "   Color:" +  a.color + "   Storage:" + a.rom + "   Ram:" + a.version);
		}
	}

}