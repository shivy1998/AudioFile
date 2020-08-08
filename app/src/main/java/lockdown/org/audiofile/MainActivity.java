package lockdown.org.audiofile;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    Button btnStart, btnPause;
    MediaPlayer mp;
    protected void onCreate(Bundle b)
    {
        super.onCreate(b);
        setContentView(R.layout.activity_main);
        btnStart = findViewById(R.id.btnStart);
        btnPause = findViewById(R.id.btnPause);
        mp = MediaPlayer.create(MainActivity.this,R.raw.a);
        btnStart.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp.start();
            }
        });
        btnPause.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp.pause();
            }
        });
    }
}