/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnumUtils;

import Enums.RootEnum;
import java.util.Objects;

/**
 *
 * @author Satish
 */
public class EnumUtils {

    public static <T extends Enum<T>> boolean checkEnumByName(T[] t, String test) {
        for (T obj : t) {
            if (obj.name().equals(test)) {
                return true;
            }
        }
        return false;
    }

    public static <T extends Enum<T>> boolean checkEnumByName(Class<T> t, String test) {
        T[] enumData = t.getEnumConstants();
        for (T data : enumData) {
            if (data.name().equals(test)) {
                return true;
            }
        }
        return false;
    }

    public static <T extends Enum<T> & RootEnum<E>, E> boolean checkEnumByValue(T[] t, E test) {
        for (T obj : t) {
            if (Objects.equals(obj.getType(), test)) {
                return true;
            }
        }
        return false;
    }

    public static <T extends Enum<T> & RootEnum<E>, E> boolean checkEnumByValue(Class<T> t, E test) {
        T[] enumData = t.getEnumConstants();
        for (T data : enumData) {
            if (Objects.equals(data.getType(), test)) {
                return true;
            }
        }
        return false;
    }
}
