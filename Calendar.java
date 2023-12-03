import javax.microedition.lcdui.*;
import javax.microedition.midlet.*;

public class Calendar extends MIDlet implements CommandListener {

    private Display display;
    private Form form;
    private boolean started = false;

    public Calendar() {
    }

    protected void startApp() {
        if (!started) {
            display = Display.getDisplay(this);

            form = new Form("Learning Platform");

            // Text
            form.append("Welcome to your learning journey!");

            // List of Choices
            String[] choices = {"Embedded C", "Model Based Design", "Automation with Python"};
            ChoiceGroup choiceGroup = new ChoiceGroup("Choose an option:", ChoiceGroup.EXCLUSIVE, choices, null);
            form.append(choiceGroup);

            // Date
            DateField dateField = new DateField("Select a date:", DateField.DATE);
            form.append(dateField);

            // Text Field
            form.append(new TextField("Enter your name:", null, 32, TextField.ANY));

            // Progress Bar
            Gauge gauge = new Gauge("Progress:", true, 100, 0);
            form.append(gauge);

            // Exit Command
            Command exitCommand = new Command("Exit", Command.EXIT, 0);
            form.addCommand(exitCommand);
            form.setCommandListener(this);

            display.setCurrent(form);
            started = true;
        }
    }

    protected void pauseApp() {}

    protected void destroyApp(boolean unconditional) {
        // Clean up resources, if any
    }

    public void commandAction(Command c, Displayable d) {
        if (c.getCommandType() == Command.EXIT) {
            destroyApp(true);
            notifyDestroyed();
        }
    }
}
