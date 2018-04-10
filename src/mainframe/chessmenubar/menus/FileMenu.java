

package mainframe.chessmenubar.menus;

import javax.swing.JMenu;

import mainframe.chessframe.MainFrame;
import mainframe.chessmenubar.menus.items.file.*;



public class FileMenu extends JMenu
{
    
    /** Creates a new instance of FileMenu */
    public FileMenu(MainFrame ff)
    {
        NItem=new NewItem(ff);
        setText("File");
        
        
        
        add(NItem);
        addSeparator();
        add(SItem);
        add(LItem);
        add(EItem);
        
    }
    public String getIPaddress()
    {
        return NItem.getIpAddress();
    }
    public String getportNumber()
    {
        return NItem.getportNumber();
    }
    
    
    private final NewItem NItem;
    private final SaveItem SItem=new SaveItem();
    private final LoadItem LItem=new LoadItem();
    private final ExitItem EItem=new ExitItem();
    
}
