package com.github.agatagolonka.ox;

public class PairNumber {
    int key;
    char value;

    PairNumber(int key, char value) {
        this.key = key;
        this.value = value;
    }

    int getKey() {
        return key;
    }

    char getValue() {
        return value;
    }
}
