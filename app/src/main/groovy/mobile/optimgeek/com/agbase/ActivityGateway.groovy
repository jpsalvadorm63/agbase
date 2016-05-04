package mobile.optimgeek.com.agbase

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

public class ActivityGateway extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState)
        contentView = R.layout.activity_gateway
        myControls()
        myData()
        myEvents()
    }

    protected void myControls() {

    }

    protected void myData() {

    }

    protected void myEvents() {

    }

}
