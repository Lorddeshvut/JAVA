/*Напишите программу для управления разными типами музыкальных
       устройств (плееры, колонки, наушники) с использованием паттерна "мост"*/
public class Main {
    public static void main(String[] args) {
        Shape speakerUp = new Speaker(new VolumeUp());
        speakerUp.push();
        Shape headphonesOn = new Headphones(new On());
        headphonesOn.push();
        Shape headphonesConnect = new Headphones(new ConnectBluetooth());
        headphonesConnect.push();
        Shape playerOn = new Player(new On());
        playerOn.push();
        Shape playerOff = new Player(new Off());
        playerOff.push();

    }
}



