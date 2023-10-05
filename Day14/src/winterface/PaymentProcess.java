package winterface;

public class PaymentProcess {

	public void paygo(Paymethod p) {
		p.pay(); 
	}
	
	public static void main(String args[]) {
		PaymentProcess pp = new PaymentProcess(); 
		//Paymethod p = new Paymethod(); // Payment 인터페이스 new X 
		
		Paymethod cash = new Cash(); // 다형성
		Paymethod card = new Card(); // 다형성
		Bank bank = new Cash(); // 다형성 
		
		pp.paygo(card);
		System.out.println("========");
		pp.paygo(cash);
		System.out.println("========");
		bank.저축();
		
		// Paymethod cash = new Cash(); 
		cash.pay(); 
		//cash.저축(); // error 
		//-- Type Casting 
		((Bank)cash).저축(); 
		
		// Bank bank = new Cash();
		bank.저축(); 
		//bank.pay(); // error 
		((Paymethod)bank).pay(); 
		
		Cash c = new Cash(); 
		c.저축();
		c.pay(); 
		//pp.paygo(p);
		
		cash.payback(); // cash 는 payback() 지원 - 재정의 
		card.payback(); // card 는 payback() 미지원 - 재정의 안함 
		
		// 익명구현객체 
		
		Paymethod pp2 = new Paymethod() {
			@Override
			public void pay() {
				System.out.println("익명구현객체");
			}
		}; 
		
		pp2.pay(); 
		
		if(pp2 instanceof Paymethod) {
			System.out.println("pp2는 Paymethod의 자식이거나/본체");
		}

		
	}
	
}
