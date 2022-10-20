public class Usuario {
    public static void main(String[] args) throws Exception {
       SmartTv smartTv = new SmartTv();
       System.out.println("Tv ligada?"+ smartTv.ligado);
       System.out.println("Canal atual?"+smartTv.canal);
       System.out.println("Volume atual?"+smartTv.volume);

    }
}
