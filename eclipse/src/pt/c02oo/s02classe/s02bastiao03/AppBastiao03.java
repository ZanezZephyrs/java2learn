package pt.c02oo.s02classe.s02bastiao03;

public class AppBastiao03
{
    public static void main(String[] args)
    {
        Bastiao primeiroBastiao;
        primeiroBastiao = new Bastiao(1, "acordado", "Asdrubal");
        primeiroBastiao.aparece();
        
        Bastiao segundoBastiao;
        segundoBastiao = new Bastiao(2, "acordado", "Doriana");
        segundoBastiao.aparece();
        
        segundoBastiao.dorme();
        
        primeiroBastiao.aparece();
    }

}
