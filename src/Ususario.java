public class Ususario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();
        System.out.println("TV Está ligada ? " + smartTv.ligada);
        System.out.println("Canal atual : " + smartTv.canal);
        System.out.println("Volume atual : " + smartTv.volume);

        smartTv.ligar(); // usuario liga a TV 
        System.out.println(" Novo estado -> TV Está ligada ? " + smartTv.ligada);

        smartTv.desligar(); // usuario desliga a TV 
        System.out.println(" Novo estado -> TV Está ligada ? " + smartTv.ligada);


        smartTv.mudarCanal(7);
        smartTv.mudarCanal(1); // usuario mudou 3 vezes de canal 
        smartTv.mudarCanal(5);

        smartTv.aumentarCanal();
        smartTv.diminuirCanal(); // usuario aumenta o canal 1 vez e diminui 3 vezes 
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume(); // usuario aumenta o volume por 4 vezes em seguida diminui o volume
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        

    }
}
