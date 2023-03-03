import groovy.transform.CompileStatic;

@CompileStatic
void depidete(){
    Integer a = 3
    println a
    //a = "adios" //!error en tiempo de compilacion
    print a
}