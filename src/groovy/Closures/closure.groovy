package groovy.Closures

class closure {

    static void main(String[] args){
        def sumador ={a,b-> a+b}
        assert sumador (3,4)==7
        assert sumador ('H','ola')=="Hola"
    }
}
