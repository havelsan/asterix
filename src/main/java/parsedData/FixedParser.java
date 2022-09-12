package parsedData;

import data.Bits;
import data.Fixed;

import java.util.List;

public class FixedParser {
    private final BitsParser bitsParser = new BitsParser();

    public int parseFixed(Fixed fixed, int number){
        int fx = 0;

        List<Bits> bits = fixed.getBits();

        for(Bits bits1: bits){
            fx = bitsParser.bitsParse(bits1, number);
        }

        return fx;

    }
}
