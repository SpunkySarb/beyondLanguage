package com.example.beyondLangiage.translator;

import com.google.cloud.translate.*;

public class Translator {

    public static Translate translate = TranslateOptions.getDefaultInstance().getService();


 

    /**
     * 
     * @param text = language to detect
     * @return detected language
     */
    public static String detectedLanguage(String text) {

        Detection d = translate.detect(text);

        return d.getLanguage();

    }

    
    /**
     * 
     * @param text
     * @return translated text in english
     */
    public static String translateToEnglish(String text) {

        return translate.translate(text, Translate.TranslateOption.targetLanguage("en")).getTranslatedText();

    }

    /**
     * 
     * @param text
     * @return translated text in punjabi
     */
    public static String translateToPunjabi(String text) {

        return translate.translate(text, Translate.TranslateOption.targetLanguage("pa")).getTranslatedText();

    }
    
    /**
     * 
     * @param text
     * @return translated text in french
     */
    public static String translateToFrench(String text) {

        return translate.translate(text, Translate.TranslateOption.targetLanguage("fr")).getTranslatedText();

    }
    
    
    
    
    
    
    
    
    
    
}