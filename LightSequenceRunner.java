
public class LightSequenceRunner {
    public static void main(String[] args) {
        LightSequence gradShow = new LightSequence("0101 0101 0101");

        gradShow.display();

        gradShow.changeSequence("0011 0011 0011");
        gradShow.display();

        String resultSeq = gradShow.insertSegment("1111 1111", 4);
        System.out.println(resultSeq);

        String oldSeq = "001110011";
        String segment = "11";
        String newSeq = oldSeq.replaceFirst(segment, "");
        System.out.println(newSeq);

        double a = 1.5;
        double b = 3.2;
        System.out.println(Math.sqrt(Math.pow(a,2) + Math.pow(b,2)));
    }
}
