package br.ufjf.dcc196.dcc196_2018_3_exr01_victorreis;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView txtNumeroAlunos;
    private TextView txtNumeroServidores;
    private TextView txtNumeroExternos;
    private TextView txtNumeroTotal;

    private Button btnAlunos;
    private Button btnServidores;
    private Button btnExternos;

    private static final int REQUEST_ALUNO = 1;
    private static final int REQUEST_SERVIDOR = 2;
    private static final int REQUEST_EXTERNO = 3;

    public static final String ALUNO_NOME = "ALUNO_NOME";
    public static final String ALUNO_MATRICULA = "ALUNO_MATRICULA";
    public static final String SERVIDOR_NOME = "SERVIDOR_NOME";
    public static final String SERVIDOR_SIAPE = "SERVIDOR_SIAPE";
    public static final String EXTERNO_NOME = "EXTERNO_NOME";
    public static final String EXTERNO_EMAIL = "EXTERNO_EMAIL";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNumeroAlunos = (TextView) findViewById(R.id.txt_nro_alunos);
        txtNumeroServidores = (TextView) findViewById(R.id.txt_nro_servidores);
        txtNumeroExternos = (TextView) findViewById(R.id.txt_nro_externos);
        txtNumeroTotal = (TextView) findViewById(R.id.txt_nro_total);

        btnAlunos = (Button) findViewById(R.id.btn_alunos);
        btnAlunos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AlunoActivity.class);
                startActivityForResult(intent, MainActivity.REQUEST_ALUNO);
            }
        });

        btnServidores = (Button) findViewById(R.id.btn_servidores);
        btnServidores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ServidorActivity.class);
                startActivityForResult(intent, MainActivity.REQUEST_SERVIDOR);
            }
        });

        btnExternos = (Button) findViewById(R.id.btn_externos);
        btnExternos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ExternoActivity.class);
                startActivityForResult(intent, MainActivity.REQUEST_EXTERNO);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == MainActivity.REQUEST_ALUNO && resultCode == Activity.RESULT_OK && data != null) {
            String nome = data.getExtras().getString(MainActivity.ALUNO_NOME);
            String matricula = data.getExtras().getString(MainActivity.ALUNO_MATRICULA);

            if (nome == null || matricula == null || nome.isEmpty() || matricula.isEmpty()) {
                Toast.makeText(getApplicationContext(), "Favor preencher todos os campos.",Toast.LENGTH_LONG).show();
                return;
            }

            Integer totalAlunos = Integer.parseInt(txtNumeroAlunos.getText().toString()) + 1;
            Integer total = Integer.parseInt(txtNumeroTotal.getText().toString()) + 1;

            txtNumeroAlunos.setText(String.valueOf(totalAlunos));
            txtNumeroTotal.setText(String.valueOf(total));

            Toast.makeText(getApplicationContext(), "ALUNO Cadastrado",Toast.LENGTH_LONG).show();
            Toast.makeText(getApplicationContext(), "Nome: " + nome,Toast.LENGTH_LONG).show();
            Toast.makeText(getApplicationContext(), "Matricula: " + matricula,Toast.LENGTH_LONG).show();

        } else if (requestCode == MainActivity.REQUEST_SERVIDOR && resultCode == Activity.RESULT_OK && data != null) {
            String nome = data.getExtras().getString(MainActivity.SERVIDOR_NOME);
            String siape = data.getExtras().getString(MainActivity.SERVIDOR_SIAPE);

            if (nome == null || siape == null || nome.isEmpty() || siape.isEmpty()) {
                Toast.makeText(getApplicationContext(), "Favor preencher todos os campos.",Toast.LENGTH_LONG).show();
                return;
            }

            Integer totalServidores = Integer.parseInt(txtNumeroServidores.getText().toString()) + 1;
            Integer total = Integer.parseInt(txtNumeroTotal.getText().toString()) + 1;

            txtNumeroServidores.setText(String.valueOf(totalServidores));
            txtNumeroTotal.setText(String.valueOf(total));

            Toast.makeText(getApplicationContext(), "SERVIDOR Cadastrado",Toast.LENGTH_LONG).show();
            Toast.makeText(getApplicationContext(), "Nome: " + nome,Toast.LENGTH_LONG).show();
            Toast.makeText(getApplicationContext(), "Siape: " + siape,Toast.LENGTH_LONG).show();

        } else if (requestCode == MainActivity.REQUEST_EXTERNO && resultCode == Activity.RESULT_OK && data != null) {
            String nome = data.getExtras().getString(MainActivity.EXTERNO_NOME);
            String email = data.getExtras().getString(MainActivity.EXTERNO_EMAIL);

            if (nome == null || email == null || nome.isEmpty() || email.isEmpty()) {
                Toast.makeText(getApplicationContext(), "Favor preencher todos os campos.",Toast.LENGTH_LONG).show();
                return;
            }

            Integer totalExternos = Integer.parseInt(txtNumeroExternos.getText().toString()) + 1;
            Integer total = Integer.parseInt(txtNumeroTotal.getText().toString()) + 1;

            txtNumeroExternos.setText(String.valueOf(totalExternos));
            txtNumeroTotal.setText(String.valueOf(total));

            Toast.makeText(getApplicationContext(), "SERVIDOR Cadastrado",Toast.LENGTH_LONG).show();
            Toast.makeText(getApplicationContext(), "Nome: " + nome,Toast.LENGTH_LONG).show();
            Toast.makeText(getApplicationContext(), "E-mail: " + email,Toast.LENGTH_LONG).show();
        }
    }
}
