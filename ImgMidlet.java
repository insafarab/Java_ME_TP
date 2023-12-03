import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

public class ImgMidlet extends MIDlet {
    private Display display;
    private Form mainForm;
    private StringItem msg;
    private Ticker t;
    public ImgMidlet(){
        display=Display.getDisplay(this);
        mainForm=new Form ("Mon formulaire");
        t=new Ticker("What a beautiful sunset !");
        msg=new StringItem("", "Sunset View");
        mainForm.append(msg);
        try{
            Image img=Image.createImage("/images/sunset.jpg");
            mainForm.append(new ImageItem(null,img,ImageItem.LAYOUT_CENTER,null));
        } catch(java.io.IOException e) {e.printStackTrace();}
    }
    public void startApp(){
        mainForm.setTicker(t);
        display.setCurrent(mainForm);
    }
    protected void pauseApp() {}

    protected void destroyApp(boolean unconditional) {}
}
