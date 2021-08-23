import java.util.ArrayList;
class game{
public static void main(String[] args){
int numofguess=0;
GameHelper helper=new GameHelper();
SimpleDotCom theDotCom = new SimpleDotCom();
int randomNum=(int)(Math.random()*10);
int [] locations={randomNum,randomNum+1,randomNum+2};
theDotCom.setlocationCells(locations);
boolean isAlive = true;
while(isAlive==true){
	String guess = helper.getUserInput("Enter a number");
	String result = theDotCom.checkYourself(guess);
	numofguess++;
	if(result.equals("kill")){
		isAlive=false;
		System.out.println("You took "+ numofguess+" guesses");
		}
	}
}
}

class SimpleDotCom{

	private ArrayList<String> locationCells;
	public void setlocationCells(ArrayList<String> loc){
		locationCells = loc;
	}
	public String checkYourself(String userInput){
		String result="miss";
		int index = locationCells.indexOf(userInput);
		if(index>=0){
			locationCells.remove(index);
			if(locationCells.isEmpty()){
				result="Kill";
			}
		else{
			result="hit";
			}
		}
		return result;
	}

}