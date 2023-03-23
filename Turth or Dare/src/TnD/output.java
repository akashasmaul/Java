package TnD;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public final class output extends Dare {
	static void output() {
		try{
			File f1 = new File("tnd.txt");
			FileWriter fw = new FileWriter(f1);
			fw.write("\t\t****Truth Or Dare****\n");
			fw.write("Your Name: "+Info.name+"\n");
			fw.write("Reciever Name: "+Info.toname+"\n");
			if (op==1) {
				fw.write("Truth:\n");
				fw.write("1: love or money? :" +tone+"\n");
				fw.write("2: what am i to you? :" +ttwo+"\n");
				fw.write("3: number of relationships till now ? :" +tthree+"\n");
				fw.write("4: would you unfriend me for someone else? :" +tfour+"\n");
				fw.write("5: single or taken?:" +tfive+"\n");
				fw.write("6: name your ex-crush?" +tsix+"\n");
				fw.write("7: what you like in me? :" +tseven+"\n");
				fw.write("8: current crush name? :" +teight+"\n");
				fw.write("9: do you want my number? :" +tnine+"\n");
				fw.write("10: do you like me? :" +tten+"\n");
				fw.write("11: what will be your answer if i propose you? :" +televen+"\n");
				fw.write("\nthank you for playing this game\n");
			}
			else if (op==2) {
				fw.write("Dare:\n");
				fw.write("1.send me your last pic you clicked with your mobile :" +done+"\n");
				fw.write("2. give me your whatsapp no. :" +dtwo+"\n");
				fw.write("3. dedicate me a song. :" +dthree+"\n");
				fw.write("4. send me ur crush/lover pic :" +dfour+"\n");
				fw.write("\nthank you for playing this game\n");
			}
		      fw.close();
		      BufferedReader br = new BufferedReader(new FileReader("tnd.txt"));
		      String line;
		      while ((line = br.readLine()) != null) {
		    	  System.out.println("\n\n\n");
		        System.out.println(line);
		        
		      }
		      
		}
			catch(Exception e){
				System.out.println(e);
				
			}
}
}
