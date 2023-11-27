//5. Выполните упаковку каждого примитива
// в соответствующую ему обёртку разными способами
// и обратную распаковку.
public class Task5 {
    public static void main(String[] args) {
        byte byteVar = 8;
//        Byte boxedByteConstructor = new Byte(byteVar);
        Byte boxedByteValueOf = Byte.valueOf(byteVar);
        Byte boxedByteAuto = byteVar;
        byte unboxedByteValue = boxedByteAuto.byteValue();
        byte unboxedByteAuto = boxedByteAuto;

        short shortVar = 16;
//        Short boxedShortConstructor = new Short(shortVar);
        Short boxedShortValueOf = Short.valueOf(shortVar);
        Short boxedShortAuto = shortVar;
        short unboxedShortValue = boxedShortAuto.shortValue();
        short unboxedShortAuto = boxedShortAuto;

        int intVar = 32;
//        Integer boxedIntConstructor = new Integer(intVar);
        Integer boxedIntValueOf = Integer.valueOf(intVar);
        Integer boxedIntAuto = intVar;
        int unboxedIntValue = boxedIntAuto.intValue();
        int unboxedIntAuto = boxedIntAuto;

        long longVar = 64;
//        Long boxedLongConstructor = new Long(longVar);
        Long boxedLongValueOf = Long.valueOf(longVar);
        Long boxedLongAuto = longVar;
        long unboxedLongValue = boxedLongAuto.longValue();
        long unboxedLongAuto = boxedLongAuto;

        float floatVar = 32.32f;
//        Float boxedFloatConstructor = new Float(floatVar);
        Float boxedFloatValueOf = Float.valueOf(floatVar);
        Float boxedFloatAuto = floatVar;
        float unboxedFloatValue = boxedFloatAuto.floatValue();
        float unboxedFloatAuto = boxedFloatAuto;

        double doubleVar = 64.64d;
//        Double boxedDoubleConstructor = new Double(doubleVar);
        Double boxedDoubleValueOf = Double.valueOf(doubleVar);
        Double boxedDoubleAuto = doubleVar;
        double unboxedDoubleValue = boxedDoubleAuto.doubleValue();
        double unboxedDoubleAuto = boxedDoubleAuto;

        char charVar = 	169;
//        Character boxedCharacterConstructor = new Character(charVar);
        Character boxedCharacterValueOf = Character.valueOf(charVar);
        Character boxedCharacterAuto = charVar;
        char unboxedCharacterValue = boxedCharacterAuto.charValue();
        char unboxedCharacterAuto = boxedCharacterAuto;

        boolean booleanVar = true;
//        Boolean boxedBooleanConstructor = new Boolean(booleanVar);
        Boolean boxedBooleanValueOf = Boolean.valueOf(booleanVar);
        Boolean boxedBooleanAuto = booleanVar;
        boolean unboxedBooleanValue = boxedBooleanAuto.booleanValue();
        boolean unboxedBooleanAuto = boxedBooleanAuto;

    }
}
