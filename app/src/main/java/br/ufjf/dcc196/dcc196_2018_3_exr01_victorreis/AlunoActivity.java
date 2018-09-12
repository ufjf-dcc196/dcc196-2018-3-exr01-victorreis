package br.ufjf.dcc196.dcc196_2018_3_exr01_victorreis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AlunoActivity extends AppCompatActivity {

    private EditText edtAlunoNome;
    private EditText edtAlunoMatricula;
    private Button btnCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aluno);

        edtAlunoNome = (EditText) findViewById(R.id.edt_aluno_nome);
        edtAlunoMatricula = (EditText) findViewById(R.id.edt_aluno_matricula);

        btnCadastrar = (Button) findViewById(R.id.btn_cadastrar);
        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resultado = new Intent();

                String nome = edtAlunoNome.getText().toString();
                String matricula = edtAlunoMatricula.getText().toString();
                resultado.putExtra(MainActivity.ALUNO_NOME, nome);
                resultado.putExtra(MainActivity.ALUNO_MATRICULA, matricula);

                setResult(RESULT_OK, resultado);
                finish();
            }
        });
    }
}
