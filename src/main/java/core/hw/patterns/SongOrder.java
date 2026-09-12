package core.hw.patterns;

public class SongOrder {
    private String singer;
    private String songName;

    private SongOrder(String singer) {
        this.singer = singer;
    }

    private SongOrder(String singer, String songName) {
        this.singer = singer;
        this.songName = songName;
    }

    public SongOrder of(String singer){
        return new SongOrder(singer);
    }

    public SongOrder of(String singer,String songName){
        return new SongOrder(singer, songName);
    }

    public String toString(){
        if (singer != null && songName != null){
            return "Play "
                    + singer
                    + " song called "
                    + "\""
                    + songName
                    + "\"\n";
        }

        if (singer != null){
            return "Play any " +
                    singer
                    + "\n";
        }

        return "You haven't chosen a singer. Please make your choice)\n";
    }
}
