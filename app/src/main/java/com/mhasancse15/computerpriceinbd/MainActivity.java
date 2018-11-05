package com.mhasancse15.computerpriceinbd;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;


import com.mhasancse15.computerpriceinbd.adapter.RecyclerViewAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mImageDescription = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started.");

        initImageBitmaps();
    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");


        mImageUrls.add("https://ryanscomputers.com/media/catalog/product/cache/1/image/9df78eab33525d08d6e5fb8d27136e95/i/-/i-life-zed-pc-aio-2.jpg");
        mNames.add("I-life ZEDPC");
        mImageDescription.add("Quick Overview\n" +
                "Model - I-life ZEDPC\n" +
                "Processor - Intel Celeron Duel Core N3350\n" +
                "Processor Clock Speed - 1.1-2.40GHz\n" +
                "CPU Cache - 2MB\n" +
                "RAM - 3GB\n" +
                "HDD - 500GB HDD\n" +
                "SSD - 32GB SSD for OS\n" +
                "Graphics Memory - Shared\n" +
                "Audio Port - 3.5mm standard headphone jack\n" +
                "Specialty - Touch Module: OGS, 10 Point Capacitive Multitouch\n" +
                "Form Factor - All-in-One");

        mImageUrls.add("https://ryanscomputers.com/media/catalog/product/cache/1/image/9df78eab33525d08d6e5fb8d27136e95/i/-/i-life-zed-air-grey-2.jpg");
        mNames.add("I-life ZEDAir");
        mImageDescription.add("Product Id: 33.722.08\n" +
                "Quick Overview\n" +
                "\n" +
                "Model - I-life ZEDAir\n" +
                "\n" +
                "Processor Clock Speed - 1.33-1.83GHz\n" +
                "\n" +
                "HDD - 32GB eMMC\n" +
                "\n" +
                "2GB DDR3 Ram\n" +
                "\n" +
                "Display Size - 14\"");

        mImageUrls.add("https://ryanscomputers.com/media/catalog/product/cache/1/image/9df78eab33525d08d6e5fb8d27136e95/x/5/x540ya.jpg");
        mNames.add("AMD E1-6010");
        mImageDescription.add("Regular Price Tk 23,310\n" +
                "Special Price Tk 22,800\n" +
                "Product Id: 33.006.748\n" +
                "Quick Overview\n" +
                "Processor - AMD E1-6010\n" +
                "Processor Clock Speed - 1.35GHz\n" +
                "Display Size - 15.6\"\n" +
                "RAM - 4GB\n" +
                "RAM Type - DDR3L 1333MHz\n" +
                "HDD - 500GB HDD");

        mImageUrls.add("https://ryanscomputers.com/media/catalog/product/cache/1/image/9df78eab33525d08d6e5fb8d27136e95/3/g/3gm14pa.jpg");
        mNames.add("HP 14-BW077AU AMD DUAL CORE ");
        mImageDescription.add("Regular Price Tk 24,050\n" +
                "Special Price Tk 23,800\n" +
                "Product Id: 33.020.911\n" +
                "Quick Overview\n" +
                "Processor - AMD Dual Core E2-9000E\n" +
                "Processor Clock Speed - 1.5-2.0GHz\n" +
                "Display Size - 14.1\"\n" +
                "RAM - 4GB\n" +
                "RAM Type - DDR4 1866MHz\n" +
                "HDD - 500GB HDD");

        mImageUrls.add("https://ryanscomputers.com/media/catalog/product/cache/1/image/9df78eab33525d08d6e5fb8d27136e95/1/5/15-db0000au.jpg");
        mNames.add("HP 15-DB0000AU AMD DUAL CORE");
        mImageDescription.add("Regular Price Tk 24,050\n" +
                "Special Price Tk 23,800\n" +
                "Product Id: 33.020.925\n" +
                "Quick Overview\n" +
                "Processor - AMD DUAL CORE E2-9000e\n" +
                "Processor Clock Speed - 1.5-2.0GHz\n" +
                "Display Size - 15.6\"\n" +
                "RAM - 4GB\n" +
                "RAM Type - DDR4 2400MHz\n" +
                "Storage - 500GB HDD\n" +
                "Operating System - Windows 10 Home");

        mImageUrls.add("https://ryanscomputers.com/media/catalog/product/cache/1/image/9df78eab33525d08d6e5fb8d27136e95/x/4/x407ma-sg-2.jpg");
        mNames.add("Asus X407MA Intel CDC N4000 ");
        mImageDescription.add("Regular Price Tk 24,570\n" +
                "Special Price Tk 24,000\n" +
                "Product Id: 33.006.777\n" +
                "Quick Overview\n" +
                "Processor - Intel CDC N4000\n" +
                "Processor Clock Speed - 1.1-2.6GHz\n" +
                "Display Size - 14\"\n" +
                "RAM - 4GB\n" +
                "RAM Type - DDR4 2400MHz");

        mImageUrls.add("https://ryanscomputers.com/media/catalog/product/cache/1/image/9df78eab33525d08d6e5fb8d27136e95/i/p/ip110-4_1.jpg");
        mNames.add("Lenovo IP110 Intel CDC N3060");
        mImageDescription.add("Regular Price Tk 25,620\n" +
                "Special Price Tk 24,800\n" +
                "Product Id: 33.200.425\n" +
                "Quick Overview\n" +
                "Processor - Intel CDC N3060\n" +
                "Processor Clock Speed - 1.60-2.48GHz\n" +
                "Display Size - 14\"\n" +
                "RAM - 4GB\n" +
                "RAM Type - DDR3\n" +
                "Storage - 1TB HDD");

        mImageUrls.add("https://ryanscomputers.com/media/catalog/product/cache/1/image/9df78eab33525d08d6e5fb8d27136e95/p/c/pc-55.jpg");
        mNames.add(" Dell PC-55");
        mImageDescription.add("Quick Overview\n" +
                "Model - PC-55\n" +
                "Processor - Intel Celeron processor\n" +
                "RAM - Patriot Signature Line 2GB Desktop RAM #PSD34G160081\n" +
                "HDD - Toshiba 1TB #HDWD110UZSVA\n" +
                "Monitor Brand & Size - HP V194 18.5 Inch");

        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls,mImageDescription);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}