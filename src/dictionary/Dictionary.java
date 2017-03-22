/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adrianaden
 */
public  class Dictionary {
    
    private List dictionaryData;
    private final String filePath = "src/dictionary/dictionaries.properties";
            
    public Dictionary read() throws Exception {
        FileReader file = new FileReader(this.filePath);
        List bufferedDictionary = new ArrayList();
        try (BufferedReader br = new BufferedReader(file)) {
            String line;
            while ((line = br.readLine()) != null) {
                bufferedDictionary.add(line);
            }
        }
        this.setDictionaryData(bufferedDictionary);
        return this;
    }
    
    public List getDictionaryData() {
        return this.dictionaryData;
    }
    
    public void setDictionaryData(List dictionaryData) {
        this.dictionaryData = dictionaryData;
    }
}
