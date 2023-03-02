class dinamico {

    def saluda(){
        def a =" Hola mundo"

        println a
        a = 3
        print a
    }
    void depidete(){
        Integer a =3
        println a
        a = "adios"
        print a //!error en tiempo de ejecucion
    }
}