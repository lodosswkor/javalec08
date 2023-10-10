
public class StringEx {

	public static void main(String args[]) {
		
		String a = "이종석";
		a = a + " 만세";  
		
		// string interpolation ( 치환, 중간에 값 넣기 ) 
		String val = "안녕하세요, 내 이름은 %s 입니다. 나이는 %d 살 이예요";
		val = String.format(val, "이종석", 10); 
		System.out.println(val); 
		
		// StringBuffer, StringBuilder 
		// StringBuffer Thread-Safe 
		// StringBuilder Thread-unSafe
		
		String name = new String("이종석"); //"이종석"; 
		StringBuffer nameBuff = new StringBuffer("이종석"); 
		StringBuilder nameBuild = new StringBuilder("이종석"); 
		
		name = name + "만세";
		nameBuff.append("만세"); 
		nameBuild.append("만세");
		
		System.out.println("String : " + name);		
		System.out.println("StringBuffer : " + nameBuff);		
		System.out.println("StringBuilder : " + nameBuild); 
		
		// 문자열이 많아질수록 / 연산이 많아질수록 성능은
		// StringBuilder > StringBuffer >>> 4차원의 벽 >>> String 
		
		
	}
	
}
