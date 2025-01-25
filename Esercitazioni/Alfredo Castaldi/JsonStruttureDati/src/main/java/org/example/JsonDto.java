package org.example;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class JsonDto {

    private Collection<Integer> numeriOriginali;
    private Map<String, Integer> analisi;
    private Map<String, List<Integer>> classificazione;

    public JsonDto(Collection<Integer> numeriOriginali, Map<String, Integer> analisi, Map<String, List<Integer>> classificazione) {
        this.numeriOriginali = numeriOriginali;
        this.analisi = analisi;
        this.classificazione = classificazione;
    }

    public Collection<Integer> getNumeriOriginali() {
        return numeriOriginali;
    }

    public void setNumeriOriginali(Collection<Integer> numeriOriginali) {
        this.numeriOriginali = numeriOriginali;
    }

    public Map<String, Integer> getAnalisi() {
        return analisi;
    }

    public void setAnalisi(Map<String, Integer> analisi) {
        this.analisi = analisi;
    }

    public Map<String, List<Integer>> getClassificazione() {
        return classificazione;
    }

    public void setClassificazione(Map<String, List<Integer>> classificazione) {
        this.classificazione = classificazione;
    }
}
