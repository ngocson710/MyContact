package com.example.nson.mycontact;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.nson.mycontact.adapter.ContactAddapter;
import com.example.nson.mycontact.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends  AppCompatActivity {
    List<Contact> arrContact;
    ContactAddapter adapter;
    private EditText edtName, edtPhone;
    private RadioButton rdMale, rdFelmale;
    private Button btnAdd;
    private ListView lvContact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setwidgets();
        arrContact =new ArrayList<Contact>();
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                boolean male = true;
                String name = edtName.getText().toString().trim();
                String phone = edtPhone.getText().toString().trim();
                if(rdMale.isChecked())
                    male= true;
                else
                    male= false;
                if(name.equals("")||phone.equals("")){
                    Toast.makeText(MainActivity.this, "vui lòng nhập tên và sdt", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "sender: "+male+" name: "+name +" phone: "+phone, Toast.LENGTH_SHORT).show();
                    Contact contact= new Contact( male, name, phone);

                    arrContact.add(contact);
                    adapter= new ContactAddapter(this, R.layout.item_layout, arrContact);
                    lvContact.setAdapter(adapter);
                }
            }
        });
    }
    public void setwidgets(){
        lvContact= (ListView) findViewById(R.id.lv_contact);
        edtName= (EditText) findViewById(R.id.edt_name);
        edtPhone= (EditText) findViewById(R.id.edt_phone);
        rdMale= (RadioButton) findViewById(R.id.rd_male);
        rdFelmale= (RadioButton) findViewById(R.id.rd_female);
        btnAdd = (Button) findViewById(R.id.btnAddContact);
    }
}
