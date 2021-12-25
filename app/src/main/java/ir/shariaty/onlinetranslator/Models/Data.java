package ir.shariaty.onlinetranslator.Models;

import  java.util.ArrayList;
import java.util.List;

public class Data {

    private int num_fund;
    private List<Word> results;

    public int getNum_fund() {
        return num_fund;
    }

    public List<Word> getResult() {

        return results;
    }

    public void setNum_fund(int num_fund) {
        this.num_fund = num_fund;
    }

    public void setResults(List<Word> results) {
        this.results = results;
    }
}
