package com.example.fernando.appprova;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class Login extends AppCompatActivity {

    private static int cont = 3;
    private EditText login;
    private EditText senha;
    private ArrayList <Pessoa> pessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = (EditText) findViewById(R.id.lg_edit_login);
        senha = (EditText) findViewById(R.id.lg_edit_senha);
        pessoa = new ArrayList<Pessoa>();

        inializaPessoas();
    }

    private void inializaPessoas() {
        pessoa.add(new Pessoa("fernando","1"));
        pessoa.add(new Pessoa("albert","2"));
        pessoa.add(new Pessoa("ze","3"));
        pessoa.add(new Pessoa("gustavo","4"));
        pessoa.add(new Pessoa("gabriel","5"));
        pessoa.add(new Pessoa("joao","6"));
        pessoa.add(new Pessoa("rafael","7"));
        pessoa.add(new Pessoa("pombo","8"));
        pessoa.add(new Pessoa("andrezza","9"));
        pessoa.add(new Pessoa("larissa","10"));
    }

    public void validaLogin(View view){
        boolean msg = false;
        if ((view.getId() == R.id.lg_button_entrar)&& (cont > 0) ){

            for (Pessoa p : pessoa){
                if (p.getNome().equals(login.getText().toString()) && p.getSenha().equals(senha.getText().toString())) {
                    msg =true;
                }
            }

            if (msg) {
                Intent intent = new Intent(this, CadastraProduto.class);
                startActivity(intent);
                this.finish();
            } else{
                Toast.makeText(this,"Login inválido! você tem mais "+cont+" tentativas.",Toast.LENGTH_SHORT).show();
            }

            cont--;
        }else{
            this.finish();
            cont = 0;
        }
    }
}
