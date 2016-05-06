package mobile.optimgeek.com.agbase

import android.app.AlertDialog
import android.app.Fragment
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import groovy.transform.CompileStatic


@CompileStatic
public class FragmentGateway extends Fragment {

    String             thisClassName

    AppCompatActivity  actContainer
    Button             btnT3
    Button             btnForm
    Button             btnBack
    AlertDialog        dlgT3, dlgForms

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_gateway, container, false)

        myControls(rootView)
        myData()
        myEvents()

        Log.i("OptimGeek", "${thisClassName} -> onCreateView(. . .)")

        return rootView
    }

    protected void myControls(View rootView) {
        actContainer = this.getActivity() as AppCompatActivity
        thisClassName = getClass().getSimpleName()
        btnT3 = rootView.findViewById(R.id.btn_act_t3) as Button
        btnForm = rootView.findViewById(R.id.btn_act_forms) as Button
        btnBack = rootView.findViewById(R.id.btn_back) as Button
    }

    protected void myData() {

    }

    protected void myEvents() {

        btnT3.onClickListener = {
            dlgT3 = OGDialogs.quickie(actContainer, "Sorry 4 this, this option is under construction")
        }

        btnForm.onClickListener = {
            // dlgForms = OGDialogs.quickie(actContainer, "Sorry 4 this, this option is under construction")
            Intent inent = new Intent(this.getActivity(), ActivityForms)
            startActivity(inent)
        }

        btnBack.onClickListener = {
            getActivity().onBackPressed();
        }

    }

    @Override
    void onStart() {
        super.onStart()

        Log.i("OptimGeek", "${thisClassName} -> onStart()")
    }

    @Override
    void onResume() {
        super.onResume()

        Log.i("OptimGeek",  "${thisClassName} -> onResume()")
    }

    @Override
    void onPause() {
        super.onPause()

        if (dlgT3 != null)
            dlgT3.dismiss()

        if (dlgForms != null)
            dlgForms.dismiss()

        Log.i("OptimGeek", "${thisClassName} -> onPause()")
    }

    @Override
    void onStop() {
        super.onStop()

        Log.i("OptimGeek", "${thisClassName} -> onStop()")
    }

    @Override
    void onDestroy() {
        super.onDestroy()

        Log.i("OptimGeek", "${thisClassName} -> onDestroy()")
    }

}
