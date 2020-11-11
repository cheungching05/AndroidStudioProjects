package com.ching.activitytest;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FirstActivity extends AppCompatActivity {

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.add_item:
                Toast.makeText(this,"你点击了增加按钮",Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this,"你点击了删除按钮",Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case 1:
                if (resultCode == RESULT_OK) {
                    String returnedData = data.getStringExtra("data_return");
                    Log.d("FirstActivity",returnedData);
                }
                break;
            default:
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        Button button_1 = (Button) findViewById(R.id.button_1);
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(FirstActivity.this,"you clicked button_1",Toast.LENGTH_SHORT).show();
                //finish();
                Intent intent=new Intent(FirstActivity.this,SecondActivity.class);
                //Intent intent=new Intent("com.ching.activitytest.ACTION_START");
                //intent.addCategory("com.ching.activitytest.MY_CATEGORY");
                //Intent intent = new Intent(Intent.ACTION_VIEW);  //浏览器
                //intent.setData(Uri.parse("http://www.baidu.com"));
                //Intent intent = new Intent(Intent.ACTION_DIAL);  //拨打电话
                //intent.setData(Uri.parse("tel:10086"));
                //String data = "hello secondactivity";
                //intent.putExtra("extra_data",data);
                //startActivity(intent);

                startActivityForResult(intent,1);

            }
        });
    }
}