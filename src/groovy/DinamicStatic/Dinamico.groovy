class dinamico {

    def sayHi(){
        def a =" Hello world"

        println a
        a = 3
        print a
    }
    void sayGoodbye(){
        Integer a =3
        println a
        a = "good bye"
        print a //!error en tiempo de ejecucion
    }
}