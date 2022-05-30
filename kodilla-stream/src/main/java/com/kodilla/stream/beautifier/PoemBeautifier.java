package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautifier(String decor, PoemDecorator poemDecorator) {
        String decoredText = poemDecorator.decorate(decor);
        System.out.println(decoredText);
    }
}
