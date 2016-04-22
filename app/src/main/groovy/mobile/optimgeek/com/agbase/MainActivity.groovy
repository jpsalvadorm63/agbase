package mobile.optimgeek.com.agbase

import android.app.Activity
import android.content.Intent

// import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import groovy.transform.CompileStatic


@CompileStatic
public class MainActivity extends Activity {

    EditText     user
    EditText     password
    Button       btnSubmit
    Button       btnExit
    MainActivity loginAct

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myControls()
        myData()
        myEvents()
    }

    protected void myControls() {
        user      = findViewById(R.id.txtUser) as EditText
        password  = findViewById(R.id.txtPassword) as EditText
        btnSubmit = findViewById(R.id.btnSubmit) as Button
        btnExit   = findViewById(R.id.btnExit) as Button
        loginAct  = this
    }

    protected void myData() {
        user.text = "fic"
        password.text = 'fic2015'
    }

    protected void myEvents() {

        btnSubmit.onClickListener =  {
            if(user.getText().toString().equals("fic") && password.getText().toString().equals("fic2015")) {
                Toast.makeText(this, ". . . in construction !", Toast.LENGTH_SHORT).show()
                /*
                Intent inent = new Intent(loginAct, mobile.sigtierras.gob.ec.fic.MainMenuActivity.class);
                startActivity(inent);
                */
            }
        }

        btnExit.onClickListener = {
            Toast.makeText(this, "Hasta la próxima !,  pórtate bien . . .", Toast.LENGTH_SHORT).show()
            finish();
        }

    }

}
