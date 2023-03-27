package com.kaapo.opiskelijalista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.RadioGroup;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private EditText editTextEtunimi;
    private EditText editTextSukunimi;
    private EditText editTextSahkoposti;
    private RadioGroup opinnotRadioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextEtunimi = findViewById(R.id.editTextEtunimi);
        editTextSukunimi = findViewById(R.id.editTextSukunimi);
        editTextSahkoposti = findViewById(R.id.editTextSahkoposti);
        opinnotRadioGroup = findViewById(R.id.radioGroup);

    }

    public void addUser(View view) {
    int valintaid = opinnotRadioGroup.getCheckedRadioButtonId();
    RadioButton valinta = findViewById(valintaid);

    String nimi = editTextEtunimi.getText().toString();
    String sukunimi = editTextSukunimi.getText().toString();
    String sahkoposti = editTextSahkoposti.getText().toString();
    String opinnot = valinta.getText().toString();


    User newUser = new User(nimi, sukunimi, sahkoposti, opinnot);

    UserStorage s = UserStorage.getInstance();

    s.addUser(newUser);

    }

    public void switchToUserList(View view) {
        Intent intent = new Intent(this, ListUserActivity.class);
        startActivity(intent);
    }
}
