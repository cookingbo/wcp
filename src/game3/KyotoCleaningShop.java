package game3;

public class KyotoCleaningShop implements CleaningService {
	String ownerName; //店主の名前
	String address; //住所
	String phone; //電話番号
	
	/*シャツを洗う*/
	public Shirt washShirt(Shirt s) {
		return s;
	}
	
	/*タオルを洗う*/
	public Towel washTowl(Towl t) {
		return t;
	}
	
	/*コートを洗う*/
	public Coat washCoat(Coat c) {
		return c;
	}

}
