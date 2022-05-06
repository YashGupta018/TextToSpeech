package com.yashgupta0113.texttospeech;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.EditText;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    TextToSpeech tts;
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = findViewById(R.id.ed1);
        tts = new TextToSpeech(getApplicationContext(), status -> {
            if(status != TextToSpeech.ERROR)
            {
                tts.setLanguage(Locale.UK);
            }

        });
    }
    public void convert(View view) {
        String str = et.getText().toString();
        tts.speak(str, TextToSpeech.QUEUE_FLUSH, null);
        //tts.speak(str, TextToSpeech.QUEUE_FLUSH, null, null);
    }
}