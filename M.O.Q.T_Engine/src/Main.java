import java.util.*;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.io.*;
import java.util.Properties;
import java.util.HashMap;
import java.util.Map;





public class Main{
	public static void main(String[] args){
System.out.println("M.O.Q.T_Engine Starting");
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
		Game.start();
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
}



