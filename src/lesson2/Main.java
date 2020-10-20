/**
 * Its class implements audio system.
 * Messages of different errors, for example: illegal match of device and storage, throw after running program.
 *
 * @author Aleksander Nikitin
 * @version 1.0
 */


package lesson2;

import java.util.Arrays;
import java.util.Scanner;
import lesson2.audiodevices.AudioDevice;
import lesson2.audiodevices.CDPlayer;
import lesson2.audiodevices.Phone;

/** It's main class */

public class Main {

    static Scanner in = new Scanner(System.in);
    static int chooseOfDevice;
    static int chooseOfStorage;
    static String chooseOfSong;
    public static void main(String[] args) {

        AudioDevice audioDevice = getAudioDevice();
        System.out.println(audioDevice.play(chooseOfStorage,chooseOfSong));

    }

    /** It's method which setting configuration of device */

    public static AudioDevice getAudioDevice(){

        System.out.println();
        System.out.println("У тебя есть выбор. Что будем слушать: 1.дисковый плеер или 2.телефон? Выбери чиселкой");
        chooseOfDevice = in.nextInt();
        System.out.println("У тебя есть выбор, но выбирай логично. Из какого хранилища будем слушать: 1.CD-диск, 2.Интернет или 3.Карта памяти? Выбери чиселкой");
        chooseOfStorage = in.nextInt();
        System.out.println("Вот тебе список песен на хранилищах, но ты учти, что нужно выбирать в соответствии с хранилищем.(Тупо скопируй название из предложенных)");
        System.out.println("CD-диск" + Arrays.toString(new String[]{"Miyagi - Kosandra", "Castle - 42", "Marshmello - Be kind"}));
        System.out.println("Интернет" + Arrays.toString(new String[]{"Miyagi - Kosandra", "Castle - 42","Marshmello - Be kind","Miyagi - Captain","Reg'n'BoneMan - Human", "Imagine Dragons - Believer","Marshmello - Alone"}));
        System.out.println("Карта памяти" + Arrays.toString(new String[]{"Miyagi - Captain", "Reg'n'BoneMan - Human","Imagine Dragons - Believer", "Marshmello - Alone"}));
        in.nextLine();
        chooseOfSong = in.nextLine();
        if(chooseOfDevice == 1){
            if(chooseOfStorage>=1 && chooseOfStorage<=3){
                return new CDPlayer();
            }
        }
        if(chooseOfDevice == 2) {
            if(chooseOfStorage>=1 && chooseOfStorage<=3){
                return new Phone();
            }
        }
        return new AudioDevice();
    }
}
