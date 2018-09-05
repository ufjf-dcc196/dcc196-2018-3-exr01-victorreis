package br.ufjf.dcc196.dcc196_2018_3_exr01_victorreis;

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
//    public static final String PESSOA_NOME = "nome";
    private static final int REQUEST_EXEMPLO = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNumeroAlunos = (TextView) findViewById(R.id.txt_numero_alunos);
        txtNumeroServidores = (TextView) findViewById(R.id.txt_numero_servidores);
        txtNumeroExternos = (TextView) findViewById(R.id.txt_numero_externos);

        btnAlunos = (Button) findViewById(R.id.btn_alunos);
        btnAlunos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AlunoActivity.class);
//                intent.putExtra("nome", edtNome.getText().toString());
                startActivityForResult(intent, MainActivity.REQUEST_EXEMPLO);
            }
        });
        btnServidores = (Button) findViewById(R.id.btn_servidores);
        btnServidores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ServidorActivity.class);
//                intent.putExtra("nome", edtNome.getText().toString());
                startActivityForResult(intent, MainActivity.REQUEST_EXEMPLO);
            }
        });
        btnExternos = (Button) findViewById(R.id.btn_externos);
        btnExternos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ExternoActivity.class);
//                intent.putExtra("nome", edtNome.getText().toString());
                startActivityForResult(intent, MainActivity.REQUEST_EXEMPLO);
            }
        });
    }
}
