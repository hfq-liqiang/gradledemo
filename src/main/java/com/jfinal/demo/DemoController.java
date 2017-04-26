package com.jfinal.demo;

import com.jfinal.core.Controller;

public class DemoController extends Controller{
    public void hello(){
       renderText("hello world");
    }

}