package ir.shariaty.onlinetranslator.Models;

public class Meta {
    private String q;
    private String type;
    private String filter;

    public Meta(String q, String type, String filter) {
        this.q = q;
        this.type = type;
        this.filter = filter;
    }

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }
}
