package com.codedifferently.tdd.calculator.calculator.display;

public class DisplayImplementation implements Display{
    private DisplayMode displayMode;

    public DisplayImplementation(){
        this.displayMode = DisplayMode.DECIMAL;
    }

    @Override
    public void switchDisplayMode() {
        if (displayMode == DisplayMode.BINARY) {
            this.displayMode = DisplayMode.OCTAL;
        } else if (displayMode == DisplayMode.OCTAL) {
            this.displayMode = DisplayMode.DECIMAL;
        } else if (displayMode == DisplayMode.DECIMAL) {
            this.displayMode = DisplayMode.HEXADECIMAL;
        } else if (displayMode == DisplayMode.HEXADECIMAL) {
            this.displayMode = DisplayMode.BINARY;
        }
    }

    @Override
    public void switchDisplayMode(String mode) {
        DisplayMode displayMode1 = DisplayMode.valueOf(mode);
        this.displayMode = displayMode1;
    }

    @Override
    public String getCurrentDisplayMode() {
        return this.displayMode.toString();
    }
}
