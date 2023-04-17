class LightSequence {
    String thingy = "";
    public LightSequence(String seq) {
        thingy = seq;
    }
    public String insertSegment(String segment, int ind) {
        return thingy.substring(0, ind) + segment + thingy.substring(ind);
    }
    public void changeSequence(String seq) {
        thingy = seq;
    }
    public void display(){
        System.out.println("this is the thingy: " + thingy);
    }
}