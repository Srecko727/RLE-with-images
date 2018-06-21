/////////////////////////////////////////////////////////////////
//                 Project 2: RLE with images                  //
//                   By: Srecko Markovic                       //
/////////////////////////////////////////////////////////////////

public class RleProgram
{
    public static void main (String[] args)
    {

    }
    public static String toHexString (byte[] data)
    {
        String result = "";
        for (int i=0; i<data.length;i++)
        {
            if(data[i]== 10)
            {
                result += "a";
            }
            else if (data [i] == 11)
            {
                result += "b";
            }
            else if (data [i] == 12)
            {
                result += "c";
            }
            else if (data [i] == 13)
            {
                result += "d";
            }
            else if (data [i] == 14)
            {
                result += "e";
            }
            else if (data [i] == 15)
            {
                result += "f";
            }
            else if(data [i] >= 0 && data[i] <= 9)
            {
                result += Byte.toString(data[i]);
            }
        }
        return result;
    }
    public static int countRuns(byte[] flatData)
    {
        int numRuns = 0;
        for (int i=0 ; i<numRuns ; i++)
        {
            if (countRuns()< 15)
            {

            }
        }
    }
    public static byte[] encodeRle(byte[] flatData)
    {

    }
    public static int getDecodedLength(byte[] rleData)
    {

    }
    public static byte[] decodeRle(byte[] rleData)
    {

    }
    public static byte[] stringToData(String dataString)
    {

    }
    public static String toRleString (byte[] rleData)
    {

    }
    public static byte[] stringToRle(String rleString)
    {

    }
}
