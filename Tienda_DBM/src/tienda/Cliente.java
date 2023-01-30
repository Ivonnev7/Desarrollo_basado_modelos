package tienda;

//Iniciamos clase Cliente en la que implementamos clase Suscriptor
class Cliente implements Suscriptor {
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

        //Activamos "recibir notificación"
    @Override
    public void recibirNotif(Producto producto) {
        System.out.println(this.nombre + ", el producto " + producto.getNombre() + " ha cambiado de precio.");
    }
}

