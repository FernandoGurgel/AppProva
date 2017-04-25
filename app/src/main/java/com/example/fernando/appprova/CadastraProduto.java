package com.example.fernando.appprova;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class CadastraProduto extends AppCompatActivity {

    private Produto produto;
    private EditText nome;
    private Spinner embalagem;
    private EditText precoCusto;
    private EditText precoVenda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastra_produto);

        produto = new Produto();
        nome = (EditText) findViewById(R.id.pd_edit_nome);
        embalagem = (Spinner) findViewById(R.id.pd_spinner_embalagem);
        precoCusto = (EditText) findViewById(R.id.pd_edit_preco_custo);
        precoVenda = (EditText) findViewById(R.id.pd_edit_preco_venda);

        ArrayAdapter<String> listaSpinner = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,produto.getEmbalagemTipo());

        embalagem.setAdapter(listaSpinner);
    }


    public void limpaFormulario(View view){
        nome.setText("");
        precoVenda.setText("");
        precoCusto.setText("");
        nome.requestFocus();
    }
}
