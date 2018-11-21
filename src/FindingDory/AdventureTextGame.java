package FindingDory;
import java.util.Scanner;
public class AdventureTextGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		tank(input);
         }
	
public static void tank (Scanner input) {
	System.out.println("Welcome to Finding Dory!");
	System.out.println("You are Nemo. You are trying to save Dory.");
	System.out.println("You are currently in your tank you have two options: ");
	System.out.println("You can either clog the filtration system(clog)");
	System.out.println("Or you can pretend to be dead(pretend)");
	String question = input.next();
	while(true) {
		if (question.startsWith("clog")) {
			putinabag(input);
			break;
		}
		else if (question.startsWith("pretend")){
			pretendtobedead(input);
			break;
		}
		else {
			System.out.println("try again");
			break;
		}
		}
      }
public static void putinabag(Scanner input) {
	System.out.println("You were put in a bag to clean the tank");
	System.out.println("You know have to choices you can:");
	System.out.println("Roll left");
	System.out.println("Roll right");
	String question = input.next();
	while(true) {
		if (question.startsWith("left")) {
			left(input);
			break;
		}
		else if (question.startsWith("right")){
			right(input);
			break;
		}
		else {
			System.out.println("try again");
			break;
		}
		}
      }
public static void left(Scanner input) {
	System.out.println("You rolled into a garbage can! ");
	System.out.println("You cannot get out and you werent found");
	System.out.println("You ended up dying");
	}
public static void right(Scanner input) {
	System.out.println("You rolled out of the widow.");
	System.out.println("You have two options:");
	System.out.println("Roll across the street(roll)");
	System.out.println("Get a ride from a pelican(ride)");
	String question = input.next();
	while(true) {
		if (question.startsWith("roll")) {
			acrossthestreet(input);
			break;
		}
		else if (question.startsWith("ride")){
			ridefrompelican(input);
			break;
		}
		else {
			System.out.println("try again");
			break;
		}
		}
      }
public static void acrossthestreet(Scanner input) {
    		System.out.println("You rolled across the street succsesfully!");
    		System.out.println("You are now in the ocean");
    		tookarigth(input);
    				
    	      }
public static void ridefrompelican(Scanner input) {
	System.out.println("You ended up on a boyee in the middle of the ocean with a friendly pelican.");
	System.out.println("You have two options:");
	System.out.println("You can continue to talk to the pelican(talk)");
	System.out.println("You can swim down(swim)");
	String question = input.next();
	while(true) {
		if (question.startsWith("talk")) {
			talktopelican(input);
			break;
		}
		else if (question.startsWith("swim")){
			swimdown(input);
			break;
		}
		else {
			System.out.println("try again");
			break;
		}
		}
      }
      
public static void swimdown(Scanner input) {
	System.out.println("You chose to swim down!");
	System.out.println("You now start to see something in the distance an dstart to swim up to it");
	System.out.println("You have found Dory!");
	System.out.println("Congragulations you have won!!");
       }
public static void talktopelican(Scanner input) {
	System.out.println("You continued to talk to the pelican.");
	System.out.println("You have missed your chance to save Dory and the not so friendly pelican ate you!!");
}
public static void pretendtobedead(Scanner input) {
	System.out.println("You have been flushed.");
	System.out.println("You are now in the sewers!");
	System.out.println("You have two options:");
	System.out.println("You can take a right ");
	System.out.println("You can take a left");
	String question = input.next();
	while(true) {
		if (question.startsWith("right")) {
			tookarigth(input);
			break;
		}
		else if (question.startsWith("left")){
			tookaleft(input);
			break;
		}
		else {
			System.out.println("try again");
			break;
		}
		}
      }
public static void tookaleft(Scanner input) {
 	 System.out.println("You have ended up in the sanatation plant.");           
    	System.out.println("You have inhaled too many chemicals and died!");                                                       
          }
               public static void tookarigth(Scanner input) {
            	 System.out.println("You ended up in the ocean.");           
               	System.out.println("You have two options:");             
               	System.out.println("You can talk to a whale (talk) ");             
               	System.out.println("You can just keep swimming!!(swim)");               
               	String question = input.next();                          
               	while(true) {                                            
               		if (question.startsWith("talk")) {                  
               			talktoawhale(input);                                  
               			break;                                           
               		}                                                    
               		else if (question.startsWith("swim")){             
               			justkeepswimming(input);                                  
               			break;                                           
               		}                                                    
               		else {                                               
               			System.out.println("try again");    
               			break;
               		}                                                    
               		}                                                    
                     }
               
               public static void justkeepswimming(Scanner input) {
              	 System.out.println("You have ran into a jellyfish feild.");           
                 	System.out.println("You have two options:");             
                 	System.out.println("You can swim over it(over)");             
                 	System.out.println("You can test your luck and swim through the jellyfish feild(through)");               
                 	String question = input.next();                          
                 	while(true) {                                            
                 		if (question.startsWith("over")) {                  
                 			swimoverit(input);                                  
                 			break;                                           
                 		}                                                    
                 		else if (question.startsWith("through")){             
                 			 swimthroughit(input);                                  
                 			break;                                           
                 		}                                                    
                 		else {                                               
                 			System.out.println("try again");    
                 			break;
                 		}                                                    
                 		}                                                    
                       }
               public static void swimoverit(Scanner input) {
                	 System.out.println("You chose to swim ove the jelly fish feild.");           
                   	System.out.println("You almost made it but, a fishermen saw you swimming by and thought you would look good in his fish tank at home!");             
                   	System.out.println("You didn't save Dory!");                                                    
                         }
               public static void swimthroughit(Scanner input) {
                	 System.out.println("You chose to test your luck and go through the jellyfish feild.");           
                   	System.out.println("You didnt have enough luck!");             
                   	System.out.println("You got stung one too many times and you died ");             
                   	     }
               public static void talktoawhale(Scanner input) {
                	 System.out.println("You have a conversation with a blue whale."); 
                	 System.out.println("The blue whale tells you that Dory isnt far from you!Infact do you see that boyee over there? She's not to far from there he says!."); 
                   	System.out.println("You have two options:");             
                   	System.out.println("You can swim over to the boyee and trust the whale (swim)");             
                   	System.out.println("You can continue to talk to the whale to get more infromation(talk)");               
                   	String question = input.next();                          
                   	while(true) {                                            
                   		if (question.startsWith("swim")) {                  
                   			youtrustthewhale(input);                                  
                   			break;                                           
                   		}                                                    
                   		else if (question.startsWith("talk")){             
                   			continuetotalktowhale(input);                                  
                   			break;                                           
                   		}                                                    
                   		else {                                               
                   			System.out.println("try again"); 
                   			break;
                   		}                                                    
                   		}                                                    
                         }
               public static void continuetotalktowhale(Scanner input) {
              	 System.out.println("You have and the blue whale have a good conversation."); 
              	 System.out.println("The blue whale tells you that Dory is on the east side of the boyee."); 
                 	System.out.println("Right as you begin to swim over that way to find Dory she gets taken by a boat. ");             
                 	System.out.println("You have lost your chance to get Dory!  "); 
                 	String question = input.next();  
                 	                                                   
                       }
               public static void youtrustthewhale(Scanner input) {
              	 System.out.println("You have trusted the whale!"); 
              	 System.out.println("You get to Dory just in time to get her away from the fishermens boat!"); 
                 	System.out.println("You have saved Dory and win cogragulations");             
                 	String question = input.next();                                
                       }
               
}