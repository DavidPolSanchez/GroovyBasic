package groovy.Operators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class JAVAStrings {
        String sampleText;
        //normal ternary operator
        String ternaryoutput = (sampleText != null) ?sampleText : "Hello Groovy!";
        //this is : if sampleText is not null it asign sampletext to elvisOutput, on the other hand  it asign 'viva las vegas!'
        String elvisOutPut= "not exists";
        public static void main(String[] args) {
            String[] list = {"a", "b", "c", "d"};
            assert list.toString().contains("a");
    }

}
