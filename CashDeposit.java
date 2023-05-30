/*#----------    RICHARD DANY    -----------#
#--------  Author :- SHAIK AFRID   -------# 
# ------    LANGUAGE :- PYTHON    --------#  
# ------  FRAMEWORK :- SELENIUM   --------#
# ------  USES :- WEB AUTOMATION  --------#
# --- DONT TRY TO STEEL MY CODE BITCH  ---# 
*/


package atm;

import java.io.FileWriter;
import java.io.IOException;

class CashDeposit{
	imp passwords = new imp();
	CashDepositInBank cashdeposit = new CashDepositInBank();
	void Cashdeposit(int AMOUNT) {
		cashdeposit.AmountInBank(AMOUNT);
	}
}

class CashDepositInBank{
	imp passwords = new imp();
	void AmountInBank(int AmountDepositInBank) {
		try {
		FileWriter filewriter = new FileWriter("BANKAMOUNT.txt");
		int AmountDeposit = passwords.AMOUNTINBANK + AmountDepositInBank;
		filewriter.write(new Integer(AmountDeposit).toString());
		filewriter.close();
		}catch(IOException e) {
			
		}
	}
}
