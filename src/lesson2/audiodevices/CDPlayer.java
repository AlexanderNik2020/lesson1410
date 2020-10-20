package lesson2.audiodevices;


/** It's class which implemented CD Player, extended {@link AudioDevice} */
public class CDPlayer extends AudioDevice {

    /** It's constructor which pass massive to superclass {@link AudioDevice} */

    public CDPlayer(){
        super();
        this.playableStorages = new int[]{1};
    }

}
