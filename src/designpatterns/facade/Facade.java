package designpatterns.facade;

public class Facade {

    protected SistemaDeAudio audio;
    protected SistemaDeIMGeVID imagemEvideo;
    protected SistemaDeTv tv;

    public void inicializarSubsSistemas(){
        audio = new SistemaDeAudio();
        audio.configAudio();
        audio.configVolume();
        
        imagemEvideo = new SistemaDeIMGeVID();
        imagemEvideo.configImagem();
        imagemEvideo.configVideo();
        
        tv = new SistemaDeTv();
        tv.configApps();
        tv.configRede();
    }

    public void redenrizarCores(String Arquivo){
        imagemEvideo.redenrizarCores(Arquivo);
    }
    
}
