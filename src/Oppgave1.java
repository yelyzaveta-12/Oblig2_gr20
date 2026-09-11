import javax.swing.*;

public class Oppgave1 extends Thread {

    static volatile String melding = "Hallo Verden";
    static volatile boolean play = true;
    static void stopp(){
        play = false;
    }

    public static void main(String[] args){

        Thread thread1 = new Thread(
                () -> {
                    while(play) {
                        System.out.println(melding);


                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            break;
                        }
                    }
                }
        );

        Thread thread2 = new Thread(
                () -> {
                    while(play) {

                        String userInput = JOptionPane.showInputDialog(null, "Hva skal skrives ut?",
                                "User Input", JOptionPane.PLAIN_MESSAGE
                        );

                        if (userInput == null || userInput.equalsIgnoreCase("stopp")) {
                            stopp();
                            thread1.interrupt();
                            break;
                        }
                        melding = userInput;


                    }
                }
        );

        thread1.start();
        thread2.start();


    }



}
