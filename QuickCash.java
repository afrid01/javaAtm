/*#----------    RICHARD DANY    -----------#
#--------  Author :- SHAIK AFRID   -------# 
# ------    LANGUAGE :- PYTHON    --------#  
# ------  FRAMEWORK :- SELENIUM   --------#
# ------  USES :- WEB AUTOMATION  --------#
# --- DONT TRY TO STEEL MY CODE BITCH  ---# 
*/


package atm;

import java.util.Scanner;

class QuickCash{
	Scanner input = new Scanner(System.in);
	imp passwords = new imp();
	int QuickCash(){
		String a = "1 = 500                                           3 = 5000";
		String b = "2 = 2000                                          4 = 10000";
		System.out.println(a);
		System.out.println(b);
		System.out.print("Enter Your Option  :- ");
		int quickcashoption = input.nextInt();
		switch(quickcashoption) {
		case 1:
			if(passwords.AMOUNTINBANK < 500) {
				return 1;
			}
			else if(passwords.AMOUNTINBANK >= 500) {
				return 500;
			}
			break;
		case 2:
			if(passwords.AMOUNTINBANK < 2000) {
				return 1;
			}
			else if(passwords.AMOUNTINBANK >= 2000) {
				return 2000;
			}
			break;
		case 3:
			if(passwords.AMOUNTINBANK < 5000) {
				return 1;
			}
			else if(passwords.AMOUNTINBANK >= 500) {
				return 5000;
			}
			break;
		case 4:
			if(passwords.AMOUNTINBANK < 10000) {
				return 1;
			}
			else if(passwords.AMOUNTINBANK >= 10000) {
				return 10000;
			}
			break;
		default:
			return 2;
		
		}
		return 3;
	}
}