package org.wykapedia.example.lombok.ex6;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/*

@RequiredArgsConstructor, generates a constructor for all final fields, with parameter order same as field order
@NoArgsConstructor creates an empty constructor.
@AllArgsConstructor creates a constructor for all fields

*/


//@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LombokExample6 {
    //private final String sentence;
    private boolean isValue;
    private String val;
}
