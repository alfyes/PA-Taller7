package co.edu.uniandes.Workshop7.Library;

import uk.co.jemos.podam.common.AttributeStrategy;

import org.apache.commons.lang3.RandomStringUtils;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Random;

@SuppressWarnings("deprecation")
public class CodeBookStratergy implements AttributeStrategy<String> {


    @Override
    public String getValue(Class<?> aClass, List<Annotation> list) {
        Random r = new Random();
        
        
        return RandomStringUtils.random(3, true, false) + RandomStringUtils.random(3, false, true);
    }
}
