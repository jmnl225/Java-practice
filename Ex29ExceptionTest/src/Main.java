import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Error(神嫌)		: 叔楳 災亜
		// 2. Exception(森須)	: 叔楳 掻(Run Time) 庚薦亜 降持
		
		// Exception 森:
		// 1) 紫遂切亜 設公吉 汽戚斗研 脊径馬澗 井酔
		// 2) 鯵降切 稽送戚蟹 域至戚 設公吉 井酔
		// 3) 革闘趨滴蟹 馬球裾嬢 神嫌
		// 4) 焦税旋 引採馬 因維(巨亀什 因維) virus: 背衣戚 嬢形崇
		
		
		System.out.println("森須坦軒拭 企背 硝焼詐獣陥!");
		
		
		// 森須雌伐拭 企廃 溌昔
//		int k=0;
//		System.out.println( 10/k );
		//森須亜 降持馬澗 覗稽益轡精 益 是帖拭辞 悪薦 曽戟喫
		//詔 紫遂切級精 覗稽益轡 紫遂掻拭 森須雌伐戚 降持馬希虞亀 詔戚 陥錘鞠澗 依 左陥澗 
		//益 拙穣幻 照 馬壱 蟹袴走 拙穣級精 益企稽 呪楳馬掩 費諺敗
		
		//[森須坦軒] 虞澗 奄綬精 森須亜 照 蟹亀系 馬澗 依戚 焼還!
		//舘, 森須亜 降持馬希虞亀 益 拙穣幻 照 馬壱 陥献 拙穣戚 呪楳馬亀系 繕箭 = 森須坦軒
		
		// 0 蟹完疾旭精 井酔: if庚生稽 背衣
		// 馬走幻! 辞獄羨紗旭精 井酔澗 辞獄税 陥錘食採研 耕軒 if庚生稽 督焦馬澗 依戚 災亜管
		//益掘辞 巷繕闇 獣亀背左壱 森須亜 降持馬檎 企誓馬澗 号狛戚 琶推
		
		//森須坦軒 庚狛 : 嬢恐 拙穣聖 獣亀(try)馬壱 幻鉦 森須亜 降持馬檎 覗稽益轡戚 陥錘鞠走 省亀系 馬澗依 
		
		
		//1) 0生稽 蟹完疾
		
		int a=2;
		try {
			System.out.println("衣引: "+10/a); // 森須降持戚 森雌喫
		}catch(ArithmeticException e) {
			System.out.println("*Exception*");
			//穿含閤精 督虞耕斗 e 澗 森須舛左研 握壱赤澗 梓端
			System.out.println(e.toString());
		}
		System.out.println();
	
		
		//2) 壕伸税 昔畿什腰硲 紫遂 神嫌
		int[] arr= new int[5];
		
		try {
			for(int i=0; i<=5; i++) {
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception!");
		}
		System.out.println();
		
		//3) null 凧繕痕呪稽 梓端税 五社球 紫遂
		String s= null;
		try {
			System.out.println(s.length());
		}catch(NullPointerException e) {
			System.out.println("Exception: 凧繕痕呪亜 亜軒徹澗 員戚 蒸製");
		}
		System.out.println();
		
		
		//4) 設公吉 汽戚斗研 脊径!
		Scanner scan= new Scanner(System.in);
//		int n;
//		try {
//			n=scan.nextInt();
//			System.out.println("n: "+ n); //拭君亜 降持馬走 省紹聖凶幻 窒径!
//		}catch(InputMismatchException e) {
//			System.out.println("Exception! 舛呪研 脊径馬室推.");
//		}
		
		
		//5) 収切亜 焼観葵聖 収切稽 痕井馬壱切 拝凶
//		String str= scan.next(); //庚切伸脊径
		
		try {
//			int num = (Integer.parseInt(str));
//			System.out.println( num );
		}catch(NumberFormatException e) {
			System.out.println("Exception: 収切亜 焼艦虞辞 痕発 災亜");
		}
		
		
		//** 舛軒! 森須坦軒澗 覗稽益轡戚 陥錘鞠走 省亀系 馬澗 庚狛 **
		
		//森須亜 廃腰拭 食君鯵 降持馬澗 井酔..
		//森) 砧 呪研 脊径閤焼 砧 呪研 蟹完疾馬澗 井酔
		//森須坦軒研 掻淡生稽
		
		int c, d;
		
//		try {
//			c= scan.nextInt();
//			d= scan.nextInt();
//			try {
//				System.out.println("蟹完疾 衣引 : "+ c/d);
//				}catch(ArithmeticException e) {
//					System.out.println("Exception: 0 蟹完疾");
//				}
//				
//		}catch(InputMismatchException e) {
//			System.out.println("Exception: 舛呪幻 脊径 亜管");
//		}
		
		
		// 菰銅 catch : 庚狛戚 希 娃衣背 左績+亜偽失
		
//		try {
//			c= scan.nextInt();
//			d= scan.nextInt();
//			
//			System.out.println("蟹完疾: "+ c/d);
//		}catch(InputMismatchException e) {
//			System.out.println("Exception: 舛呪幻 亜管");
//		}catch(ArithmeticException e) {
//			System.out.println("Exception: 0 蟹完疾 災亜");
//		}
		
		
		//菰銅 catch澗 姐呪薦廃戚 蒸製 -> 護鯵窮 廃 腰拭 坦軒馬澗 依戚 亜管
		// 舘, 乞窮 森須雌伐拭辞 坦軒拝 鎧遂戚 働紺備 陥牽走 省陥檎..
		
		//菰銅catch: 乞窮 Exception 適掘什税 採乞凧繕痕呪 紫遂
		
//		try {
//			c= scan.nextInt();
//			d= scan.nextInt();
//			
//			System.out.println("蟹完疾: "+ c/d);
//		}catch( Exception e) { //嬢恐 曽嫌税 Exception亀 陥 閤聖 呪 赤澗 古鯵痕呪
//			System.out.println("拭君~~~~~!!!");
//		}
		
		
		
		//finally 庚狛 - 森須亜 降持馬窮 照馬窮 巷繕闇 叔楳鞠澗 慎蝕
		int x= 0;
		try {
			System.out.println(10/x);
			System.out.println("域至 失因!");
		}catch(Exception e) {
			System.out.println("域至 叔鳶!");
		}finally {
			//是 拭君紫牌引澗 雌淫蒸戚 巷繕闇 叔楳
			System.out.println("fianlly!!!");
		}
		
		
		// ..?? 益訓汽 finally亜 蒸嬢亀
		//嬢託杷 try-catch{} 鉱拭 床檎 巷繕闇 叔楳喫.
		// 税耕亜 蒸嬢左績
		// -> finally亜 蒸陥檎 try 照拭赤澗 坪球人澗 雌淫蒸澗 坪球研 処陥壱 持唖
		
		//finally研 床窮 照 床窮 紫叔 笛 託戚澗 蒸走幻, finally税 坪球亜 try庚引 尻衣鞠嬢赤製聖 蟹展鎧奄 是背 糎仙
		
		//finally研 床惟鞠檎 catch庚聖 持唖 亜管
		try {
			
		}finally {}
		
		
		//拭須税 びびびびびびびびびびびびびびびびびびびびびびびびびびびびびびびびびびびびび
		
		//1. Checked Exception		:森須坦軒研 照 馬檎 叔楳繕託 馬走 省製
		//2. unchuked Exception
		
		//革闘趨滴 拙穣
//		
//		try {
//		URL url new URL("http://www.naver.com")
//		}catch(MalformedURLException)
		

		
		//督析 脊窒径
		File file= new File("D://aaa.txt")
		
		try {
			FileInputStream fis= new FileInputStream(file);
			
			System.out.println("督析 羨紗 失因");
		}catch(FileNotFoundException e) {
			System.out.println(""+"督析羨紗叔鳶! : 督析蒸製");
		}
		
		
		
		//戚 匝精?
		System.out.println();
		System.out.println("孫空!!");
		
		
		
	}

}
