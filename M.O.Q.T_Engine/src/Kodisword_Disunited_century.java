import java.util.Scanner;
public class Kodisword_Disunited_century {
public static void start(){
		System.out.println("Open settings");

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

        System.out.println("contune");
		running = false;
		break;
	case 2:

		System.out.println("save");
		running = false;
		break;
	case 3:
		Settings.open();
		System.out.println("Settings(comming soon");
		running = false;
		break;
	case 4:
		System.out.println("Settings");
		running = false;
		break;
	case 5:
		System.out.println("Leave game");
		running = false;
		break;
		default:
            System.out.println("нет такого значения");

        }
}
	scanner.close();

}
}