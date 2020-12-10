package ivanovkm.java.javatwo.lesson4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*1. Создать окно для клиентской части чата: большое текстовое поле для отображения переписки
в центре окна. Однострочное текстовое поле для ввода сообщений и кнопка для отсылки сообщений
на нижней панели. Сообщение должно отсылаться либо по нажатию кнопки на форме, либо по нажатию
кнопки Enter. При «отсылке» сообщение перекидывается из нижнего поля в центральное.
 */

public class ChatWindow extends JFrame {
    private JTextField field;
    private JTextArea jTextArea;
    private JButton button;

    public ChatWindow(){
        chatWindowsInit();
    }

//Инициализация параметров и элементов окна чата
    private void chatWindowsInit(){
        setTitle("Мой чат");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(250, 250, 500, 500);

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());

        jTextArea = new JTextArea();
        jTextArea.setLineWrap(true);
        JScrollPane jScrollPane = new JScrollPane(jTextArea);
        jPanel.add(jScrollPane, BorderLayout.CENTER);

        JPanel bottomJPanel = new JPanel();
        bottomJPanel.setLayout(new BorderLayout());

        addTextField();
        bottomJPanel.add(field, BorderLayout.CENTER);

        addButton();
        bottomJPanel.add(button, BorderLayout.SOUTH);
        jPanel.add(bottomJPanel, BorderLayout.SOUTH);
        add(jPanel);

        setVisible(true);
        field.grabFocus();
    }
//Добавление текстового поля для ввода сообщений
    private void addTextField(){
        field = new JTextField();
        field.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMessage();
            }
        });
    }
//Добавление кнопки отправки сообщений
    private void addButton(){
        button = new JButton("Отправить");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMessage();
            }
        });
    }
//Отправка сообщений
    private void sendMessage(){
        if(!field.getText().isEmpty()){
            jTextArea.append(field.getText()+"\n");
            field.setText("");
            field.grabFocus();
        }
    }
}
