
public class Lab2B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String loyaltyMemberStatus = "Silver";
		double loyaltyMemberDiscount = 0.0;
				
		switch (loyaltyMemberStatus) {
			case "Silver":
				loyaltyMemberDiscount = 0.10;
				break;
			case "Gold":
				loyaltyMemberDiscount = 0.15;
				break;	
			case "Platinum":
				loyaltyMemberDiscount = 0.25;
				break;
			default:
				System.out.println("Ooops, you don't even belong here.");
		}
		System.out.println("The member status is " + loyaltyMemberStatus + 
				" and the member discount is " + loyaltyMemberDiscount);
		
		double billTotal = 600.43;
		double adjustedTotal = billTotal - billTotal * loyaltyMemberDiscount;
		System.out.println("$" + adjustedTotal);
		if (adjustedTotal > 500) {
			if (loyaltyMemberStatus == "Silver") {
					loyaltyMemberStatus = "Gold";
			} else if (loyaltyMemberStatus == "Gold") {
					loyaltyMemberStatus = "Platinum";
			}
		}
		System.out.println("Member status is " + loyaltyMemberStatus);
		
		String username = "Tommy123";
		String password = "12345";
		if (username.equals("Tommy123") && password.equals("12345")) {
			System.out.println("login successful");
		} else {
			System.out.println("access denied");
		}
	}
}
