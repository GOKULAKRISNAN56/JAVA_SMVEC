interface Camera
{
    void clickPhoto();
}
interface MusicPlayer
{
    void playMusic();
}
class phone implements Camera,MusicPlayer 
{

    public void clickPhoto()
    {
        System.out.println("Photo taken from mobile");
    }
    public void playMusic()
    {
        System.out.println("Music playing in phone");
    }
}

public class InterfaceEx {
    public static void main(String[] args) {
        phone p=new phone();
        p.clickPhoto();
        p.playMusic();
    }
}
