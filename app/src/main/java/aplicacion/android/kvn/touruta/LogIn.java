package aplicacion.android.kvn.touruta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LogIn extends AppCompatActivity implements View.OnClickListener {

    Button btnLoginLI, btnSignupLI;
    EditText txtEmailLI, txtPasswordLI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        txtEmailLI =findViewById(R.id.txtEmailLI);
        txtPasswordLI =findViewById(R.id.txtPassword);
        btnLoginLI =findViewById(R.id.btnLoginLI);
        btnSignupLI =findViewById(R.id.btnSignupLI);
        btnLoginLI.setOnClickListener(this);
        btnSignupLI.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if(v== btnLoginLI){Login();}
        else if(v== btnSignupLI){Signup();}
    }

    private void Signup() {
        Intent SignUpIntent = new Intent(this,SignUp.class);
        startActivity(SignUpIntent);
    }

    private void Login() {
        if(txtEmailLI.getText().toString().equals("admin") && txtPasswordLI.getText().toString().equals("admin")){
            Toast.makeText(this,"BienVenido",Toast.LENGTH_LONG).show();
            //Intent toursIntent = new Intent(this,ToursActivity.class);
            //startActivity(toursIntent);
        }
    }


}