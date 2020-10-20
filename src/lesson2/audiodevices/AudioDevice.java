package lesson2.audiodevices;

import lesson2.storages.CD;
import lesson2.storages.Internet;
import lesson2.storages.MemoryCard;
import lesson2.storages.Storage;

/** It's class which implemented a certain audio device */

public class AudioDevice {

    protected String currentSong = "";
    protected int[] playableStorages = new int[]{};
    protected String[] playableSongs = new String[]{};


    /**
     * Method which carrying out checks of chosen song in system.
     * @param idStorage ID of storage. 1 - CD; 2 - Internet; 3 - MemoryCard.
     * @param song Name of desired song
     */

    public String play(int idStorage,String song){
        if(playableStorages.length == 0){
            return "LifeStyleError (Что-то ты не так в жизни делаешь, если не следуешь моим инструкциям ;)))";
        }
        for (int i = 0; i < this.playableStorages.length; i++){
            if(this.playableStorages[i] == idStorage){
                playableSongs = this.getSongs(idStorage);
                for (int j = 0; j < playableSongs.length; j++){
                    if(playableSongs[j].equals(song)){
                        return "Playing: " + song;
                    }
                }
                return "SongNotFoundError (Нет такой песни в хранилище, другалечек)";
            }
        }
        return "InputStorageTypeError (Не то вставляешь, короче)";
    }


    /**
     * Method which switch of devices
     * @
     */
    public String[] getSongs(int id){
        Storage storage;
        if(id == 1){
            storage = new CD();
            return storage.getSongs();
        }
        if(id == 2){
            storage = new Internet();
            return storage.getSongs();
        }
        if(id == 3){
            storage = new MemoryCard();
            return storage.getSongs();
        }
        return null;
    }
}
