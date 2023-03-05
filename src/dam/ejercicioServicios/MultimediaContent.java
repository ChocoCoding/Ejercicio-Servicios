package dam.ejercicioServicios;

public class MultimediaContent {
    private static int id;
    private String title;
    private int duration;
    private int size;
    private boolean isPremium = false;
    private final float PREMIUM_PRIZE = 2;
    private final float DOWNLOAD_PRIZE = 15;
    private final float STREAMING_PRIZE = 20;


    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean premium) {
        isPremium = premium;
    }

    public float getPREMIUM_PRIZE() {
        return PREMIUM_PRIZE;
    }

    public MultimediaContent() {
    }

    public MultimediaContent(String title, int duration, int size, boolean isPremium) {
        MultimediaContent.id += 1;
        this.isPremium = isPremium;
        this.title = title;
        this.duration = duration;
        this.size = size;
    }


    public float getDOWNLOAD_PRIZE() {
        return DOWNLOAD_PRIZE;
    }

    public float getSTREAMING_PRIZE() {
        return STREAMING_PRIZE;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        MultimediaContent.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MultimediaContent{");
        sb.append("title='").append(title).append('\'');
        sb.append(", duration=").append(duration);
        sb.append(", size=").append(size);
        return sb.toString();
    }
}
