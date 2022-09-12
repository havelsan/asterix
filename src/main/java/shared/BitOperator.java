package shared;

import java.util.List;

public class BitOperator {

    public BitOperator() {}

    public int getBit(int position, int ID)
    {
        return ((ID >> position) & 0x1);
    }

    public int concatInt(List<Integer> numbers){
        String finalNumber = "";

        for (Integer i : numbers){
            finalNumber += String.format("%8s", Integer.toBinaryString(i))
                    .replaceAll(" ", "0");
        }

        return Integer.parseUnsignedInt(finalNumber, 2);
    }

}
