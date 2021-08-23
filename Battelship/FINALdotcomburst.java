import java.util.*;
public class FINALdotcomburst{
	private GameHelper helper =new GameHelper();
	private ArrayList<dotcom> dotcomlist= new Arraylist<dotcom>();
	private int numOfGuess=0;
	
	private void setUPGame(){
		dotcom one = new dotcom();
		one.setName("Pet.com");
		dotcom two = new dotcom();
		two.setName("eToy.com");
		dotcom three = new dotcom();
		three.setName("Go2.com");
		dotcomlist.add(one);
		dotcomlist.add(two);
		dotcomlist.add(three);
		
		System.out.println("Your goal is to sink three dot com.");
		System.out.println("Pet.com,eToy.com,Go2.com");
		System.out.println("Try to sink them all in fewest no. of guesses");
		
		for(dotcom dotcomtoset:dotcomlist){
			ArrayList<String> newLocation=helper.placeDotCom(3);
			dotcomtoset.setLocationCells(newLocation);
		}
	}
	private void startPlaying(){
		while(!dotcomlist.isEmpty()){
			String userGuess = helper.getUserInput("Enter a guess");
			checkUserGuess(userGuess);
			}
		finishGame();
	}
	
	private void checkUserGuess(String userGuess){
		numOfGuess++;
		String result="miss";
		for(FINALdotcom:dotcomlist){
		result=dotComToTest.checkYouself(userGuess);
		if(result.equals("kill")){
			break;
			}
		if(result.equals("kill")){
			dotcomlist.remove(dotComToTest);
			break;
			}
		}
		System.out.println(result);
	}
	private void finishGame(){
		System.out.println("All dot com are dead! Your Stock is not worthless.");
		if(noOfGuess<=18){
			System.out.println("IT only took you " + noOfGuess+" guesses");
			}
		else{
			System.out.println("IT only took you " + noOfGuess+" guesses");
			System.out.println("A 5th grade child and do better than you");
		}
	}
	public static void main(String [] args){
		FINALdotcomburst game = new FINALdotcomburst();
		game.setUpGame();
		game.startPlaying();
	}
}
			