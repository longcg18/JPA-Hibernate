package org.longcg.entities;

import javax.persistence.AttributeConverter;
import javax.persistence.Convert;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class YesNoBooleanConverter implements AttributeConverter<Boolean, String> {

    @Override
    public String convertToDatabaseColumn(Boolean aBoolean) {
        return aBoolean ? "Y" : "N";
    }

    @Override
    public Boolean convertToEntityAttribute(String s) {
        return s.equals("Y");
    }
}
