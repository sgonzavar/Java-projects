package Clases;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utilidades {

    public static boolean esNumerico(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public static Date StringToDate(String fecha) {
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy/mm/dd");
        Date aux = null;
        try {
            aux = formatoDelTexto.parse(fecha);
        } catch (Exception ex) {

        }
        return aux;
    }

    public static String formatDate(Date fecha) {
        SimpleDateFormat formatoDeTexto = new SimpleDateFormat("yyyy/mm/dd");
        return formatoDeTexto.format(fecha);
    }

    public static int objectToInt(Object Obj) {
        int NumInt = Integer.parseInt(objectToString(Obj));
        return NumInt;
    }

    public static double objectToDouble(Object Obj) {
        String Str = Obj.toString();
        double NumDouble = Double.valueOf(Str).doubleValue();
        return NumDouble;
    }

    public static boolean objectToBoolean(Object Obj) {
        String CadBooleana = objectToString(Obj);
        Boolean booleano = new Boolean(CadBooleana);
        return booleano;
    }

    public static String objectToString(Object Obj) {
        String Str = "";
        if (Obj != null) {
            Str = Obj.toString();
        }
        return Str;
    }
}
