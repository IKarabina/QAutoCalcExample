package com.example.models;

public final class Expression {

    private int first, second;
    private Operation operation;

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }
}
