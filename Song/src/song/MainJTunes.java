package song;

public class MainJTunes {
    
    private static JTunes jtunes = new JTunes(5);

    public static void main(String[] args) {
        
        FrmMenuInicial inicial = new FrmMenuInicial(jtunes);
        inicial.setVisible(true);
        inicial.setLocationRelativeTo(null);
        
    }
}
