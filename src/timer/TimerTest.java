package timer;
import java.awt.*;
import java.awt.event.*;
import java.time.*;
import javax.swing.*;
public class TimerTest {
    public static void main(String[] args) {
        var listener = new TimePrinter();

        //построить таймер вызывающий приемник событий
        //каждую секунду
        var timer = new Timer(1000, listener);
        timer.start();

        //продолжить выполнение программы до тех пор, пока
        //пользователь не выберет экранну кнопку "ОК"
        JOptionPane.showMessageDialog(null, "Quit program?");
    }
}

class TimePrinter implements ActionListener {
    public void actionPerformed(ActionEvent event) {
        System.out.println("At the tone, the time is " + Instant.ofEpochMilli(event.getWhen()));
        Toolkit.getDefaultToolkit().beep();
    }
}