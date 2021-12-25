package ir.shariaty.onlinetranslator.Models;

public class Word {
    private String id;
    private  String title;
    private String title_en;
    private  String pron;
    private String source;
    private String db;
    private String text;


    public Word(String id, String title, String title_en,String pron, String source, String db, String text) {
        this.id = id;
        this.title = title;
        this.title_en = title_en;
        this.pron=pron;
        this.source = source;
        this.db = db;
        this.text = text;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTitle_en(String title_en) {
        this.title_en = title_en;
    }

    public void setPron(String pron) {
        this.pron = pron;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPron() {
        return pron;
    }

    public String getTitle_en() {
        return title_en;
    }

    public String getSource() {
        return source;
    }

    public String getDb() {
        return db;
    }

    public String getText() {
        return text;
    }
}
