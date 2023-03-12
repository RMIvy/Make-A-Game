package application;

public class GameGeneration extends NewGeneration {
	
	public String generateTitle() {
		//defining the range
		final int max = 60;
		final int min = 1;
	    int range = max - min + 1;
	    
	    //random number and word variables
	    int whoknows = (int)(Math.random() * range) + min;
	    String mystery = "";
	    
	    //getting the random word from the random number
	    switch (whoknows) {
	    case 1:
	    	mystery = "Game";
	    	break;
	    case 2:
	    	mystery = "Ivy";
	    	break;
	    case 3:
	    	mystery = "Circumference";
	    	break;
	    case 4:
	    	mystery = "Enlightenment";
	    	break;
	    case 5:
	    	mystery = "Decorate";
	    	break;
	    case 6:
	    	mystery = "Symbol";
	    	break;
	    case 7:
	    	mystery = "Plagiarism";
	    	break;
	    case 8:
	    	mystery = "Faux";
	    	break;
	    case 9:
	    	mystery = "Energy";
	    	break;
	    case 10:
	    	mystery = "Pancake";
	    	break;
	    case 11:
	    	mystery = "Stupid";
	    	break;
	    case 12:
	    	mystery = "School";
	    	break;
	    case 13:
	    	mystery = "Text";
	    	break;
	    case 14:
	    	mystery = "Yahoo";
	    	break;
	    case 15:
	    	mystery = "Sauce";
	    	break;	
		case 16:
	        mystery = "Rod";
	        break;
		case 17:
	        mystery = "Circle";
	        break;
		case 18:
	        mystery = "Yogurt";
	        break;
		case 19:
	        mystery = "Blue";
	        break;
		case 20:
	        mystery = "Spoon";
	        break;
		case 21:
	        mystery = "Passion";
	        break;
		case 22:
	        mystery = "Clown";
	        break;
		case 23:
	        mystery = "Ocean";
	        break;
	    case 24:
	    	mystery = "Igloo";
	    	break;
	    case 25:
	    	mystery = "Electricity";
	    	break;
	    case 26:
	    	mystery = "Spook";
	    	break;
	    case 27:
	    	mystery = "Schism";
	    	break;
	    case 28:
	    	mystery = "Suit";
	    	break;
	    case 29:
	    	mystery = "Ruin";
	    	break;
	    case 30:
	    	mystery = "Star";
	    	break;
	    case 31:
	    	mystery = "Dimension";
	    	break;
	    case 32:
	    	mystery = "Feedback";
	    	break;
	    case 33:
	    	mystery = "Nation";
	    	break;
	    case 34:
	    	mystery = "Treat";
	    	break;
	    case 35:
	    	mystery = "Case";
	    	break;
	    case 36:
	    	mystery = "Shelf";
	    	break;
	    case 37:
	    	mystery = "Advise";
	    	break;
	    case 38:
	    	mystery = "Ministry";
	    	break;
	    case 39:
	    	mystery = "Origin";
	    	break;
	    case 40:
	    	mystery = "Exceed";
	    	break;
	    case 41:
	    	mystery = "Greeting";
	    	break;
	    case 42:
	    	mystery = "Obesity";
	    	break;
	    case 43:
	    	mystery = "Criminal";
	    	break;
	    case 44:
	    	mystery = "Wrong";
	    	break;
	    case 45:
	    	mystery = "Easy";
	    	break;	
		case 46:
	        mystery = "Truth";
	        break;
		case 47:
	        mystery = "Format";
	        break;
		case 48:
	        mystery = "Disscussion";
	        break;
		case 49:
	        mystery = "Giant";
	        break;
		case 50:
	        mystery = "Responsible";
	        break;
		case 51:
	        mystery = "Suspect";
	        break;
		case 52:
	        mystery = "Morsel";
	        break;
		case 53:
	        mystery = "Entry";
	        break;
	    case 54:
	    	mystery = "Unknown";
	    	break;
	    case 55:
	    	mystery = "Deviation";
	    	break;
	    case 56:
	    	mystery = "Sweep";
	    	break;
	    case 57:
	    	mystery = "Nest";
	    	break;
	    case 58:
	    	mystery = "Diagram";
	    	break;
	    case 59:
	    	mystery = "Technique";
	    	break;
	    case 60:
	    	mystery = "Title";
	    	break;
	    	
	    }

	    //setting the random word
	    return mystery;
	}
	
	public String generateSubtitle() {
		//determining if there will be a sequel number
		int decision = (int)(Math.random() * 2) + 1;
		if (decision == 1) {
			//defining the range
			final int max = 60;
			final int min = 1;
		    int range = max - min + 1;
		    
		    //random number and word variables
		    int whoknows = (int)(Math.random() * range) + min;
		    String mystery = "";
		    
		    //getting the random word from the random number
		    switch (whoknows) {
		    case 1:
		    	mystery = "Game";
		    	break;
		    case 2:
		    	mystery = "Ivy";
		    	break;
		    case 3:
		    	mystery = "Circumference";
		    	break;
		    case 4:
		    	mystery = "Enlightenment";
		    	break;
		    case 5:
		    	mystery = "Decorate";
		    	break;
		    case 6:
		    	mystery = "Symbol";
		    	break;
		    case 7:
		    	mystery = "Plagiarism";
		    	break;
		    case 8:
		    	mystery = "Faux";
		    	break;
		    case 9:
		    	mystery = "Energy";
		    	break;
		    case 10:
		    	mystery = "Pancake";
		    	break;
		    case 11:
		    	mystery = "Stupid";
		    	break;
		    case 12:
		    	mystery = "School";
		    	break;
		    case 13:
		    	mystery = "Text";
		    	break;
		    case 14:
		    	mystery = "Yahoo";
		    	break;
		    case 15:
		    	mystery = "Sauce";
		    	break;	
			case 16:
		        mystery = "Rod";
		        break;
			case 17:
		        mystery = "Circle";
		        break;
			case 18:
		        mystery = "Yogurt";
		        break;
			case 19:
		        mystery = "Blue";
		        break;
			case 20:
		        mystery = "Spoon";
		        break;
			case 21:
		        mystery = "Passion";
		        break;
			case 22:
		        mystery = "Clown";
		        break;
			case 23:
		        mystery = "Ocean";
		        break;
		    case 24:
		    	mystery = "Igloo";
		    	break;
		    case 25:
		    	mystery = "Electricity";
		    	break;
		    case 26:
		    	mystery = "Spook";
		    	break;
		    case 27:
		    	mystery = "Schism";
		    	break;
		    case 28:
		    	mystery = "Suit";
		    	break;
		    case 29:
		    	mystery = "Ruin";
		    	break;
		    case 30:
		    	mystery = "Star";
		    	break;
		    case 31:
		    	mystery = "Dimension";
		    	break;
		    case 32:
		    	mystery = "Feedback";
		    	break;
		    case 33:
		    	mystery = "Nation";
		    	break;
		    case 34:
		    	mystery = "Treat";
		    	break;
		    case 35:
		    	mystery = "Case";
		    	break;
		    case 36:
		    	mystery = "Shelf";
		    	break;
		    case 37:
		    	mystery = "Advise";
		    	break;
		    case 38:
		    	mystery = "Ministry";
		    	break;
		    case 39:
		    	mystery = "Origin";
		    	break;
		    case 40:
		    	mystery = "Exceed";
		    	break;
		    case 41:
		    	mystery = "Greeting";
		    	break;
		    case 42:
		    	mystery = "Obesity";
		    	break;
		    case 43:
		    	mystery = "Criminal";
		    	break;
		    case 44:
		    	mystery = "Wrong";
		    	break;
		    case 45:
		    	mystery = "Easy";
		    	break;	
			case 46:
		        mystery = "Truth";
		        break;
			case 47:
		        mystery = "Format";
		        break;
			case 48:
		        mystery = "Disscussion";
		        break;
			case 49:
		        mystery = "Giant";
		        break;
			case 50:
		        mystery = "Responsible";
		        break;
			case 51:
		        mystery = "Suspect";
		        break;
			case 52:
		        mystery = "Morsel";
		        break;
			case 53:
		        mystery = "Entry";
		        break;
		    case 54:
		    	mystery = "Unknown";
		    	break;
		    case 55:
		    	mystery = "Deviation";
		    	break;
		    case 56:
		    	mystery = "Sweep";
		    	break;
		    case 57:
		    	mystery = "Nest";
		    	break;
		    case 58:
		    	mystery = "Diagram";
		    	break;
		    case 59:
		    	mystery = "Technique";
		    	break;
		    case 60:
		    	mystery = "Subtitle";
		    	break;
		    }
		    //setting the random word
		    return mystery;
		    }
		else {
			return "";
		}
	}
	
	public String generateSQN() {
		//determining if there will be a sequel number
		int decision = (int)(Math.random() * 2) + 1;
		if (decision == 1) {
			//defining the range
			final int max = 20;
			final int min = 2;
		    int range = max - min + 1;
		    
		    //random number and word variables
		    int whoknows = (int)(Math.random() * range) + min;
		    
		    //setting the random number
		    return String.valueOf(whoknows);
		}
		else {
			return "";
		}
	}

	public String generateGenre() {
		final int max = 20;
		final int min = 1;
	    int range = max - min + 1;
	    
	    //random number and word variables
	    int whoknows = (int)(Math.random() * range) + min;
	    String mystery = "";
	    
	    //getting the random word from the random number
	    switch (whoknows) {
	    case 1:
	    	mystery = "Platformer";
	    	break;
	    case 2:
	    	mystery = "Action";
	    	break;
	    case 3:
	    	mystery = "Horror";
	    	break;
	    case 4:
	    	mystery = "Sports";
	    	break;
	    case 5:
	    	mystery = "Stealth";
	    	break;
	    case 6:
	    	mystery = "Survival";
	    	break;
	    case 7:
	    	mystery = "Sandbox";
	    	break;
	    case 8:
	    	mystery = "RPG";
	    	break;
	    case 9:
	    	mystery = "Puzzle";
	    	break;
	    case 10:
	    	mystery = "Party";
	    	break;
	    case 11:
	    	mystery = "Simulation";
	    	break;
	    case 12:
	    	mystery = "RTS";
	    	break;
	    case 13:
	    	mystery = "Battle Royale";
	    	break;
	    case 14:
	    	mystery = "MOBA";
	    	break;
	    case 15:
	    	mystery = "First-Person Shooter";
	    	break;
	    case 16:
	    	mystery = "Third-Person Shooter";
	    	break;
	    case 17:
	    	mystery = "Second-Person Shooter?"; // my favorite
	    	break;
	    case 18:
	    	mystery = "MMO";
	    	break;
	    case 19:
	    	mystery = "Fighting";
	    	break;
	    case 20:
	    	mystery = "Action-adventure";
	    	break;
	    case 21:
	    	mystery = "Metroidvania";
	    	break;
	    case 22:
	    	mystery = "Rhythm";
	    	break;
	    case 23:
	    	mystery = "Visual Novel"; // I am deeply afraid.
	    	break;
	    case 24:
	    	mystery = "Rougelike";
	    	break;
	    case 25:
	    	mystery = "Tower Defense";
	    	break;
	    case 26:
	    	mystery = "Racing";
	    	break;
	    case 27:
	    	mystery = "Exercise";
	    	break;
	    case 28:
	    	mystery = "Educational";
	    	break;
	    case 29:
	    	mystery = "Strategy";
	    	break;
	    case 30:
	    	mystery = "Social Deduction"; // amogus ;)
	    	break;
	    }
	    
	    //setting the random word
	    return mystery;
	}
	
	public String generatePlatform() {
		//defining the range
		final int max = 36;
		final int min = 1;
	    int range = max - min + 1;
	    
	    //random number and word variables
	    int whoknows = (int)(Math.random() * range) + min;
	    String mystery = "";
	    
	    //getting the random word from the random number
	    switch (whoknows) {
	    case 1:
	    	mystery = "PC";
	    	break;
	    case 2:
	    	mystery = "Mac";
	    	break;
	    case 3:
	    	mystery = "Steam Deck";
	    	break;
	    case 4:
	    	mystery = "Nintendo Switch";
	    	break;
	    case 5:
	    	mystery = "Sony PlayStation 5";
	    	break;
	    case 6:
	    	mystery = "Sony PlayStation 4";
	    	break;
	    case 7:
	    	mystery = "Microsoft Xbox Series X"; // this name sucks lol
	    	break;
	    case 8:
	    	mystery = "Microsoft Xbox One";
	    	break;
	    case 9:
	    	mystery = "Nintendo Wii U";
	    	break;
	    case 10:
	    	mystery = "Nintendo 3DS";
	    	break;
	    case 11:
	    	mystery = "Nintendo DS";
	    	break;
	    case 12:
	    	mystery = "Nintendo Wii";
	    	break;
	    case 13:
	    	mystery = "Nintendo Game Boy Advance";
	    	break;
	    case 14:
	    	mystery = "Nintendo Gamecube";
	    	break;
	    case 15:
	    	mystery = "Nintendo Game Boy";
	    	break;
	    case 16:
	    	mystery = "Nintendo 64";
	    	break;
	    case 17:
	    	mystery = "Super Nintendo Entertainment System";
	    	break;
	    case 18:
	    	mystery = "Nintendo Entertainment System";
	    	break;
	    case 19:
	    	mystery = "Nintendo Virtual Boy"; // that one
	    	break;
	    case 20:
	    	mystery = "Sony PlayStation 3";
	    	break;
	    case 21:
	    	mystery = "Sony PlayStation 2";
	    	break;
	    case 22:
	    	mystery = "Sony PlayStation 1";
	    	break;
	    case 23:
	    	mystery = "Sony PlayStation Vita";
	    	break;
	    case 24:
	    	mystery = "Sony PlayStation Portable";
	    	break;
	    case 25:
	    	mystery = "Literally Just Dust"; // funny
	    	break;
	    case 26:
	    	mystery = "Microsoft Xbox 360";
	    	break;
	    case 27:
	    	mystery = "Microsoft Xbox";
	    	break;
	    case 28:
	    	mystery = "Sega Dreamcast";
	    	break;
	    case 29:
	    	mystery = "Sega Saturn"; // who?
	    	break;
	    case 30:
	    	mystery = "Sega Genesis";
	    	break;
	    case 31:
	    	mystery = "Sega Master System";
	    	break;
	    case 32:
	    	mystery = "Mobile";
	    	break;
	    case 33:
	    	mystery = "VR";
	    	break;
	    case 34:
	    	mystery = "Samsung Smart Fridge"; // my favorite
	    	break;
	    case 35:
	    	mystery = "Google Stadia"; // that was a thing
	    	break;
	    case 36:
	    	mystery = "Amazon Luna";
	    	break;
	    }
				    
		//setting the random word
		return mystery;
	}
	
	public String generateDev() {
		//defining the range
		final int max = 32;
		final int min = 1;
	    int range = max - min + 1;
	    
	    //random number and word variables
	    int whoknows = (int)(Math.random() * range) + min;
	    String mystery = "";
	    
	    //getting the random word from the random number
	    switch (whoknows) {
	    case 1:
	    	mystery = "Nintendo";
	    	break;
	    case 2:
	    	mystery = "Microsoft";
	    	break;
	    case 3:
	    	mystery = "Sony";
	    	break;
	    case 4:
	    	mystery = "Valve";
	    	break;
	    case 5:
	    	mystery = "Epic Games";
	    	break;
	    case 6:
	    	mystery = "Ubisoft";
	    	break;
	    case 7:
	    	mystery = "Activision Blizzard"; // >:(
	    	break;
	    case 8:
	    	mystery = "Electronic Arts";
	    	break;
	    case 9:
	    	mystery = "Rockstar Games";
	    	break;
	    case 10:
	    	mystery = "2K Games";
	    	break;
	    case 11:
	    	mystery = "Indie";
	    	break;
	    case 12:
	    	mystery = "You!"; // That's you!
	    	break;
	    case 13:
	    	mystery = "Gearbox Software";
	    	break;
	    case 14:
	    	mystery = "Bungie";
	    	break;
	    case 15:
	    	mystery = "Bethesda Softworks";
	    	break;
	    case 16:
	    	mystery = "ID Software";
	    	break;
	    case 17:
	    	mystery = "Devoler Digital";
	    	break;
	    case 18:
	    	mystery = "HAL Laboroties";
	    	break;
	    case 19:
	    	mystery = "HAL Laboroties";
	    	break;
	    case 20:
	    	mystery = "Video Game Company"; // I know those guys!
	    	break;
	    case 21:
	    	mystery = "Landfall Games"; // Small studio, but I really like their stuff :)
	    	break;
	    case 22:
	    	mystery = "Embracer Group";
	    	break;
	    case 23:
	    	mystery = "THQ";
	    	break;
	    case 24:
	    	mystery = "Capcom";
	    	break;
	    case 25:
	    	mystery = "Bandai Namco";
	    	break;
	    case 26:
	    	mystery = "Konami";
	    	break;
	    case 27:
	    	mystery = "Square Enix";
	    	break;
	    case 28:
		    mystery = "Sega";
		    break;
	    case 29:
		    mystery = "Annapurna Games";
		    break;
	    case 30:
		    mystery = "Team17";
		    break;
	    case 31:
		    mystery = "Tencent Games";
		    break;
		case 32:
			mystery = "Riot Games";
			break;
	    }
		    
		    //setting the random word
		    return mystery;
	}
	
	public String generateDay() {
		//defining the range
		final int max = 31;
		final int min = 1;
	    int range = max - min + 1;
	    
	    //random number and word variables
	    int whoknows = (int)(Math.random() * range) + min;
	    
	    //setting the random number
	    return String.valueOf(whoknows);
	}
	
	public String generateMonth() {
		//defining the range
		final int max = 12;
		final int min = 1;
	    int range = max - min + 1;
	    
	    //random number and word variables
	    int whoknows = (int)(Math.random() * range) + min;
	    String mystery = "";
	    
	    //getting the random word from the random number
	    switch (whoknows) {
	    case 1:
	    	mystery = "January";
	    	break;
	    case 2:
	    	mystery = "February";
	    	break;
	    case 3:
	    	mystery = "March";
	    	break;
	    case 4:
	    	mystery = "April";
	    	break;
	    case 5:
	    	mystery = "May";
	    	break;
	    case 6:
	    	mystery = "June";
	    	break;
	    case 7:
	    	mystery = "July";
	    	break;
	    case 8:
	    	mystery = "August";
	    	break;
	    case 9:
	    	mystery = "September";
	    	break;
	    case 10:
	    	mystery = "October";
	    	break;
	    case 11:
	    	mystery = "November";
	    	break;
	    case 12:
	    	mystery = "December";
	    	break;
	    }
	    
	    //setting the random word
	    return mystery;
	}
	
	public String generateYear() {
		//defining the range
		final int max = 40;
		final int min = 0;
	    int range = max - min + 1;
	    
	    //random number and word variables
	    int whoknows = (int)(Math.random() * range) + min;
	    
	    //this addition is to make the year somewhat realistic (even though it can roll the date as February 31, but uhhhhhh just ignore that)
	    whoknows += 1985;
	    
	    //setting the random number
	    return String.valueOf(whoknows);
	}
	
}