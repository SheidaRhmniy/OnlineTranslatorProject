package ir.shariaty.onlinetranslator.Models;

import  java.util.ArrayList;
import java.util.List;

public class Data {

    private int num_fund;
    private List<results> results;

    public Data(int num_fund, List<ir.shariaty.onlinetranslator.Models.results> results) {
        this.num_fund = num_fund;
        this.results = results;
    }

    public int getNum_fund() {
        return num_fund;
    }

    public void setNum_fund(int num_fund) {
        this.num_fund = num_fund;
    }

    public List<ir.shariaty.onlinetranslator.Models.results> getResults() {
        return results;
    }

    public void setResults(List<ir.shariaty.onlinetranslator.Models.results> results) {
        this.results = results;
    }
}
