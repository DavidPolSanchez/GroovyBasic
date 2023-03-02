package Memoize

import groovy.transform.CompileDynamic

class memoize {
    //@CompileDynamic
      static void main(String[] args) throws MissingPropertyException{
        /*
        Memoization allows the result of the call of a closure to be cached. It is interesting if the computation
        done by a function (closure) is slow, but you know that this function is going to be called often
        with the same arguments. A typical example is the Fibonacci suite*/

        def fib
        fib = { long n -> n<2?n:fib(n-1)+fib(n-2) }
        assert fib(15) == 610 // slow!

        fib = { long n -> n<2?n:fib(n-1)+fib(n-2) }.memoize()
        assert fib(25) == 75025 // fast!
    }


}
