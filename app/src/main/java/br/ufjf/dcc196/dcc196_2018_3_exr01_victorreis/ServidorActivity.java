package br.ufjf.dcc196.dcc196_2018_3_exr01_victorreis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ServidorActivity extends AppCompatActivity {

    private EditText edtServidorNome;
    private EditText edtServidorSiape;
    private Button btnCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servidor);

        edtServidorNome = (EditText) findViewById(R.id.edt_servidor_nome);
        edtServidorSiape = (EditText) findViewById(R.id.edt_servidor_siape);

        btnCadastrar = (Button) findViewById(R.id.btn_servidor_cadastrar);
        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resultado = new Intent();

                String nome = edtServidorNome.getText().toString();
                String siape = edtServidorSiape.getText().toString();
                resultado.putExtra(MainActivity.SERVIDOR_NOME, nome);
                resultado.putExtra(MainActivity.SERVIDOR_SIAPE, siape);

                setResult(RESULT_OK, resultado);
                finish();
            }
        });
    }
}
