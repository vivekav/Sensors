package vivek.felight.com.sensors;

import android.app.ListActivity;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import java.util.ArrayList;
import java.util.List;

public class AllSensors extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_sensors);

        SensorManager sensorManager=(SensorManager)this.getSystemService(this.SENSOR_SERVICE);
        List<Sensor> slist=sensorManager.getSensorList(Sensor.TYPE_ALL);

        List<String> names=new ArrayList();
        for(int i=0;i<slist.size();i++){
            names.add(((Sensor)slist.get(i)).getName());
        }

        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,names));

getListView().setTextFilterEnabled(true);
    }
}
