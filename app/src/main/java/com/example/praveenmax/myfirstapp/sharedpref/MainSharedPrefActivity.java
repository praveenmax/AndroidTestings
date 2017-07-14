package com.example.praveenmax.myfirstapp.sharedpref;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.praveenmax.myfirstapp.R;

/**
 * Created by PraveenMax on 15-07-2017.
 */

public class MainSharedPrefActivity extends AppCompatActivity {

    private final static String SHAREDPREF_TESTDATA = "No data";
    private TextView tv_statusSharedPrefWrite, tv_statusSharedPrefRead, tv_sharedPrefReadOutput, et_sharedPrefInputData;
    SharedPreferences sharedPref;

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);

        setContentView(R.layout.main_sharedpref);

        tv_statusSharedPrefWrite = (TextView)findViewById(R.id.tv_statusSharedPrefWrite);
        tv_statusSharedPrefWrite.setText("STATUS  :  ");

        tv_statusSharedPrefRead= (TextView)findViewById(R.id.tv_statusSharedPrefRead);
        tv_statusSharedPrefRead.setText("STATUS  :  ");

        tv_sharedPrefReadOutput= (TextView)findViewById(R.id.tv_sharedPrefReadOutput);

        et_sharedPrefInputData = (EditText)findViewById(R.id.et_sharedPrefInputData);

        sharedPref = this.getPreferences(Context.MODE_PRIVATE);
    }

    public void saveData_sharedPref(View view)
    {
        //get the data from edit-text
        String inputData = et_sharedPrefInputData.getText().toString();

        //Open Preferences
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(SHAREDPREF_TESTDATA, inputData);

        if(editor.commit())
        {
            tv_statusSharedPrefWrite.setText("STATUS  :  Success");
            Log.d("praveenmax", "Data save success !");
        }
        else{
            tv_statusSharedPrefWrite.setText("STATUS  :  Failure!");
            Log.e("praveenmax", "Unable to save Preferences data !");
        }

    }

    public void readData_sharedPref(View view)
    {
        String dataFound = sharedPref.getString(SHAREDPREF_TESTDATA,"NULL");

        if(dataFound.equals("NULL"))
        {
            tv_statusSharedPrefRead.setText("STATUS  :  Failure!");
            Log.e("praveenmax", "Data read failure ! "+ dataFound);
        }
        else{
            tv_statusSharedPrefRead.setText("STATUS  :  Success");
            tv_sharedPrefReadOutput.setText(dataFound);
            Log.d("praveenmax", "Data Read success !"+ dataFound);
        }


    }
}
