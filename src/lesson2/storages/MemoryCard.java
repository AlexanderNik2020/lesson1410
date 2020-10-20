package lesson2.storages;

/** It's class which implemented Memory card, extended {@link Storage} */
public class MemoryCard extends Storage {

    /** It's constructor which pass massive to superclass {@link Storage} */
    public MemoryCard(){
        this.songs = new String[]{"Miyagi - Captain", "Reg'n'BoneMan - Human",
                "Imagine Dragons - Believer", "Marshmello - Alone"};
    }

}
