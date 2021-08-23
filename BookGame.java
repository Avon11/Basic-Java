class Guessgame
{
Player p1;
Player p2;
Player p3;

public void startgame()
{
p1=new Player();
p2=new Player();
p3=new Player();

int guessp1=0;
int guessp2=0;
int guessp3=0;

boolean p1isright=false; 
boolean p2isright=false; 
boolean p3isright=false; 

int targetNumber = (int) (Math.random()*10);
System.out.println("Iam thinking about a number between 0 and 9..."+"\n");

while(true){
System.out.println("Number to guess is "+targetNumber+"\n");

p1.guess();
p2.guess();
p3.guess();

guessp1=p1.number;
System.out.println("Player 1 gueesed number "+guessp1+"\n");
guessp2=p2.number;
System.out.println("Player 2 gueesed number "+guessp2+"\n");
guessp3=p3.number;
System.out.println("Player 3 gueesed number "+guessp3+"\n");

if(guessp1==targetNumber)
{
p1isright=true;
}
if(guessp2==targetNumber)
{
p2isright=true;
}
if(guessp3==targetNumber)
{
p3isright=true;
}

if(p1isright || p2isright || p3isright)
{
System.out.println("We have a Winner!!!"+"\n");
System.out.println("Player 1 got it right? "+p1isright+"\n" );
System.out.println("Player 2 got it right? "+p2isright +"\n");
System.out.println("Player 3 got it right? "+p3isright+"\n" );
System.out.println("Game Over, Go home!!!");
break;
}
else{
System.out.println("U all are looserss!!!"+"\n");
}
}
}
}
class Player{
int number=0;

void guess()
{
number=(int)(Math.random()*10);
System.out.println("Iam guessing "+number+"\n");
}
}
class BookGame{
public static void main(String [] args)
{
Guessgame game=new Guessgame();
game.startgame();
}
}





 







