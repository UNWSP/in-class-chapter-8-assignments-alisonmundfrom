package parallelarrays;

import java.lang.reflect.Array;

import javax.swing.JOptionPane;

public class ThreeParallelArrays {

	public static void main(String[] args) {
		String states[] = {"Alabama","Alaska","Arizona","Arkansas","California","Colorado","Connecticut","Delaware","Florida","Georgia","Hawaii","Idaho","Illinois","Indiana","Iowa","Kansas","Kentucky","Louisiana","Maine","Maryland","Massachusetts","Michigan","Minnesota","Mississippi","Missouri","Montana","Nebraska","Nevada","New Hampshire","New Jersey","New Mexico","New York","North Carolina","North Dakota","Ohio","Oklahoma","Oregon","Pennsylvania","Rhode Island","South Carolina","South Dakota","Tennessee","Texas","Utah","Vermont","Virginia","Washington","West Virginia","Wisconsin","Wyoming"};
		String statesAbbreviation[] = {"AL","AK","AZ","AR","CA","CO","CT","DE","FL","GA","HI","ID","IL","IN","IA","KS","KY","LA","ME","MD","MA","MI","MN","MS","MO","MT","NE","NV","NH","NJ","NM","NY","NC","ND","OH","OK","OR","PA","RI","SC","SD","TN","TX","UT","VT","VA","WA","WV","WI","WY"};
		String capitals[] = {"Montgomery","Juneau","Phoenix","Little Rock","Sacramento","Denver","Hartford","Dover","Tallahassee","Atlanta","Honolulu","Boise","Springfield","Indianapolis","Des Moines","Topeka","Frankfort","Baton Rouge","Augusta","Annapolis","Boston","Lansing","St. Paul","Jackson","Jefferson City","Helena","Lincoln","Carson City","Concord","Trenton","Santa Fe","Albany","Raleigh","Bismarck","Columbus","Oklahoma City","Salem","Harrisburg","Providence","Columbia","Pierre","Nashville","Austin","Salt Lake City","Montpelier","Richmond","Olympia","Charleston","Madison","Cheyenne"};
		
		while(true) {
			String state = JOptionPane.showInputDialog(null, "Enter a state name");
			
			int index=-1;
			
			for(int i=0; i<50; i++) {if(states[i].equals(state)) {index=i; break;}}
			
			if(index!=-1) {
				String abbrev = statesAbbreviation[index];
				String capital = capitals[index];
				JOptionPane.showMessageDialog(null, "The abbreviation for " + state + 
						" is " + abbrev + " and the capitol is " + capital + "\n");
				String zip = JOptionPane.showInputDialog(null, "Enter the zip code for " + capital);
				Array.set(capitals, index, capital + "-" + zip);
			}
			else {System.out.print("That is not a valid state, please try again. \n");
			
			String exit = JOptionPane.showInputDialog(null, "Would you like to exit? (y or n)");
			if(exit.equals("y")) {break;}
			
			}
		}
	}
}