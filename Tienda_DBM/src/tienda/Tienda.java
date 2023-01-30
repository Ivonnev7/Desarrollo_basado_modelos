package tienda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Iniciamos clase Tiena en la que implementamos Proveedor

class Tienda implements Proveedor {

    private Map<Producto, List<Suscriptor>> suscriptores;


    public Tienda(String nombre) {
        this.suscriptores = new HashMap<>();
    }


    @Override
    public void suscribir(Suscriptor suscriptor, Producto producto) {
        if (!this.suscriptores.containsKey(producto)) {
            this.suscriptores.put(producto, new ArrayList<>());
        }
        this.suscriptores.get(producto).add(suscriptor);
    }


    @Override
    public void notificarDisp(Producto producto) {
        if (this.suscriptores.containsKey(producto)) {
            for (Suscriptor suscriptor : this.suscriptores.get(producto)) {
                suscriptor.recibirNotif(producto);
            }
        }
    }
}