/*
 * The MIT License
 *
 * Copyright 2021 Hyper10n.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.quiz;
import java.util.*;

/**
 *
 * @author Hyper10n
 */
public class Question {
    public Question(String questionText, String answer) {
        this.questionText = questionText;
        this.answer = answer;
    }
    
    public int checkAnswer(String guess) {
        String cleanInput = guess.toUpperCase().trim();
        switch (cleanInput) {
            case "FALSE" -> cleanInput = "F";
            case "TRUE" -> cleanInput = "T";
            default -> cleanInput = "-1";
        }
        if ( this.answer.equals(cleanInput) ) {
            return 1;
        }
        else {
            return 0;
        }
    }
    
    @Override
    public String toString() {
        return this.questionText;
    }
    
    private String questionText = null;
    private String answer = null;
}
