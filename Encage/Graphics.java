public class Graphics {
    Resolution resolution = new Resolution(Settings.resolution);
    Brightness brightness = new Brightness(Settings.brightness);
    Detail detail = Settings.detail;


    //implementations
    private class Resolution{
        Resolution(int vertical, int horizontal){}
        Resolution(String resolution){}
        //implementations
    }
    private class Brightness{
        Brightness(int value){}
        //implementations
    }

   enum Detail{

        HIGH,MEDIUM,LOW
    }

}
