package dam.ejercicioServicios;

import java.util.Date;

public class StreamingService extends Service {
    private final float streamingPrize = 20;

    public StreamingService(Date date, MultimediaContent multimediaContent) {
        super(date, multimediaContent);
    }


    public float getStreamingPrize() {
        return streamingPrize;
    }

    @Override
    public float getPrizeServices() {
        float precio = 0.0f;
        if (getMultimediaContent().isPremium()){
            precio = getStreamingPrize() + getMultimediaContent().getPREMIUM_PRIZE();
        }else precio = getStreamingPrize();

        return precio;
    }
}
