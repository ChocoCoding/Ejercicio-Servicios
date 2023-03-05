package dam.ejercicioServicios;

import java.util.Date;

public abstract class Service {
    private Date date;
    private MultimediaContent multimediaContent;

    public Service(Date date, MultimediaContent multimediaContent) {
        this.date = date;
        this.multimediaContent = multimediaContent;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public MultimediaContent getMultimediaContent() {
        return multimediaContent;
    }

    public void setMultimediaContent(MultimediaContent multimediaContent) {
        this.multimediaContent = multimediaContent;
    }

    public abstract float getPrizeServices();

    public Date getDate() {
        return date;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Services{");
        sb.append("date=").append(date);
        sb.append('}');
        return sb.toString();
    }
}
