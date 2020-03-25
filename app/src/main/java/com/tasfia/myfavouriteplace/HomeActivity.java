package com.tasfia.myfavouriteplace;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    //declare button object
    Button btnPlace1,btnPlace2,btnPlace3,btnPlace4,btnPlace5,btnPlace6,btnPlace7,btnPlace8,btnPlace9,btnPlace10,btnPlace11,btnPlace12,btnPlace13;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnPlace1=findViewById(R.id.btn_place1);
        btnPlace2=findViewById(R.id.btn_place2);
        btnPlace3=findViewById(R.id.btn_place3);
        btnPlace4=findViewById(R.id.btn_place4);
        btnPlace5=findViewById(R.id.btn_place5);
        btnPlace6=findViewById(R.id.btn_place6);
        btnPlace7=findViewById(R.id.btn_place7);
        btnPlace8=findViewById(R.id.btn_place8);
        btnPlace9=findViewById(R.id.btn_place9);
        btnPlace10=findViewById(R.id.btn_place10);
        btnPlace11=findViewById(R.id.btn_place11);
        btnPlace12=findViewById(R.id.btn_place12);
        btnPlace13=findViewById(R.id.btn_place13);


        btnPlace1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("id" ,"one");
                startActivity(intent);

                Toast.makeText(HomeActivity.this, "Sundarbans Mangrove Forest", Toast.LENGTH_SHORT).show();

            }
        });


        btnPlace2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("id" ,"two");
                startActivity(intent);

                Toast.makeText(HomeActivity.this, "Chittagong Hill-Tracts", Toast.LENGTH_SHORT).show();

            }
        });


        btnPlace3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("id" ,"three");
                startActivity(intent);

                Toast.makeText(HomeActivity.this, "Srimangal", Toast.LENGTH_SHORT).show();

            }
        });


        btnPlace4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("id" ,"four");
                startActivity(intent);

                Toast.makeText(HomeActivity.this, "Rangamati", Toast.LENGTH_SHORT).show();

            }
        });


        btnPlace5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("id" ,"five");
                startActivity(intent);

                Toast.makeText(HomeActivity.this, "Paharpur", Toast.LENGTH_SHORT).show();

            }
        });


        btnPlace6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("id" ,"six");
                startActivity(intent);

                Toast.makeText(HomeActivity.this, "St. Martin's Island", Toast.LENGTH_SHORT).show();

            }
        });


        btnPlace7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("id" ,"seven");
                startActivity(intent);

                Toast.makeText(HomeActivity.this, "Sajek", Toast.LENGTH_SHORT).show();

            }
        });


        btnPlace8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("id" ,"eight");
                startActivity(intent);

                Toast.makeText(HomeActivity.this, "Jaflong", Toast.LENGTH_SHORT).show();

            }
        });


        btnPlace9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("id" ,"nine");
                startActivity(intent);

                Toast.makeText(HomeActivity.this, "Barisal", Toast.LENGTH_SHORT).show();

            }
        });


        btnPlace10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("id" ,"ten");
                startActivity(intent);

                Toast.makeText(HomeActivity.this, "Puthia", Toast.LENGTH_SHORT).show();

            }
        });


        btnPlace11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("id" ,"eleven");
                startActivity(intent);

                Toast.makeText(HomeActivity.this, "Mosque City Bagerhat", Toast.LENGTH_SHORT).show();

            }
        });


        btnPlace12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("id" ,"twelve");
                startActivity(intent);

                Toast.makeText(HomeActivity.this, "Cox's Bazar", Toast.LENGTH_SHORT).show();

            }
        });


        btnPlace13.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("id" ,"thirteen");
                startActivity(intent);

                Toast.makeText(HomeActivity.this, "Sonargaon", Toast.LENGTH_SHORT).show();

            }
        });



    }

}




