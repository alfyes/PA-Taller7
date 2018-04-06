package co.edu.uniandes.Workshop7.Library;

import uk.co.jemos.podam.common.AttributeStrategy;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import co.edu.uniandes.Workshop7.Library.Entities.Book.TypeBook;

public class TypeBookStratergy implements AttributeStrategy<TypeBook> {

    @Override
    public TypeBook getValue(Class<?> aClass, List<Annotation> list) {
        Random r = new Random();
        int can = TypeBook.values().length;
        int pos =r.nextInt(100000) % 3;
        return TypeBook.values()[r.nextInt(100000) % can];
    }
}
