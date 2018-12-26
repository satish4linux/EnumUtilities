/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enums.examples.Days;

import Enums.RootEnum;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Satish
 */
public enum DaysListUsage implements RootEnum<List> {
    MONDAY(new ArrayList(Arrays.asList(new Serializable[]{1, "MON"}))),
    TUESDAY(new ArrayList(Arrays.asList(new Serializable[]{2, "TUE"}))),
    WEDNESDAY(new ArrayList(Arrays.asList(new Serializable[]{3, "WED"}))),
    THURSDAY(new ArrayList(Arrays.asList(new Serializable[]{4, "THU"}))),
    FRIDAY(new ArrayList(Arrays.asList(new Serializable[]{5, "FRI"}))),
    SATURDAY(new ArrayList(Arrays.asList(new Serializable[]{6, "SAT"}))),
    SUNDAY(new ArrayList(Arrays.asList(new Serializable[]{7, "SUN"})));

    private final List type;

    @Override
    public List getType() {
        return type;
    }

    private DaysListUsage(List type) {
        this.type = type;
    }
}
