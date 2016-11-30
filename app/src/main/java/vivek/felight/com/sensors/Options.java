package vivek.felight.com.sensors;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Options extends AppCompatActivity {

    ImageButton iblist;
    ImageButton ibmagnetic;
    ImageButton ibshake;
    ImageButton ibmagstrength;
    ImageButton ibmove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);

    iblist=(ImageButton)findViewById(R.id.ibsensorall);
        ibmagnetic=(ImageButton)findViewById(R.id.magnetic);
        ibshake=(ImageButton)findViewById(R.id.ibshake);
        ibmagstrength=(ImageButton)findViewById(R.id.ibmagstrength);
        ibmove=(ImageButton)findViewById(R.id.ibmove);

        iblist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(),AllSensors.class));
            }
        });

        ibmagnetic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(),MagneticCompass.class));
            }
        });

        ibshake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(),ReadMagneticData.class));
            }
        });

        ibmagstrength.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(),MagneticStrengthData.class));
            }
        });

        ibmove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(),ShakeActivity.class));
            }
        });
    }
}