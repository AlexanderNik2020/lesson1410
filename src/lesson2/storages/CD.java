package lesson2.storages;

import lesson2.audiodevices.AudioDevice;

/** It's class which implemented CD, extended {@link Storage} */
public class CD extends Storage{

    /** It's constructor which pass massive to superclass {@link Storage} */
    public CD() {
        this.songs = new String[]{"Miyagi - Kosandra", "Castle - 42", "Marshmello - Be kind"};
    }

}
