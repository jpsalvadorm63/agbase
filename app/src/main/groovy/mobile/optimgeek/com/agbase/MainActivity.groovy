package mobile.optimgeek.com.agbase

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import android.content.pm.PackageInfo
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import groovy.transform.CompileStatic


@CompileStatic
public class MainActivity extends AppCompatActivity {

    String       thisClassName

    EditText     txtUser
    EditText     txtPassword
    Button       btnSubmit
    Button       btnExit
    Button       btnAbout
    MainActivity mainActivity
    AlertDialog  dlgAbout
    PackageInfo  pInfo

    String       strUser = 'root'
    String       strPassword = 'root'

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState)
        contentView = R.layout.activity_main

        myControls()
        myData()
        myEvents()

        Log.i("OptimGeek", "${thisClassName} -> onCreate(Bundle savedInstanceState)")
    }

    protected void myControls() {
        thisClassName = getClass().getSimpleName()
        txtUser       = findViewById(R.id.txtUser) as EditText
        txtPassword   = findViewById(R.id.txtPassword) as EditText
        btnSubmit     = findViewById(R.id.btnSubmit) as Button
        btnExit       = findViewById(R.id.btnExit) as Button
        btnAbout      = findViewById(R.id.btnAbout) as Button
        mainActivity  = this
        pInfo = getPackageManager().getPackageInfo(getPackageName(), 0)
    }

    protected void myData() {
        txtUser.text = strUser
        txtPassword.text = strPassword
    }

    protected void myEvents() {
        btnSubmit.onClickListener =  {
            if( strUser == txtUser.text.toString() && strPassword == txtPassword.text.toString() ) {
                Intent inent = new Intent(mainActivity, ActivityGateway)
                startActivity(inent)
            } else
                Toast.makeText(this, txtUser.text, Toast.LENGTH_SHORT).show()
        }

        btnAbout.onClickListener = {
            String strHtml = """This app is an Android Groovy Template, just for experimental
                                purpose, not for production. No warranty at all"""

            dlgAbout = OGDialogs.quickie(this, strHtml)
        }

        btnExit.onClickListener = {
            Toast.makeText(this, "${thisClassName}. C U next time !,  be a good boy . . .", Toast.LENGTH_SHORT).show()
            finish();
        }

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

        if (dlgAbout != null) {
            Log.i("OptimGeek", "Closing AlertDialog")
            dlgAbout.dismiss()
        }

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
