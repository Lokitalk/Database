package com.example.creatingdatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyDBHelper dbHelper = new MyDBHelper(this);

        /*dbHelper.addContact("Raman", "32434233387");
        dbHelper.addContact("Raman", "32434233387");
        dbHelper.addContact("Raman", "32434233387");
        dbHelper.addContact("Raman", "32434233387");
        */

        ArrayList<ContactModel> arrContacts = dbHelper.fetchContact();
        for (int i =0; i<arrContacts.size(); i++)
            Log.d("CONTACT_INFO", "NAME" + arrContacts.get(i).name + ", Phone NO: " + arrContacts.get(i).phone_no);
    }
}