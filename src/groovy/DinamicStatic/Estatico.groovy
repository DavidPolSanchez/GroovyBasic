import groovy.transform.CompileStatic;

@CompileStatic
void depidete(){
    Integer a = 3
    println a
    //a = "adios"
    print a //!error en tiempo de compilacion
}