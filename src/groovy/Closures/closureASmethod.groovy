package groovy.Closures

class closureASmethod {
    static void main(String[] args) {
        def logbase10 = Math.&log10

        assert logbase10(10) ==1

        def printer =System.out.&println
        printer "Hola"



    }

}
