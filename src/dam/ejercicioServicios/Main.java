package dam.ejercicioServicios;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date fecha = new Date();
        MultimediaContent multimedia = new MultimediaContent("Avatar 2",23,256,true);
        Service servicio1 = new StreamingService(fecha,multimedia);
        Service service2 = new DownloadService(fecha, new MultimediaContent("Lobezno",25,254,true));
        User usuario1 = new User(1,"pepito@gmail.com","1234");
        usuario1.listaServicios(servicio1);
        usuario1.listaServicios(service2);


        System.out.println(usuario1.getTotal());

    }
}
