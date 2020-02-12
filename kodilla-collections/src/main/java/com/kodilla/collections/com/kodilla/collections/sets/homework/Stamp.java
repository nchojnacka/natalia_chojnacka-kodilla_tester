package com.kodilla.collections.com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {

    public String stampName;
    public String stampSize;
    public String stamped;

    public Stamp(String stampName, String stampSize, String stamped) {
        this.stampName = stampName;
        this.stampSize = stampSize;
        this.stamped = stamped;
    }

    public String getStampName() {
        return stampName;
    }

    public String getStampSize() {
        return stampSize;
    }

    public String getStamped() {
        return stamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stamp)) return false;
        Stamp stamp = (Stamp) o;
        return getStampName().equals(stamp.getStampName()) &&
                getStampSize().equals(stamp.getStampSize()) &&
                getStamped().equals(getStamped());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStampName(), getStampSize(), getStamped());
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampSize='" + stampSize + '\'' +
                ", stamped='" + stamped + '\'' +
                '}';
    }
}
