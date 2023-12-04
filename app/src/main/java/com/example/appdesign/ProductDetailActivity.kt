package com.example.appdesign

import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.appdesign.fragments.FeatureFragment
import com.example.appdesign.fragments.OverviewFragment

class ProductDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        val overviewFragment = OverviewFragment()
        val featureFragment = FeatureFragment()

        val overViewBtn: LinearLayout = findViewById(R.id.pdOverViewBtn)
        val overViewSelected: View = findViewById(R.id.pdOverViewSelected)

        val featureBtn: LinearLayout = findViewById(R.id.pdFeaturesBtn)
        val featureSelected: View = findViewById(R.id.pdFeatureSelected)

        //OnClick Fragment Changes
        overViewBtn.setOnClickListener {

            supportFragmentManager.beginTransaction()
                .replace(R.id.pdFragmentContainerView, overviewFragment).commit()

            overViewSelected.visibility = View.VISIBLE
            featureSelected.visibility = View.GONE
        }

        featureBtn.setOnClickListener {

            supportFragmentManager.beginTransaction()
                .replace(R.id.pdFragmentContainerView, featureFragment).commit()

            featureSelected.visibility = View.VISIBLE
            overViewSelected.visibility = View.GONE
        }
    }
}