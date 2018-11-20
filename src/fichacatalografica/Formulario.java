/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fichacatalografica;

import java.io.*;
import java.text.SimpleDateFormat;  
import java.util.Date; 


/**
 *
 * @author Vien
 */
public class Formulario {
    private String aluno;
    private String autor;
    private String titulo;
    private String descricao;
    private String notas;
    private String assunto;
    private Date date;
    private String comentarios;
    
    
    public void setComentarios(String comentarios)
    {
        this.comentarios = comentarios;
    }
    
    public String getComentario()
    {
        return comentarios;
    }

    public void setDate()
    {
        date = new Date();
    }
    
    public Date getDate()
    {
        return date;
    }
    
    public String getAutor()
    {
        return autor;
    }
    
    public String getTitulo()
    {
        return titulo;
    }
    
    public String getDescricao()
    {
        return descricao;
    }
    
    public String getNotas()
    {
        return notas;
    }
    
    public String getAssunto()
    {
        return assunto;
    }
    
    public String getAluno()
    {
        return aluno;
    }
    
    public void setAluno(String aluno)
    {
        this.aluno = aluno;
    }
    public void setAutor(String autor)
    {
        this.autor = autor;
    }
    
    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }
    
    public void setDescricao(String descricao)
    {
        this.descricao = descricao;
    }
    
    public void setNotas(String notas)
    {
        this.notas = notas;
    }
    
    public void setAssunto(String assunto)
    {
        this.assunto = assunto;
    }
    
    public void resetForm()
    {
        assunto = "";
        notas = "";
        descricao = "";
        titulo = "";
        autor = "";
        aluno = "";
    }
    
    public void writeToFile(String fileName)
    {
        File file = new File(fileName);
        
        try
        {
            FileWriter fr = new FileWriter(file);
            fr.write(this.toString());
            fr.close();
        } 
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
    @Override
    public String toString()
    {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        String s ="Feito por: " + aluno + 
                   " as: " + formatter.format(date) +
                  "\r\nAutor = " + autor
                  +"\r\nTitulo = " + titulo
                  +"\r\nDescricao = " + descricao
                  +"\r\nNotas = " + notas
                  +"\r\nAssunto = " + assunto 
                  +"\r\nComentarios = " + comentarios + "\r\n";
        
        return s;
    }      
}
