/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enums.examples.Days;

import Enums.RootEnum;

/**
 *
 * @author Satish
 */
public enum DaysStringUsage implements RootEnum<String> {
    MONDAY("MON"),
    TUESDAY("TUE"),
    WEDNESDAY("WED"),
    THURSDAY("THU"),
    FRIDAY("FRI"),
    SATURDAY("SAT"),
    SUNDAY("SUN");

    private final String type;

    @Override
    public String getType() {
        return type;
    }

    private DaysStringUsage(String type) {
        this.type = type;
    }
}
