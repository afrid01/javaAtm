/*#----------    RICHARD DANY    -----------#
#--------  Author :- SHAIK AFRID   -------# 
# ------    LANGUAGE :- PYTHON    --------#  
# ------  FRAMEWORK :- SELENIUM   --------#
# ------  USES :- WEB AUTOMATION  --------#
# --- DONT TRY TO STEEL MY CODE BITCH  ---# 
*/


package atm;


class CashWithdraw{
	
	imp passwords = new imp();
	writebankamount writebankamount = new writebankamount();
	void CashWithDraw(int Amount){
		if(passwords.AMOUNTINBANK < Amount) {
			System.out.println("InSufficient Funds !");
		}
		else {
			System.out.println("Take The Amount :- " + Amount);
			writebankamount.Writebankamount(Amount);
			System.out.println("Thanks For Using JavaBank ATM");
			
		}
		
	}
	
}
class CheckAccountNumber{
	long Check(long AccountNumber) {
		String ACCOUNTNUM = String.valueOf(AccountNumber);
		if(ACCOUNTNUM.length() == 11) {
			return 0;
		}
		return 1;
	}
}
