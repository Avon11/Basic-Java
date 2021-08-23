class Movie
{
	String title;
	String genre;
	int rating;
	
	void playit()
	{
		System.out.println("Playing the movie!!!");
		System.out.println(title);
		System.out.println(genre);
		System.out.println(rating);	
	}
}
class MovieTest
{
	public static void main(String [] args)
	{
		Movie one=new Movie();
		one.title="Race 3";
		one.genre="Action/Adventure";
		one.rating=-10;
		one.playit();
		Movie two=new Movie();
		two.title="Iron man";
		two.genre="Action/Sci-fi";
		two.rating=98;
		two.playit();
		Movie three=new Movie();
		three.title="Mirzapur";
		three.genre="Action/Thriller/Adventure";
		three.rating=95;
		three.playit();
	}
}