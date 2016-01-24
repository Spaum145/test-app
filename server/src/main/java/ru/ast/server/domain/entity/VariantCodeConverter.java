package ru.ast.server.domain.entity;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 * Transforms enum representation for database
 * @author Fenix
 */
@Converter
public class VariantCodeConverter implements AttributeConverter<VariantCode, String> {

    public String convertToDatabaseColumn(VariantCode variantCode) {
        switch (variantCode) {
            case A:
                return "A";
            case B:
                return "B";
            case C:
                return "C";
            case D:
                return "D";
            case E:
                return "E";
            case F:
                return "F";
            default:
                throw new IllegalArgumentException("Unknown " + variantCode + "VariantCode value");
        }
    }

    public VariantCode convertToEntityAttribute(String s) {
        switch (s) {
            case "A":
                return VariantCode.A;
            case "B":
                return VariantCode.B;
            case "C":
                return VariantCode.C;
            case "D":
                return VariantCode.D;
            case "E":
                return VariantCode.E;
            case "F":
                return VariantCode.F;
            default:
                throw new IllegalArgumentException("Unknown " + s + "VariantCode value in DB");
        }
    }
}
