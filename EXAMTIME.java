import java.util.Scanner;
class EXAMTIME
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();
		while(t-->0) {

			String fin = "";

			int dragon_dsa = scan.nextInt();
			int dragon_toc = scan.nextInt();
			int dragon_dm = scan.nextInt();

			int sloth_dsa = scan.nextInt();
			int sloth_toc = scan.nextInt();
			int sloth_dm = scan.nextInt();

			int dragon_total = dragon_dm + dragon_toc + dragon_dsa;
			int sloth_total = sloth_dm + sloth_toc + sloth_dsa;
			fin = ((dragon_total) > (sloth_total)) ? "dragon" : "sloth";

			if(dragon_total == sloth_total) {

				if(dragon_dm > sloth_dm)
				{
					fin = "dragon";
				}
				else
				{
					fin = "sloth";
				}

				if(dragon_toc > sloth_toc) 
				{
					fin = "dragon";
				}
				else
				{
					fin = "sloth";
				}

				if(dragon_dsa > sloth_dsa)
				{
					fin = "dragon";
				}
				if(dragon_dsa < sloth_dsa)
				{
					fin = "sloth";
				}

				if(dragon_dsa == sloth_dsa && dragon_toc == sloth_toc && dragon_dm == sloth_dm)
				{
					fin = "Tie";
				}

				

				
			}
			System.out.println(fin);
 
		}
	}
}