public class SmartTv{
    //atributos da classe Smart TV
    boolean ligado = false;
    int canal = 1;
    int volume = 25;
    //métodos de manipulação do estado da classe smart TV
    /*****************************************************/
     //Metodo mudar canal na Smart tv
     public void mudarCanal(int novoCanal){
        canal=novoCanal;
     }
     public void aumentarCanal(){
        //canal =canal + 1;
        canal ++;
    }
    public void dimunuirCanal(){
        //canal =canal - 1;
        canal --;
    }
    /*****************************************************/
    //Metodo aumentar volume da Smart tv
    public void aumentarVolume(){
        //volume =volume + 1;
        volume ++;
    }
    public void dimunuirVolume(){
        //volume =volume - 1;
        volume --;
    }
     /*****************************************************/
    //Método ligar e desligar Smart TV
    public void ligar(){
        ligado = true;
    }
    public void desligar(){
        ligado = false;
    }

}