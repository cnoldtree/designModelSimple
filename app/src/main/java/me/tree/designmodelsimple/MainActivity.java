package me.tree.designmodelsimple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import me.tree.designmodelsimple.Builder.BMWBuilder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void builderTest(){
        new BMWBuilder().buildBrand().buildColor("7 Li").buildModel("7 Li");
    }
}
