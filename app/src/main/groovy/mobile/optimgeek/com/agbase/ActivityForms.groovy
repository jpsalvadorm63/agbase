package mobile.optimgeek.com.agbase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle
import android.util.Log
import groovy.transform.CompileStatic;

@CompileStatic
public class ActivityForms extends AppCompatActivity {

    String             thisClassName

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forms);

        myControls()
        myData()
        myEvents()

        Log.i("OptimGeek", "${thisClassName} -> onCreate(Bundle savedInstanceState)")

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

}
