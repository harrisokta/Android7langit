package harris.tes7langit.sosmed;

import harris.tes7langit.sosmed.util.SystemUiHider;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.view.Menu;


/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 *
 * @see SystemUiHider
 */
public class FullscreenActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen);
    }
    Button fb = (Button) findViewById(R.id.FBbutton);
    fb.setOnClickListener(new View.OnClickListener() {

        public void onClick(View view) {
            // TODO Auto-generated method stub
            Intent a = new Intent(getApplicationContext(), loginfb.class);
            a.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(a);
        }
    });

    Button go = (Button) findViewById(R.id.Gbutton);

    go.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View view) {
            // TODO Auto-generated method stub
            Intent b = new Intent(getApplicationContext(), logingoogle.class);
            b.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(b);
        }
    });



    }


