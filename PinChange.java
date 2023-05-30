/*#----------    RICHARD DANY    -----------#
#--------  Author :- SHAIK AFRID   -------# 
# ------    LANGUAGE :- PYTHON    --------#  
# ------  FRAMEWORK :- SELENIUM   --------#
# ------  USES :- WEB AUTOMATION  --------#
# --- DONT TRY TO STEEL MY CODE BITCH  ---# 
*/


package atm;

import java.util.Scanner;

class PinChange{
	imp passwords = new imp();
	Scanner input =new Scanner(System.in); 
	int PinChange(){
		System.out.print("Enter Your Old Pin :- ");
		int oldatmpin = input.nextInt();
		if(oldatmpin == passwords.getMAINPIN() ) {
			return 0;
		}
		else {
			return 1;
		}
		
	}
}

