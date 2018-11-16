/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fichacatalografica;

import java.awt.event.*;

/**
 *
 * @author Vien
 */
public class ManipuladorTexto implements ActionListener{
    private final GUI gui;
    
    ManipuladorTexto(GUI gui)
    {
        this.gui = gui;
    }
    
    @Override
    public void actionPerformed(ActionEvent event)
    {
        if(event.getSource() == gui.getTextoAutor())
        {
            gui.getFormulario().setAutor(event.getActionCommand());
        }
        else if(event.getSource() == gui.getTextoTitulo())
        {
            gui.getFormulario().setTitulo(event.getActionCommand());
        }
        else if(event.getSource() == gui.getTextoDescricao())
        {
            gui.getFormulario().setDescricao(event.getActionCommand());
        }
        else if(event.getSource() == gui.getTextoNotas())
        {
            gui.getFormulario().setNotas(event.getActionCommand());
        }
        else if(event.getSource() == gui.getTextoAssunto())
        {
            gui.getFormulario().setAssunto(event.getActionCommand());
        }
        
    }
}
