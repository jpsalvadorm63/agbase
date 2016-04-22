package mobile.optimgeek.com.agbase

import android.app.Activity
// import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

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

        controls2fields()
        data2controls()
    }

    protected void controls2fields() {
        user      = findViewById(R.id.txtUser) as EditText
        password  = findViewById(R.id.txtPassword) as EditText
        btnSubmit = findViewById(R.id.btnSubmit) as Button
        btnExit   = findViewById(R.id.btnExit) as Button
        loginAct  = this
    }

    protected void data2controls() {
        user.text = "fic"
        password.text = 'fic2015'
    }



}
