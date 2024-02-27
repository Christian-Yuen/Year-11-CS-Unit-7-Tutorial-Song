import java.util.ArrayList;
public class Song {

    private String title;
    private String artist;
    private ArrayList<String> listeners;

    public Song (String title, String artist){
        this.title = title;
        this.artist = artist;
    }

    public String getTitle(){
        return title;
    }

    public String getArtist(){
        return artist;
    }


    public int howMany(ArrayList<String> array){
        for (int i = 0; i < array.size(); i++){
            array.set(i, array.get(i).toLowerCase());
        }

        int initial;

        if (listeners == null){
            listeners = array;
            initial = 0;
        }

        else{
            String test;
            initial = listeners.size();
            for (int i = 0; i < array.size(); i++){
                test = array.get(i);
                if (!listeners.contains(test)){
                    listeners.add(test);
                }
            }
        }

        int result = listeners.size();

        return result - initial;
    }
}
