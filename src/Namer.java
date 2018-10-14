public class Namer
{
    public static String getName(Cities c){
        switch(c){
            case CHICAGO: return "bears";
            case MINN: return "vikings";
            case GREEN: return "packers";
            case DETROIT: return "lions";
            default: return "Cowboys";
        }
    }
}
