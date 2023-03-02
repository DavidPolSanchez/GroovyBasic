package groovy.objects;

public class JAVASaludador {
    private String usuario;

    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String saluda(String nombre) {
        return ("Hola " + nombre + " yo yo soy" + usuario);
    }

    static void main(String[] args) throws Exception {
        JAVASaludador saludador= new JAVASaludador();
        saludador.setUsuario("David");
        System.out.println(saludador.saluda("Pol"));
    }
}




