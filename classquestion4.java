class rectange{
    int length;
    int breadth;
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 4*(length+breadth);
    }
}
    public class classquestion4 {
        public static void main(String[]args){
    rectange side = new rectange();
    side.length=6;
    side.breadth=5;
    System.out.println(side.area());
    System.out.println(side.perimeter());
}
    }