package parsedData;

import data.Fixed;
import data.Variable;

import java.util.List;

public class VariableParser {
    private final FixedParser fixedParser = new FixedParser();
    private int pointer = 0;
    private int[] returnValue = new int[2];

    public int[] variableParse(Variable variable, int number){


        int fixedLength = Integer.parseInt(variable.getFixedList().get(pointer).getLength());
        List<Fixed> fixedList = variable.getFixedList();

        if (fixedLength != 1 && pointer == 0 && returnValue[0] != -1){
            returnValue[0] = -1;
            returnValue[1] = fixedLength;
            return returnValue;
        }

        int fx = fixedParser.parseFixed(fixedList.get(pointer), number);
        pointer += 1;

        if(fx == 1){
            returnValue[0] = 0;
            returnValue[1] = Integer.parseInt(variable.getFixedList().get(pointer).getLength());
        }else{
            returnValue[0] = 0;
            returnValue[1] = 0;
        }



        return returnValue;
    }
}
