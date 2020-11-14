package com.example.beyondLangiage.translator;
import com.google.cloud.translate.*;

public class Translator {

    
    
    
    
    
 // TODO(developer): Uncomment these lines.
  
  public void sarb() {
  Translate translate = TranslateOptions.getDefaultInstance().getService();

  
 
 
Detection s = (translate.detect("ਮੈਂ ਤੈਨੂੰ ਤੰਗ ਕਰਨਾ ਚਾਹੁੰਦਾ ਹਾਂ"));
 
System.out.println(s.getLanguage());
 

 System.out.printf("Translated Text: "+ translate.translate("ਮੈਂ ਤੈਨੂੰ ਤੰਗ ਕਰਨਾ ਚਾਹੁੰਦਾ ਹਾਂ", Translate.TranslateOption.targetLanguage("en")).getTranslatedText());
    
    
    
    
}
}