
class simpleDotCom{
	public static void main(String [] args){
		simpleDotComGame dot=new simpleDotComGame();
		int[] locations={2,4,6};
		dot.setLocationCells(locations);
		String userGuess="2";
		String result=dot.checkYourself(userGuess);
		
	}
}
class simpleDotComGame{
	int [] locationCells;
	int numOfHits=0;
	public String checkYourself(String stringGuess){
		int guess=Integer.parseInt(stringGuess);
		String result="miss";
		for(int cell:locationCells){
			if(guess==cell){
				result="hit";
				numofHits++;
				break;
			}
		}
		if(numofHits == locationCells.lenght){
			result="kill";
		}
		System.out.println(result);
		return result;
	}

}
