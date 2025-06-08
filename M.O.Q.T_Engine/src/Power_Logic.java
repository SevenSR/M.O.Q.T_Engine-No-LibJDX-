import java.util.Scanner;
public class Power_Logic {
public static void working(){

Scanner scanner = new Scanner(System.in);
System.out.println("выбери действие");
Game game = new Game();
Editor editor = new Editor();
Settings settings = new Settings();    
boolean running = true;
int number =0;
while ( running){
	System.out.println("1: The game");
	System.out.println("2: Redact & Create");
	System.out.println("3: Settings");
        System.out.println("4: Leave game");
	System.out.println("5: Leave engine");

	number = scanner.nextInt();

switch(number) {
	case 1:
		Gm_Logic();
        System.out.println("the game(comming soon");
		running = false;
		break;
	case 2:
		Editor.start();
		System.out.println("Redact & Create [Working]");
		running = false;
		break;
	case 3:
		Settings.open();
		System.out.println("Settings(comming soon");
		running = false;
		break;
	case 4:
		System.out.println("Leave game");
		running = false;
		break;
	case 5:
		System.out.println("Leave engine");
		System.exit(0);
		break;
		default:
            System.out.println("нет такого значения");

        }
}
	scanner.close();

}
public static void Gm_Logic(){
        System.out.println("Game start");

boolean running = true;        
int number =0;
while ( running){
	System.out.println("1: продолжить");
	System.out.println("2: загрузить");
	System.out.println("3: сохранить");
        System.out.println("4: Settings");
	System.out.println("5: Main Menu");
Scanner scanner = new Scanner(System.in);
	number = scanner.nextInt();


switch(number) {
	case 1:
	
		break;
	case 2:
	
		break;
        
	case 3:
	
		break;
	case 4:
		Settings.open();
		System.out.println("Settings(comming soon");
		break;
        case 5:
		System.out.println("Main Menu");
        	Power_Logic.working(); 

        break;
		default:
            System.out.println("нет такого значения");

        }
       		
}
		
	}
}


