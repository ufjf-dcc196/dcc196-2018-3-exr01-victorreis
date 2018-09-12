package br.ufjf.dcc196.dcc196_2018_3_exr01_victorreis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ExternoActivity extends AppCompatActivity {

    private EditText edtExternoNome;
    private EditText edtExternoEmail;
    private Button btnCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_externo);

        edtExternoNome = (EditText) findViewById(R.id.edt_externo_nome);
        edtExternoEmail = (EditText) findViewById(R.id.edt_externo_email);

        btnCadastrar = (Button) findViewById(R.id.btn_externo_cadastrar);
        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resultado = new Intent();

                String nome = edtExternoNome.getText().toString();
                String email = edtExternoEmail.getText().toString();
                resultado.putExtra(MainActivity.EXTERNO_NOME, nome);
                resultado.putExtra(MainActivity.EXTERNO_EMAIL, email);

                setResult(RESULT_OK, resultado);
                finish();
            }
        });
    }
}
