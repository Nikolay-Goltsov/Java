/**
 * 
 */
package ru.home.nikolai_goltsov;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * @author Hakers
 *
 */
public class Call extends JFrame {
	int firstValue = 0;
	String operation = "+";

	Call() {
		setBounds(300, 300, 300, 300);
		setLayout(new BorderLayout());
		JTextArea display = new JTextArea(); // Дисплей
		JPanel buttonPanel = new JPanel(new GridLayout(3, 5));// панель с кнопками
		// добавление кнопок
		JButton button0 = new JButton("0");
		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		JButton button4 = new JButton("4");
		JButton button5 = new JButton("5");
		JButton button6 = new JButton("6");
		JButton button7 = new JButton("7");
		JButton button8 = new JButton("8");
		JButton button9 = new JButton("9");
		JButton buttonSum = new JButton("+");
		JButton buttonBack = new JButton("C");
		JButton buttonDivide = new JButton("/");
		JButton buttonSub = new JButton("-");
		JButton buttonMul = new JButton("*");
		JButton buttonStart = new JButton("=");

		// размещение элементов
		add(display, BorderLayout.NORTH);
		add(buttonPanel, BorderLayout.CENTER);
		add(buttonStart, BorderLayout.SOUTH);
		buttonPanel.add(button0);
		buttonPanel.add(button1);
		buttonPanel.add(button2);
		buttonPanel.add(button3);
		buttonPanel.add(button4);
		buttonPanel.add(button5);
		buttonPanel.add(button6);
		buttonPanel.add(button7);
		buttonPanel.add(button8);
		buttonPanel.add(button9);
		buttonPanel.add(buttonSum);
		buttonPanel.add(buttonSub);
		buttonPanel.add(buttonMul);
		buttonPanel.add(buttonBack);
		buttonPanel.add(buttonDivide);

		setVisible(true);// Видимость окна

		// добавляем слушателей кнопок.

		button0.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				display.setText(display.getText() + "0");
			}
		});

		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				display.setText(display.getText() + "1");
			}
		});

		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				display.setText(display.getText() + "2");
			}
		});

		button3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				display.setText(display.getText() + "3");
			}
		});
		
		buttonBack.addActionListener(new ActionListener() {// добавить функционал удолять и выводить по умолчанию "0"

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String temp = display.getText();
				display.setText(temp.substring(0, temp.length() - 1));
			}
		});

		buttonSum.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				firstValue = Integer.valueOf(display.getText());
				display.setText("");
				operation = "+";

			}
		});
		
		buttonMul.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			firstValue = Integer.valueOf(display.getText());
			display.setText("");
			operation = "*";
			}
			});
		
		buttonStart.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int secondValue = Integer.valueOf(display.getText());
				if ("+".equals(operation)) {
					display.setText((firstValue + secondValue) + "");
				}
				if ("-".equals(operation)) {
					display.setText((firstValue - secondValue) + "");
				}
				if ("*".equals(operation)) {
					display.setText((firstValue * secondValue) + "");
				}
				if ("/".equals(operation)) {
					display.setText((firstValue / secondValue) + "");
				}
				firstValue = 0;
				operation = "+";
			}
		});

	}

}
