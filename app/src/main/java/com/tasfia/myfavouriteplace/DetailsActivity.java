package com.tasfia.myfavouriteplace;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    ImageView imgPlace;
    TextView txtName, txtDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);


        imgPlace = findViewById(R.id.img_place);
        txtName = findViewById(R.id.txt_name);
        txtDescription = findViewById(R.id.txt_description);


        String getId = getIntent().getExtras().getString("id");
        if (getId.equals("one")) {
            imgPlace.setImageResource(R.drawable.sundarban);
            txtName.setText("Sundarbans Mangrove Forest");
            txtDescription.setText(R.string.place1);


        }

        else if (getId.equals("two")) {
            imgPlace.setImageResource(R.drawable.ctghill);
            txtName.setText("Chittagong Hill-Tracts");
            txtDescription.setText(R.string.place2);


        }
        else if (getId.equals("three")) {
            imgPlace.setImageResource(R.drawable.srimangal);
            txtName.setText("Srimangal");
            txtDescription.setText(R.string.place3);


        }
        else if (getId.equals("four")) {
            imgPlace.setImageResource(R.drawable.rangamati);
            txtName.setText("Rangamati");
            txtDescription.setText(R.string.place4);


        }
        else if (getId.equals("five")) {
            imgPlace.setImageResource(R.drawable.paharpur);
            txtName.setText("Paharpur");
            txtDescription.setText(R.string.place5);


        }

        else if (getId.equals("six")) {
            imgPlace.setImageResource(R.drawable.saintmartin);
            txtName.setText("St. Martin's Island");
            txtDescription.setText(R.string.place6);


        }
        else if (getId.equals("seven")) {
            imgPlace.setImageResource(R.drawable.sajek);
            txtName.setText("Sajek");
            txtDescription.setText(R.string.place7);


        }
        else if (getId.equals("eight")) {
            imgPlace.setImageResource(R.drawable.jaflong);
            txtName.setText("Jaflong");
            txtDescription.setText(R.string.place8);


        }
        else if (getId.equals("nine")) {
            imgPlace.setImageResource(R.drawable.barishal);
            txtName.setText("Barisal");
            txtDescription.setText(R.string.place9);


        }

        else if (getId.equals("ten")) {
            imgPlace.setImageResource(R.drawable.puthia);
            txtName.setText("Puthia");
            txtDescription.setText(R.string.place10);


        }
        else if (getId.equals("eleven")) {
            imgPlace.setImageResource(R.drawable.mosque);
            txtName.setText("Mosque City Bagerhat");
            txtDescription.setText(R.string.place11);


        }
        else if (getId.equals("twelve")) {
            imgPlace.setImageResource(R.drawable.coxbazar);
            txtName.setText("Cox's Bazar");
            txtDescription.setText(R.string.place12);


        }
        else if (getId.equals("thirteen")) {
            imgPlace.setImageResource(R.drawable.sonargaon);
            txtName.setText("Sonargaon");
            txtDescription.setText(R.string.place13);


        }
    }
}



