import java.util.ArrayList;

/**
 * Program #4
 * @description This program demonstrates hierarchy within Java.
 * 				By creating a parent Class called TradingCard
 * 				other subclasses extend the parent Class and inherit
 * 				field and methods from the parent Class.
 * 
 * CS108-3
 * @date 03/8/2017
 * @author Juan Pina-Sanz
 * 
 *  Program 4, Juan Pina-Sanz, sccs0549
 */

class TradingCard{
	private String game;
	protected String name;
	protected String imageFile;
	
/**
 * 	The TradingCard constructor initializes the fields with
 * 	"". This means that when the object is instantiated with no
 * 	arguments the field values will be empty, but the object will
 * 	still exist.
 */
	public TradingCard(){
		this.game = "";
		this.name = "";
		this.imageFile = "";
	}
	
	/**
	 * This TradingCard constructor accepts a String type
	 * variable as an argument and sets the game variable
	 * to the input String. 
	 * @param game : A String type variable to be passed into the constructor.
	 */
	public TradingCard(String game){
		this.game = game;
		this.name = "";
		this.imageFile = "";
	}
	
	/**
	 * This TradingCard constructor accepts three String type
	 * variables as arguments and sets the game, name and imageFile
	 * fields to the input values.
	 * @param game : A String type variable to be passed into the constructor.
	 * @param name : A String type variable to be passed into the constructor.
	 * @param imageFile : A String type variable to be passed into the constructor.
	 */
	public TradingCard(String game, String name, String imageFile){
		this.game = game;
		this.name = name;
		this.imageFile = imageFile;
	}
	
	/**
	 * The setGame method sets the local private field
	 * 'game' the String type argument, game.
	 * @param game : A String type variable to be passed into the method.
	 */
	public void setGame(String game){
		this.game = game;
	}
	
	/**
	 * The getGame method retrieves the local private field
	 * 'game'.
	 * @return : A String is returned by this method.
	 */
	public String getGame(){
		return this.game;
	}
	
	/**
	 * This method utilizes the private local field game, to print out
	 * the String stored within the variable.
	 */
	public void print(){
		System.out.println(game);
		System.out.println();
	}
	
	/**
	 * The purpose of this method is to act as a method for which the subclass
	 * CharacterCard can override. The method currently prints nothing to the 
	 * console.
	 */
	public void printAll(){
		System.out.println();
	}
	
}

/**
 * This class is a subclass of the TradingCard Class.
 * The CharacterCard Class comes with local fields for 
 * attribute and number. 
 *
 */
class CharacterCard extends TradingCard{

	private String type = "";
	private int number; 

	/**
	 * This CharacterCard constructor calls the superclass constructor
	 * and initializes the game field with the String "Pokemon."
	 */
	public CharacterCard(){
		super("Pokemon");
	}

	/**
	 * This CharacterCard constructor calls the superclass constructor
	 * and initializes the 'game' field with the input String type arguments
	 * and a single int type variable for the 'number' argument.
	 * @param game : A String type variable to be passed into the constructor.
	 * @param name : A String type variable to be passed into the constructor.
	 * @param imageFile : A String type variable to be passed into the constructor.
	 * @param number : A int type variable to be passed into the constructor.
	 * @param attribute : A String type variable to be passed into the constructor.
	 */
	public CharacterCard(String game, String name, String imageFile, 
			int number, String attribute){
		super(game);	
		super.name = name;
		super.imageFile = imageFile;
		this.number = number;
		this.type = attribute;
	}

	/**
	 * This method will set the local field 'type' with a String type
	 * argument.
	 * @param type : A String type variable to be passed into the method.
	 */
	public void setType(String type){
		this.type = type;
	}

	/**
	 * This method will set the local field 'number' with an int type
	 * argument.
	 * @param number : A int type variable to be passed into the method.
	 */
	public void setNumber(int number){
		this.number = number;
	}	
	
	/**
	 * The getType method retrieves the local private field
	 * 'type'.
	 * @return : A String type variable is returned by this method
	 */
	public String getType(){
		return this.type;
	}
	
	/**
	 * The getNumber method retrieves the local private field
	 * 'number'.
	 * @return : An int type variable is returned by this method.
	 */
	public int getNumber(){
		return this.number;
	}

	/**
	 * The updateName method will replace the superclass variable 
	 * 'name', with the input String type argument.
	 * @param name : A String type variable to be passed into the method.
	 */
	public void updateName(String name){
		super.name = name;
	}
	
	/**
	 * This print method will override the print method inherited by the
	 * superclass TradingCard. This means that the print method can be used
	 * by the CharacterCard Class but will have a changed command based on
	 * the newly defined command within 'print'.
	 */
	public void print(){
		System.out.printf("Game: %s\n", this.getGame());
	}
	
	/**
	 * The printAll method will print a detailed summary of the CharacterCard
	 * type object. The method will utilize getters from within the CharacterCard
	 * Class to retrieve both local fields and fields from the superclass. Theses
	 * values will be printed. 
	 */
	public void printAll(){		
		System.out.printf("Game: %s\nName: %s\nImage: %s\nNumber: %d\nAttribute: %s\n\n", 
				super.getGame(), super.name, super.imageFile, this.getNumber(), this.getType() );
	}
}

/**
 * The SportsCard class is a subclass of TradingCard.
 * The SportsCard class comes with the local String type fields,
 * 'team' and 'position', as well as a boolean type field 
 * 'isRookie'.
 *
 */
class SportsCard extends TradingCard{

	private String team = "";
	private String position = "";
	private boolean isRookie;

	/**
	 * This SportsCard constructor calls the superclass constructor
	 * and initializes the 'game' field with the String "Baseball."
	 */
	public SportsCard(){
		super("Baseball");
	}

	/**
	 * This SportsCard constructor calls the superclass constructor
	 * and initializes the 'game' field with the input String type arguments
	 * and single boolean type variable for the 'isRookie' argument. 
	 * @param game : A String type variable to be passed into the constructor.
	 * @param name : A String type variable to be passed into the constructor.
	 * @param imageFile : A String type variable to be passed into the constructor.
	 * @param team : A String type variable to be passed into the constructor.
	 * @param position : A String type variable to be passed into the constructor.
	 * @param isRookie : A boolean type variable to be passed into the constructor.
	 */
	public SportsCard(String game, String name, 
			String imageFile, String team, 
			String position, boolean isRookie){

		super(game,name, imageFile);
		this.team = team;
		this.position = position;
		this.isRookie = isRookie;
	}
	
	/**
	 * The setTeam method will set the local field 'team' with a String type
	 * argument.
	 * @param team : A String type variable to be passed into the method.
	 */
	public void setTeam(String team){
		this.team = team;
	}
	
	/**
	 * The setPosition method will set the local field 'position' with a String type
	 * argument.
	 * @param position : A String type variable to be passed into the method.
	 */
	public void setPosition(String position){
		this.position = position;
	}

	/**
	 * The isRookie method is utilized to check if the CharacterCard object is
	 * a rookie or not based on the 'isRookie' boolean variable.
	 * @return : This method will return a boolean.
	 */
	public boolean isRookie(){
		if(isRookie){
			return true;
		}else{
			return false;
		}
	}

	/**
	 * The getTeam method retrieves the local private field
	 * 'team'.
	 * @return : A String type variable is returned by this method
	 */
	public String getTeam(){
		return this.team;
	}

	/**
	 * The getPosition method retrieves the local private field
	 * 'position'.
	 * @return : A String is returned by this method.
	 */
	public String getPosition(){
		return this.position;
	}

	/**
	 * The printRookie method will return a String value based on the boolean
	 * value of isRookie.
	 * @return : A String is returned by this method.
	 */
	public String printRookie(){
		if (this.isRookie()){
			return "Yes";
		}else{
			return "No";
		}
	}

	/**
	 * The updateName method will replace the superclass variable 
	 * 'name', with the input String type argument.
	 * @param name : A String type variable to be passed into the method.
	 */
	public void updateName(String name){
		super.name = name;
	}

	/**
	 * This print method will override the print method inherited by the
	 * superclass TradingCard. This means that the print method can be used
	 * by the SportsCard Class but will have a changed command based on
	 * the newly defined command within 'print'.
	 */
	public void print(){
		System.out.printf("%s: Is %s, a %s for the %s a rookie? %s\n", 
				super.getGame(), super.name, this.getPosition(), 
				this.getTeam(), this.printRookie());
	}
	
}

/**
 * This Class is the only public class in the program. It contains the public
 * driver 'main' which is used to create instances of the TradingClass object and 
 * print their values using a 'printCard' method written below.
 *
 */
public class CardCollection {

	/**
	 * The driver of this Class creates an ArrayList type object that will hold
	 * values of type TradingCard. An enhanced for-loop is used to run through
	 * every element of the array and print values. Certain Strings within the 
	 * each element are also checked and replaced using the updateName method.
	 */
	public static void main(String[] args){
		ArrayList<TradingCard> cardList = new ArrayList<TradingCard>();
		TradingCard basicCard = new TradingCard();
		TradingCard poke1 = new CharacterCard("Pokemon", "Pikachu", "pikachu.jpg", 25, "Electric");
		TradingCard poke2 = new CharacterCard("Pokemon", "Blastoise", "blastoise.jpg", 9, "Water");
		TradingCard player1 = new SportsCard("Baseball", "Tony Gwynn", "tony.jpg", "The San Diego Padres",
				"Right Fielder", false);

		cardList.add(basicCard); 
		cardList.add(poke1); 
		cardList.add(poke2); 
		cardList.add(player1);
		
		System.out.println("Program 4, Juan Pina-Sanz, sccs0549\n");
		for(TradingCard card : cardList){
			if(card instanceof CharacterCard){
				printCard(card);
				card.printAll();	
			}else{
				printCard(card);
			}
			if(card.name == "Tony Gwynn"){
				((SportsCard)card).updateName("Mr. Padre");
				printCard(card);
			}
			if(card.name == "Blastoise"){
				((CharacterCard)card).updateName("Kamex(Japanese)");
				card.printAll();
			}
			
		}
	}
	
	public static void printCard(TradingCard t){
		System.out.println("Printing...");
		t.print();
	}
}
