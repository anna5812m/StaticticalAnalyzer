package model;

public interface Step <T, U> {
    public U execute(T input);
}
