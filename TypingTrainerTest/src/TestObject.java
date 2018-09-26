/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sulakshana Ranawake
 */
public class TestObject {
    int length;
    int height;
    int width;
    
    TestObject(){
        System.out.println("Default constructor");
    }
    
    TestObject(int a, int b, int c){
        System.out.println("Constructor with three parameters");
        length = a;
        height = b;
        width = c;
    }
    
    
    public int getVolume(){
        return length*height*width;
    }
}