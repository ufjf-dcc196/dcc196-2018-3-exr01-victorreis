package br.ufjf.dcc196.dcc196_2018_3_exr01_victorreis;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnAlunos;
    private Button btnServidores;
    private Button btnExternos;
    private TextView txtNumeroAlunos;
    private TextView txtNumeroServidores;
    private TextView txtNumeroExternos;
    public static final String ALUNO_NOME = "nome";
    public static final String ALUNO_MATRICULA = "matricula";
    public static final String SERVIDOR_NOME = "nome";
    public static final String SERVIDOR_SIAPE = "siape";
    public static final String EXTERNO_NOME = "nome";
    public static final String EXTERNO_EMAIL = "email";
    private static final int REQUEST_ALUNO = 1;
    private static final int REQUEST_SERVIDOR = 2;
    private static final int REQUEST_EXTERNO = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNumeroAlunos = (TextView) findViewById(R.id.txt_nro_alunos);
        txtNumeroServidores = (TextView) findViewById(R.id.txt_nro_servidores);
        txtNumeroExternos = (TextView) findViewById(R.id.txt_nro_externos);

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

        }
    }
}
