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
public class Main {
    public static void main(String[] args) {
        String choiceA = "George Washington";
        String choiceB = "Abraham Lincoln";
        String choiceC = "Donald Trump";
        String choiceD = "Harambe";
        String answer = choiceA;
        String questionString = "Who was the first President of the USA?";
        
        String trueFalseText = "True(T) or False(F): The sky is blue.";
        String trueFalseAnswer = "F";
        
        String fillInBlankText = "_______________ was the 16th President of the United States.";
        String fillInBlankAnswer="Abraham Lincoln";
        
        MultipleChoice question1 = new MultipleChoice(questionString, answer, choiceA, choiceB, choiceC, choiceD);
        Question question2 = new Question(trueFalseText, trueFalseAnswer);
        Question question3 = new Question(fillInBlankText, fillInBlankAnswer);
        
        ArrayList<Question> quizList = new ArrayList<Question>();
        quizList.add(question1);
        quizList.add(question2);
        quizList.add(question3);
        
        Quiz quiz = new Quiz(quizList);
        
        
        int score = 0;
        
        score = quiz.QuizLoop(score);
        System.out.println("Score: " + score);
    }
}
