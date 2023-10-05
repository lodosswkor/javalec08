package winterface;

public class Card implements Paymethod {

	@Override
	public void pay() {
		System.out.println("카드로 결제합니다.");
		System.out.println("수수료 0.5%");
	}

}
