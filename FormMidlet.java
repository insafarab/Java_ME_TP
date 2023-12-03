import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

public class FormMidlet extends MIDlet implements CommandListener {

    private Display display;
    private Form form;
    private boolean started = false;

    public FormMidlet() {
    }

    protected void startApp() {
        if (!started) {
            display = Display.getDisplay(this);

            form = new Form("Item Layout");
            form.append("Hello");
            form.append("GSEII2");
            form.append("\nThis is a Form");
            form.append("\nEnter your information");
            form.append(new TextField("Name", null, 32, TextField.ANY));
            form.append(new TextField("Email", null, 32, TextField.ANY));
            display.setCurrent(form);
            started = true;
        }
    }

    protected void pauseApp() {}

    protected void destroyApp(boolean unconditional) {}

    public void commandAction(Command c, Displayable d) {
        if (c.getCommandType() == Command.EXIT) {
            destroyApp(true);
            notifyDestroyed();
        }
    }
}
