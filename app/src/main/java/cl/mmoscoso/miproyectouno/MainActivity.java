package cl.mmoscoso.miproyectouno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView text;
    Button button;
    Button buttonRegister;
    String texto = "Hola a todos";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView)findViewById(R.id.idTextChange);
        button = (Button)findViewById(R.id.mainButton);
        buttonRegister = (Button)findViewById(R.id.buttonRegister);


        buttonRegister.setOnClickListener(this);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonRegister:
                Toast.makeText(this,"Me voy a registrar para comer un completo",Toast.LENGTH_LONG).show();
                Intent home = new Intent(MainActivity.this,HomeActivty.class);
                startActivity(home);
                break;
            case R.id.mainButton:
                text.setText(texto);
                break;
        }
    }
}