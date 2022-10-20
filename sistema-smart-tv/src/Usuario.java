public class Usuario {
    public static void main(String[] args) throws Exception {
       SmartTv smartTv = new SmartTv();

       smartTv.dimunuirVolume();
       smartTv.dimunuirVolume();
       smartTv.dimunuirVolume();
       smartTv.aumentarVolume();;

       System.out.println("Volume atual "+smartTv.volume);

       smartTv.mudarCanal(13);
       System.out.println("Canal atual?: "+smartTv.canal);




       System.out.println("Tv ligada? "+smartTv.ligado);
       System.out.println("Canal atual?: "+smartTv.canal);
       System.out.println("Volume atual?: "+smartTv.volume);

       smartTv.ligar();
       System.out.println("Novo estatus - Tv ligada? "+smartTv.ligado);

       smartTv.desligar();
       System.out.println("Novo estatus - Tv ligada? "+smartTv.ligado);


    }
}
