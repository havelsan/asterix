package shared;

public class BitOperator {

    public BitOperator() {}

    public int getBit(int position, int ID)
    {
        return ((ID >> position) & 0x1);
    }

}
