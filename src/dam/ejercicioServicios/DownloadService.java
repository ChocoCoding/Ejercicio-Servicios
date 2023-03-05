package dam.ejercicioServicios;

import java.util.Date;

public class DownloadService extends Service {
private final float downloadPrize = 15;

    public DownloadService(Date date, MultimediaContent multimediaContent) {
        super(date, multimediaContent);
    }

    public float getDownloadPrize() {
        return downloadPrize;
    }

    @Override
    public float getPrizeServices() {
        float precio = 0.0f;
        if (getMultimediaContent().isPremium()){
            precio = getDownloadPrize() + getMultimediaContent().getPREMIUM_PRIZE();
        }else precio = getDownloadPrize();

        return precio;
    }
}
