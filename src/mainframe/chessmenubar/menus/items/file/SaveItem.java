
package mainframe.chessmenubar.menus.items.file;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFileChooser;
import javax.swing.JMenuItem;


public class SaveItem extends JMenuItem
{
    
    /** Creates a new instance of SaveItem */
    public SaveItem()
    {
        setText("Save Game");
        addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                SaveFile.showSaveDialog(null);
                
            }
        });
    }
    
    private final  JFileChooser SaveFile=new JFileChooser();
}
