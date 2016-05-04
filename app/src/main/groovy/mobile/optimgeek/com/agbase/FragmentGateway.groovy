package mobile.optimgeek.com.agbase

import android.app.AlertDialog
import android.app.Fragment
import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import groovy.transform.CompileStatic


/**
 *
 */
@CompileStatic
public class FragmentGateway extends Fragment {

    String       thisClassName

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_gateway, container, false)

        myControls()
        myData()
        myEvents()

        Toast.makeText(getActivity(), "${thisClassName} -> onCreateView(. . .)", Toast.LENGTH_SHORT).show()

        return rootView
    }

    protected void myControls() {
        thisClassName = getClass().getSimpleName()
    }

    protected void myData() {

    }

    protected void myEvents() {

    }

    @Override
    void onStart() {
        super.onStart()
        Toast.makeText(getActivity(), "${thisClassName} -> onStart()", Toast.LENGTH_SHORT).show()
    }

    @Override
    void onResume() {
        super.onResume()
        Toast.makeText(getActivity(), "${thisClassName} -> onResume()", Toast.LENGTH_SHORT).show()
    }

    @Override
    void onPause() {
        super.onPause()
        Toast.makeText(getActivity(), "${thisClassName} -> onPause()", Toast.LENGTH_SHORT).show()
    }

    @Override
    void onStop() {
        super.onStop()
        Toast.makeText(getActivity(), "${thisClassName} -> onStop()", Toast.LENGTH_SHORT).show()
    }

    @Override
    void onDestroy() {
        super.onDestroy()
        Toast.makeText(getActivity(), "${thisClassName} -> onDestroy()", Toast.LENGTH_SHORT).show()
    }

}
