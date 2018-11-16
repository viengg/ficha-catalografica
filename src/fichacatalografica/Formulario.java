/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fichacatalografica;

import java.io.*;


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
        String s ="Feito por: " + aluno + 
                  "\r\nAutor = " + autor
                  +"\r\nTitulo = " + titulo
                  +"\r\nDescricao = " + descricao
                  +"\r\nNotas = " + notas
                  +"\r\nAssunto = " + assunto +"\r\n";
        
        return s;
    }      
}
