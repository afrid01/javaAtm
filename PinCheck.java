/*#----------    RICHARD DANY    -----------#
#--------  Author :- SHAIK AFRID   -------# 
# ------    LANGUAGE :- PYTHON    --------#  
# ------  FRAMEWORK :- SELENIUM   --------#
# ------  USES :- WEB AUTOMATION  --------#
# --- DONT TRY TO STEEL MY CODE BITCH  ---# 
*/

package atm;

import java.util.Scanner;

class PinCheck{
	imp passwords = new imp();
	Scanner input = new Scanner(System.in);
	int pinCheck(){
		System.out.print("Please Enter Your Pin :- ");
		int pinCheck = input.nextInt();
		if(pinCheck == passwords.getMAINPIN()) {
			return 0;
		}
		else {
			return 1;
		}
		
	}
}