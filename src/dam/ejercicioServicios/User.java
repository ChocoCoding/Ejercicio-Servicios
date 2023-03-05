package dam.ejercicioServicios;

import java.util.ArrayList;
import java.util.List;

public class User {
    private static int id;
    private String email;
    private String password;
    private List<Service> services = new ArrayList<>();

    public User() {
    }

    public User(int id, String email, String password) {
        User.id = id ++;
        this.email = email;
        this.password = password;
    }

    public void listaServicios(Service service){
        services.add(service);
    }

    public float getTotal(){

        float precio = 0.0f;
        for (Service s : services) {
            System.out.println(services);
            MultimediaContent mc = s.getMultimediaContent();
            precio += s.getPrizeServices();
        }

        return precio;
    }




}
