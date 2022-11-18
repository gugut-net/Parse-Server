package com.example.myapp;

import android.net.ParseException;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.parse.GetCallback;
import com.parse.Parse;
import com.parse.ParseAnalytics;
import com.parse.ParseObject;
import com.parse.ParseQuery;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId(getString(R.string.back4app_app_id))
                // if defined
                .clientKey(getString(R.string.back4app_client_key))
                .server(getString(R.string.back4app_server_url))
                .build()
        );
//
//        //Saving your First data object on Back4App
//        ParseObject person = new ParseObject("Person");
//        person.put("name", "Faisel Doe");
//        person.put("age", 27);
//        person.saveInBackground();
//
////Reading your First Data Object from Back4App
//        ParseQuery<ParseObject> query = ParseQuery.getQuery("Person");
//        query.getInBackground("mhPFDlCahj", new GetCallback<ParseObject>() {
//            @Override
//            public void done(ParseObject object, com.parse.ParseException e) {
//
//            }
//
//            public void done(ParseObject object, ParseException e) {
//                if (e == null) {
//                    // object will be your person
//                } else {
//                    // something went wrong
//                }
//            }
//        });
//    }
//        TextView textView = findViewById(R.id.textView);
//        ParseObject firstObject = new  ParseObject("FirstClass");
//        firstObject.put("message","Hey ! First message from android. Parse is now connected");
//        firstObject.saveInBackground(e -> {
//            if (e != null){
//                Log.e("MainActivity", e.getLocalizedMessage());
//            }else{
//                Log.d("MainActivity","Object saved.");
//                textView.setText(String.format("Object saved. %s", firstObject.getObjectId()));
//            }
//        });

        ParseAnalytics.trackAppOpenedInBackground(getIntent());

    }
}