class Saludador{
    private String usuario
    private Integer edad

    String saluda(String nombre){
        "Hola $nombre, yo soy $usuario"
    }
}


def saludador = new Saludador(usuario: "David",edad:3)
println(saludador.saluda("Pol"))

def user1 = new Saludador(usuario: "Diego",edad:33)
assert user1.class ==Saludador

def  user2 = [ usuario:"Diego",edad:33] as Saludador
assert user2.class ==Saludador

saludador  user3 = [ usuario:"Diego",edad:33]
assert user3.class ==Saludador

