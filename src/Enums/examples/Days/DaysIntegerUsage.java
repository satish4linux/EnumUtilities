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
public enum DaysIntegerUsage implements RootEnum<Integer> {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    private final int type;

    @Override
    public Integer getType() {
        return type;
    }

    private DaysIntegerUsage(int type) {
        this.type = type;
    }
}
