import java.util.*;

import javax.microedition.lcdui.*;
import javax.microedition.midlet.*;

public class MIDletList extends MIDlet {
    private Display display;
    private List liste;

    protected static final String[] items = { "Item1", "Item2", "Item3", "Item4" };

    public MIDletList() {
        this.liste = new List("Selection", List.MULTIPLE, items, null);
    }

    protected void startApp() {
        this.display = Display.getDisplay(this);
        display.setCurrent(liste);
    }

    protected void pauseApp() {}

    protected void destroyApp(boolean unconditional) {}
}


