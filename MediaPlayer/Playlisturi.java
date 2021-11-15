import java.util.ArrayList;
import java.util.List;

public class Playlist implements Media{
    private int dimensiunea;
    private String titlu;
    private int durata;
    private List<Media> lista = new ArrayList<>();

    public Playlist(int dimensiunea, String titlu) {
        this.dimensiunea = dimensiunea;
        this.titlu = titlu;
    }

    public void addElement(Media o)
    {
        lista.add(o);
        if(o instanceof Gifuri)
            durata+=1;
        else if(o instanceof Videoclip)
            durata+=3;
        else if(o instanceof Melodie)
            durata+=5;
        else if(o instanceof Playlist)
            durata+=((Playlist) o).getDurata();
    }

    public int getDurata() {
        return durata;
    }


    public int durataMelodii()
    {
        int d=0;
        for(Media o: lista)
        {
            if(o instanceof Melodie)
                d += 3;
            if(o instanceof Playlist)
                d += ((Playlist) o).durataMelodii();
        }
        return d;
    }

    public int durataGifs()
    {
        int d=0;
        for(Media o: lista)
        {
            if(o instanceof Gifuri)
                d += 1;
            if(o instanceof Playlist)
                d += ((Playlist) o).durataGifs();
        }
        return d;
    }

    public int durataVideo()
    {
        int d=0;
        for(Media o: lista)
        {
            if(o instanceof Videoclip)
                d += 1;
            if(o instanceof Playlist)
                d += ((Playlist) o).durataVideo();
        }
        return d;
    }
}
