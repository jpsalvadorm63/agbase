package mobile.optimgeek.com.agbase

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

public class ActivityGateway extends AppCompatActivity {

    String thisClassName

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState)
        contentView = R.layout.activity_gateway

        myControls()
        myData()
        myEvents()

        Log.i("OptimGeek", "${thisClassName} -> onCreate(. . .)")
    }

    protected void myControls() {
        thisClassName = getClass().getSimpleName()
    }

    protected void myData() {

    }

    protected void myEvents() {

    }

    @Override
    protected void onStart() {
        super.onStart()

        Log.i("OptimGeek", "${thisClassName} -> onStart()")
    }

    @Override
    protected void onResume() {
        super.onResume()

        Log.i("OptimGeek", "${thisClassName} -> onResume()")
    }

    @Override
    protected void onPause() {
        super.onPause()

        Log.i("OptimGeek", "${thisClassName} -> onPause()")
    }

    @Override
    protected void onStop() {
        super.onStop()

        Log.i("OptimGeek", "${thisClassName} -> onStop()")
    }

    @Override
    protected void onDestroy() {
        super.onDestroy()

        Log.i("OptimGeek", "${thisClassName} -> onDestroy()")
    }

}
