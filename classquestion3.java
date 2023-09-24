class square{
    int side;
    public int perimeter(){
        return 4*side;
    }
    public int area(){
        return side*side;
    }
}
public class classquestion3 {
    public static void main(String[]args){
    square sq = new square();
    sq.side=6;
    System.out.println(sq.perimeter());
    System.out.println(sq.area());
}
}
