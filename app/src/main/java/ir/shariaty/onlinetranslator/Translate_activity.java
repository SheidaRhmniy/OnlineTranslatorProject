package ir.shariaty.onlinetranslator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Translate_activity extends AppCompatActivity {
    TextView showWord , showMeaning;
    String title_en,pron,source,text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translate);

        showWord=(TextView)findViewById(R.id.showWord);
        showMeaning=(TextView)findViewById(R.id.showMeaning);

        String title=getIntent().getStringExtra("title");
        String title_en=getIntent().getStringExtra("title_en");

        if(title.equals(""))
        showWord.setText(title_en);
        else
            showWord.setText(title);

       // title_en=getIntent().getStringExtra("title_en");
       // pron=getIntent().getStringExtra("pron");
        source=getIntent().getStringExtra("source");
        text=getIntent().getStringExtra("text");

        showMeaning.setText(source+"\n"+text);


    }
}