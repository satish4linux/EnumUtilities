/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import EnumUtils.EnumUtils;
import Enums.examples.Days.DaysIntegerUsage;
import Enums.examples.Days.DaysListUsage;
import Enums.examples.Days.DaysStringUsage;

/**
 *
 * @author Satish
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean result;
        
        result = EnumUtils.checkEnumByName(DaysStringUsage.class, "MONDAY");
        System.out.println("First result : "+result);
        
        result = EnumUtils.checkEnumByName(DaysStringUsage.values(), "MONDAY");
        System.out.println("First result : "+result);
        
        result = EnumUtils.checkEnumByKey(DaysStringUsage.class, "THU");
        System.out.println("First result : "+result);
        
        result = EnumUtils.checkEnumByKey(DaysIntegerUsage.class, 4);
        System.out.println("First result : "+result);
        
        result = EnumUtils.checkEnumByKey(DaysListUsage.class, 8);
        System.out.println("First result : "+result);
    }
    
}
