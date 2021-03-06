package software.unf.dk.sheepster;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.media.Image;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends Activity {
    public int count=0;
    public int count2;
    public String highscore="0";
    public int life;
    private TextView highScoreTextView;
    private int highscoreGemt1;
    private Paint sky;

    CanvasView cv;
    CanvasView cv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Hente gemt highscore
        SharedPreferences prefs = getSharedPreferences("prefs", lvl2Activty.MODE_PRIVATE);
        highscoreGemt1 = prefs.getInt("HighscoreGemt", highscoreGemt1);

        //Opdater TextView
        //highScoreTextView = (TextView) findViewById(R.id.highscoreTextView);
        //highScoreTextView.setText("Highscore: " + highscoreGemt1);
    }

    //Knappen kalder denne metode, som kalder metoden i CanvasView. I kan ikke få knapper til direkte at kalde metoder i jeres View

    public void tolvl1(View view) {
        Intent lvl1Intent = new Intent(this, lvl1Activity.class);
        startActivity(lvl1Intent);
    }

    public void tolvl2(View view) {
        Intent lvl2Intent = new Intent(this, lvl2Activty.class);
        startActivity(lvl2Intent);
    }

    public void skinselector (View view){
        Intent skinselectorIntent = new Intent (this, skinSelectorActivity.class);
        startActivity(skinselectorIntent);
    }
}
