package co.edu.uniandes.Workshop7.Library.Entities;

import co.edu.uniandes.Workshop7.Library.TypeBookStratergy;
import co.edu.uniandes.Workshop7.Library.CodeBookStratergy;

import uk.co.jemos.podam.common.PodamExclude;
import uk.co.jemos.podam.common.PodamStrategyValue;

import java.util.Date;

public class Book {
    
	public enum TypeBook{
		BIOGRAPHIES, SCIENTISTS, SCIENCE_fICTION
	}
	
	private int id;
    
    @PodamStrategyValue(TypeBookStratergy.class)
	private TypeBook type;

    private String name;

    private Date publicationDate;
    
    @PodamStrategyValue(CodeBookStratergy.class)
    private String code;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TypeBook getType() {
        return type;
    }

    public void setType(TypeBook type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
