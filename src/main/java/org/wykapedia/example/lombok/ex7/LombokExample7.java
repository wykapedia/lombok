package org.wykapedia.example.lombok.ex7;

import org.wykapedia.example.lombok.ex6.LombokExample6;
import lombok.*;


/*
val, it can be used replacing any Class name, good replacement for Huge classnames
*/


public class LombokExample7 {
    public void tryit () {
        LombokExample6 example6 = new LombokExample6();
        val expected = new LombokExample6();
    }
}

