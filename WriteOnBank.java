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

class writebankamount{
	imp passwords = new imp();
	   public void Writebankamount(int amount) {
		 try {
		 FileWriter filewrite = new FileWriter("BANKAMOUNT.txt");
		 //new Integer(comb).toString()
		 int balanceinbank = passwords.AMOUNTINBANK - amount;
		 filewrite.write(new Integer(balanceinbank).toString());
		 filewrite.close();
		 
		 }
		 catch (IOException e){
			 System.out.println("Error Code 52");
		 }
	 }
}
