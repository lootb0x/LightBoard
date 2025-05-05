public class Main{
  public static void main(String[] args)
  {
    boolean[][] ex =
    {
        {true, true, false,true , true},
        {true, false, false ,true , false },
        {true, false, false,true , true},
        {true, false, false, false,true },
        {true, false, false, false, true},
        {true ,true ,false, true,true },
        {false,false ,false , false,false}
    };

    LightBoard test = new LightBoard(ex);

    System.out.println(test.evaluateLight(0,3));
    System.out.println(test.evaluateLight(6,0));
    System.out.println(test.evaluateLight(4,1));
    System.out.println(test.evaluateLight(5,4));


     
  }
}
