package parsedData;

import data.Bits;
import shared.BitOperator;

public class BitsParser {
    private BitOperator bitOperator = new BitOperator();

    public int bitsParse(Bits bits, int number){
        int from = bits.getFrom() - 1;
        int to = bits.getTo() - 1;
        int bit = bits.getBit() - 1;
        int fx = bits.getFx();
        String numberString = "";

        if (fx == 1){
            fx = bitOperator.getBit(0, number);
        }

//        try{
//            numberString += bitOperator.getBit(bit, number);
//        }catch (Exception e){
//            for(int i = from; i >= to; i--){
//                numberString += bitOperator.getBit(i, number);
//            }
//        }

        for(int i = from; i >= to; i--){
            numberString += bitOperator.getBit(i, number);
        }


        bits.setValue(Integer.parseUnsignedInt(numberString, 2));
//        System.out.println(numberString);
        return fx;

    }
}
