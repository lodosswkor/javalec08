package winterface;

public class Cash implements Paymethod, Bank {

	@Override
	public void pay() {
		System.out.println("현금으로 결제합니다.");
		System.out.println("수수료 0%");
	}
	
	@Override 
	public void payback() {
		System.out.println("현금 환불");
	}

	@Override
	public void 저축() {
		System.out.println("저축하다");
	}

}
