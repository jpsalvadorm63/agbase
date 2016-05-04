package mobile.optimgeek.com.agbase

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import groovy.transform.CompileStatic


/**
 *
 */
@CompileStatic
public class MainActivity extends AppCompatActivity {

    String       thisClassName

    EditText     txtUser
    EditText     txtPassword
    Button       btnSubmit
    Button       btnExit
    Button       btnAbout
    MainActivity mainActivity
    AlertDialog  dlgAbout;

    String       strUser = 'root'
    String       strPassword = 'root'

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myControls()
        myData()
        myEvents()

        Toast.makeText(this, '${thisClassName} -> onCreate(Bundle savedInstanceState)', Toast.LENGTH_SHORT).show()
    }

    protected void myControls() {
        thisClassName = getClass().getSimpleName()
        txtUser       = findViewById(R.id.txtUser) as EditText
        txtPassword   = findViewById(R.id.txtPassword) as EditText
        btnSubmit     = findViewById(R.id.btnSubmit) as Button
        btnExit       = findViewById(R.id.btnExit) as Button
        btnAbout      = findViewById(R.id.btnAbout) as Button
        mainActivity  = this
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
            AlertDialog.Builder builder = new AlertDialog.Builder(this)
            builder.setIcon(R.mipmap.ic_settings_applications_black_24dp)
            builder.setTitle('About this app')
            builder.setMessage(". . . . it's just a demo !")
            builder.setCancelable(false)
            builder.setPositiveButton("OK",
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Log.i("OptimGeek","${thisClassName} -> DialogInterface.OnClickListener.onClick()")
                        }
                    }

            )

            dlgAbout = builder.show();
        }

        btnExit.onClickListener = {
            Toast.makeText(this, "${thisClassName}. C U next time !,  be a good boy . . .", Toast.LENGTH_SHORT).show()
            finish();
        }

    }

    @Override
    protected void onStart() {
        super.onStart()
        //Toast.makeText(this, "${thisClassName} -> onStart()", Toast.LENGTH_SHORT).show()
        Log.i("OptimGeek","${thisClassName} -> onStart()")
    }

    @Override
    protected void onResume() {
        super.onResume()
        //Toast.makeText(this, "${thisClassName} -> onResume()", Toast.LENGTH_SHORT).show()
        Log.i("OptimGeek","${thisClassName} -> onResume()")
    }

    @Override
    protected void onPause() {
        super.onPause()
        //Toast.makeText(this, "${thisClassName} -> onPause()", Toast.LENGTH_SHORT).show()

        if (dlgAbout != null)
            dlgAbout.dismiss();
        Log.i("OptimGeek","${thisClassName} -> onPause()")
    }

    @Override
    protected void onStop() {
        super.onStop()
        //Toast.makeText(this, "${thisClassName} -> onStop()", Toast.LENGTH_SHORT).show()
        Log.i("OptimGeek","${thisClassName} -> onStop()")
    }

    @Override
    protected void onDestroy() {
        super.onDestroy()
        //Toast.makeText(this, "${thisClassName} -> onDestroy()", Toast.LENGTH_SHORT).show()
        Log.i("OptimGeek","${thisClassName} -> onDestroy()")
    }

}
