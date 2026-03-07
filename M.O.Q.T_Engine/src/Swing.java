import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Swing {
public static void driver(){

       
	        JFrame frame = new JFrame("My First GUI");
	        // добавляем панель
	        JPanel buttonsPanel = new JPanel(); 
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(300, 300);
	        frame.setLocationRelativeTo(null); // окно в центре экрана
	        JButton start = new JButton("Старт");
	        JButton stop = new JButton("Стоп");
	        // добавляем кнопки на панель
	        buttonsPanel.add(start);
	        buttonsPanel.add(stop);
	        // размещаем панель на Frame (верхняя часть)
	        frame.getContentPane().add(BorderLayout.NORTH, buttonsPanel);
	        frame.setVisible(true);
}
}
