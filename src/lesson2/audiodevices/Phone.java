package lesson2.audiodevices;

/** It's class which implemented Phone, extended {@link AudioDevice} */
public class Phone extends AudioDevice {

    /** It's constructor which pass massive to superclass {@link AudioDevice} */
    public Phone(){
        super();
        this.playableStorages = new int[]{2,3};
    }

}
