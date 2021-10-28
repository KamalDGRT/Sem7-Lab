import java.awt.*;
import java.awt.event.*;
import java.applet.Applet.*;

public class SimpleMenuExample extends Frame implements ActionListener {
    Menu buy, profile;

    public SimpleMenuExample() {
        MenuBar mb = new MenuBar(); // begin with creating menu bar
        setMenuBar(mb); // add menu bar to frame

        buy = new Menu("Buy Now"); // create menus
        profile = new Menu("profile");

        mb.add(buy); // add menus to menu bar
        mb.add(profile);

        buy.addActionListener(this); // link with ActionListener for event handling
        profile.addActionListener(this);

        buy.add(new MenuItem("Sandwitch"));
        buy.add(new MenuItem("Chapati"));
        buy.add(new MenuItem("Biriyani"));
        buy.addSeparator(); // separator line
        buy.add(new MenuItem("Coco Cola"));
        buy.add(new MenuItem("Sprite"));
        buy.add(new MenuItem("Limca"));

        profile.add(new MenuItem("My Profile"));
        profile.add(new MenuItem("Change Password"));
        profile.add(new MenuItem("My Orders"));
        profile.addSeparator(); // separator
        profile.add(new MenuItem("Logout"));

        setTitle("Simple Menu Program"); // frame creation methods
        setSize(300, 300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand(); // know the menu item selected by the user
        System.out.println("You selected " + str);
    }

    public static void main(String args[]) {
        new SimpleMenuExample();
    }
}
