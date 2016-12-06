package com.example.user.lab4_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddUserActivity extends AppCompatActivity {
    EditText editTextName;
    EditText editTextEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);

        editTextName = (EditText)findViewById(R.id.editTextName);
        editTextEmail = (EditText)findViewById(R.id.editTextEmail);


    }

    public void saveRecord(View view){
        UserRecord userRecord = new UserRecord();
        userRecord.setName(editTextName.getText().toString());
        userRecord.setEmail(editTextEmail.getText().toString());
        UserDataSource userDataSource = new UserDataSource(this);
        userDataSource.insertUser(userRecord);

        this.finish();

    }
}
