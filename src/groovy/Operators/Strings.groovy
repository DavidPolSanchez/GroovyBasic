package groovy.Operators

    class Strings {

        static void main(String[] args) {
            def sampleText
            //normal ternary operator
            def ternaryoutput = (sampleText != null)?sampleText:"Hello Groovy!"
            //this is : if sampleText is not null it asign sampletext to elvisOutput, on the other hand  it asign 'viva las vegas!'
            def elvisOutPut= sampleText ?:'Viva las Vegas!'

            //search if an item exist inside
            def list = ["a","b","c","d"]

            assert "a" in list

            //multiply strings
            println '-' * 800

            //comillas
            def s1 ='this is a string and we can use "this" inside'
            def s2 ='''       
                this is a string and we can use "this" inside
                '''
            def s3 = /this is a string and we can use "this" and 'this' inside/

            def s4 = "  this is a string and we can use 'this' inside"
            def s5 =""""     
                this is a string and we can use "this" inside
                """
            //!GSTRINGS

            def nombre = "David"

            def gs1= "Hi $nombre"

            def edad=5

            def gs2 = "you are from ${2023-edad}"

            //dinamic method invocation
            def s =new Simple()
            def method = 'hi'
            assert 'Hi David'==s."$method"('David')



            //BASE64
            def s64 ='this is "easyer" on groovy'
            String encoded = short.bytes.encode(s64)
            byte[] decode =encoded.decodeBase64()
        }
    }

//dinamic method invocation
class Simple{
    def  hi(name){
        "Hola $name"
    }
}


