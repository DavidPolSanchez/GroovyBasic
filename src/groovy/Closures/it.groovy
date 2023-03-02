package groovy.Closures

class it {
    static void main(String[] args){
        def doubles = {it *2}

        assert doubles (3) == 6

        assert doubles ('H') == "HH"
    }
}
