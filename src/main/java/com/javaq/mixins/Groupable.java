package com.javaq.mixins;

import com.javaq.construct.GroupBy;

/**
 * @author Vivek Mittal
 */
public interface Groupable extends JavaQContext {
    public default GroupBy groupBy(String variable) {
        return new GroupBy(this, variable);
    }
}
