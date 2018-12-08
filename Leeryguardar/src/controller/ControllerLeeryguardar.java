package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.ModelLeeryguardar;
import view.ViewLeeryguardar;

public class ControllerLeeryguardar implements ActionListener
{
    private final ModelLeeryguardar modelLeeryguardar;
    private final ViewLeeryguardar viewLeeryguardar;
    
    public ControllerLeeryguardar(ViewLeeryguardar viewLeeryguardar, ModelLeeryguardar modelLyE)    
    {
        this.viewLeeryguardar = viewLeeryguardar;
        this.modelLeeryguardar = modelLyE;
        viewLeeryguardar.Jmi_leer.addActionListener(this);
        viewLeeryguardar.Jmi_guardar.addActionListener(this);
        initView();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==viewLeeryguardar.Jmi_leer){
            modelLeeryguardar.setPath("C:\\Users\\yoselin\\Documents\\Leeryescribir\\archivo.txt");
            modelLeeryguardar.readFile(modelLeeryguardar.getPath());      
            viewLeeryguardar.Jta_txt.setText(modelLeeryguardar.getMessage());
        }else if(e.getSource()==viewLeeryguardar.Jmi_guardar){
            modelLeeryguardar.setPath("C:\\Users\\yoselin\\Documents\\Leeryescribir\\archivo.txt");
            modelLeeryguardar.setMessage(viewLeeryguardar.Jta_txt.getText());
            modelLeeryguardar.seveFile(modelLeeryguardar.getPath(), modelLeeryguardar.getMessage());
        }
    }
    private void initView() 
    {
        viewLeeryguardar.setTitle("Archivo");
        viewLeeryguardar.setResizable(false);
        viewLeeryguardar.setLocationRelativeTo(null);
        viewLeeryguardar.setVisible(true);
    }
}
       