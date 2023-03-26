package com.vishwas.design.pattern.behavioral.strategy;
//ABSTRACTION LAYER BETWEEN LOW LEVEL (TV ,PHONE AND LAPTOP RENDERER) AND HIGH LEVEL (APP CLASS)
// ALSO KNOWN AS CONTEXT
public class ImageManager {
    private ImageRenderer renderer;

    // SETTING BEHAVIOR/STRATEGY
    public void setRenderer(ImageRenderer renderer){
        this.renderer = renderer;
    }

    // PERFORMING BEHAVIOR
    public void show(){
        renderer.showImage();
    }
}
