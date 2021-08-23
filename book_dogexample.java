class book_dogexample{
	int size;
	String breed;
	String name;
	void bark()
	{
		System.out.println("Whoof! Whoof!");
	}

}
class dogTest
{
	public static void main(String[] args)
	{
		book_dogexample d= new book_dogexample();
		d.size=40;
		d.bark();
		
	}
}