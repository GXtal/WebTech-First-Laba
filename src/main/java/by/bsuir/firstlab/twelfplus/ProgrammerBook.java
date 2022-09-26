/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package by.bsuir.firstlab.twelfplus;

/**
 *
 * @author Иван
 */
public class ProgrammerBook extends Book{
    private String language;
    private int level;
    
    
    public ProgrammerBook(){
        language= "en";
        level=0;
    }
    
    public ProgrammerBook(String _language, int _level){
        language= _language;
        level=_level;
    }
    
        @Override
    public String toString(){
        String res=super.toString();
        res+=" language:"+language + " level:"+level;
        return res;
    }
    
    @Override   
    public boolean equals(Object obj)
    { 
        if (obj instanceof ProgrammerBook)
        {
            if(super.equals(obj))
            {
                if(((ProgrammerBook) obj).language==language)
                {
                    if(((ProgrammerBook) obj).level==level)
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public int hashCode()
    {        
        int res=super.hashCode();
        res+=language.hashCode();
        res+=level;          
        
        return res;
    }

}
