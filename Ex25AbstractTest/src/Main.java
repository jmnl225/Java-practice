
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//4.28 殴た馬たたた たたた ><~!!!!! 重蟹たた~!~!!!!!!
		
		//Animal <- Dog, Cat, Pig 適掘什 識情
		Animal[] anis= new Animal[5];
		anis[0]= new Dog();
		anis[1]= new Cat();
		anis[2]= new Dog();
		anis[3]= new Pig();
		anis[4]= new Animal() {
			@Override
			void say() {
				// TODO Auto-generated method stub
				System.out.println("火 火 !");
			}
		}; //神軒 随製社軒研 舘 廃腰幻 紫遂
		
		anis[0].say(); //叔薦 凧繕馬澗 梓端 Dog税 say()亜 降疑
		anis[1].say();
		anis[2].say();
		anis[3].say();
		anis[4].say();
		System.out.println();
		
		//蓄雌適掘什澗 梓端持失 災亜: 叔呪研 匝析 呪 赤製
//		Animal ani= new Animal(); //error
		
		
//		Test t= new test(); //error
		
		//蓄雌適掘什税 紫遂精 送羨 new研 馬澗 依戚 焼艦虞, 雌紗廃 適掘什研 幻級壱 戚研 梓端稽 持失馬食 紫遂
		
		
		AAA obj= new AAA(); //持失切 硲窒
		obj.aaa();
		obj.a= 100;
		Test.ccc(); //static聖 採研凶澗 適掘什戚硯生稽 硲窒
		Test.b= 50;
		System.out.println();
		
		
		//蓄雌適掘什税 陥莫失 紫遂
		Test t= null; //採乞凧繕痕呪
		t= new AAA(); //穣蝶什特: 採乞亜 切縦聖 凧繕
		t.aaa();
		
		t= new BBB();
		t.aaa();
		
		//Test虞澗 蓄雌適掘什研 紫遂馬壱 粛陥檎
		//牌雌 歯稽錘 適掘什研 幻級壱 extends研 背辞 紫遂背醤廃陥!
		
		//弦戚 馬陥左檎 適掘什 戚硯聖 誤誤馬澗 依戚 促装!!
		//適掘什税 戚硯 蒸戚 歯稽錘 適掘什研 舛税馬澗 奄狛
		// => 斥誤 適掘什 : Anonymous class
		
		Test t2= new Test() {
			//鋼球獣 蓄雌五社球研 神獄虞戚球 背醤敗
			@Override
			void aaa() {
				// TODO Auto-generated method stub
				System.out.println("斥誤適掘什税 aaa()");
			}
			@Override
			void bbb() {
				// TODO Auto-generated method stub
				System.out.println("斥誤適掘什税 bbb()");
			}
			
			
			//刃穿備 歯稽錘 五社球 持失
			void output() {
				System.out.println("斥誤適掘什税 五社球");
			}
	
			
			
		}; //斥誤適掘什澗 梓端研 new, 持失馬檎辞 適掘什研 舛税馬澗 奄狛! ********
		
		
		
		t2.aaa();
//		t2.output(); //斥誤適掘什幻税 壱政五社球澗 凧繕痕呪研 幻級呪 蒸奄拭 紫遂災亜
		
		//戚硯戚 赤澗 適掘什澗 旭精 切戟莫(class)税 梓端研 食君鯵 持失 亜管
		new AAA();
		new AAA();
		
		//斥誤 適掘什澗 戚硯戚 蒸奄拭 new拝凶 1鯵幻 持失 亜管!
		
		
	}//Main static class end.

}//Main class end.


//Test研 雌紗廃 歯稽錘 class
class BBB extends Test {

	@Override
	void aaa() {
		// TODO Auto-generated method stub
		System.out.println("BBB 適掘什税 aaa");
	}
	
	
	void bbb() {
		// TODO Auto-generated method stub
		System.out.println("BBB 適掘什税 bbb");
	}
	
	
}





//Test 蓄雌適掘什研 雌紗廃 歯稽錘適掘什 舛税
class AAA extends Test{
	//蓄雌 五社球研 左政廃 適掘什研 雌紗閤生檎 鋼球獣 蓄雌五社球研 神獄虞戚球 背醤敗!!!!!
	
	//constructor	
	public AAA() {
		System.out.println("AAA 梓端持失");
	}
	
	
	@Override
	void aaa() {
		// TODO Auto-generated method stub
		System.out.println("AAA 適掘什税 aaa 五社球 神獄虞戚球");
	}
	
	
	public void bbb() {
		// TODO Auto-generated method stub
		System.out.println("");
	}
	
}



abstract class Animal{//雌紗聖 是廃 適掘什
	//奄管精 蒸壱 戚硯幻 糎仙馬澗 五社球: 神獄虞戚球 遂
	abstract void say(); // 蓄雌五社球
	
	//蓄雌 五社球研 左政廃 適掘什澗 鋼球獣 蓄雌適掘什食醤幻 敗
	
	
	
}

class Dog extends Animal{
	//蓄雌五社球研 左政廃 適掘什研 雌紗閤生檎 鋼球獣!!!
	//蓄雌五社球研 神獄虞戚球 背醤拝 税巷亜 赤製!!!
	
	void say() {//override
		System.out.println("塵塵!");
	}
	
}

class Cat extends Animal{
	
	void say(){
		System.out.println("醤針~");
	}
}

class Pig extends Animal{
	@Override
	void say() {
		// TODO Auto-generated method stub
		System.out.println("蝦蝦..");
	}
}








