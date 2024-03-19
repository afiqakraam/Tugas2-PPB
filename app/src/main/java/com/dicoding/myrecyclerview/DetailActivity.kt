package com.dicoding.myrecyclerview

import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DESC = "extra_desc"
        const val EXTRA_PHOTO = "extra_photo"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail)

        val data = intent.getParcelableExtra<Hero>("DATA")
        Log.d("Detail Data", data?.name.toString())

        val imgPhoto: ImageView = findViewById(R.id.img_item_photo)
        val tvItemName: TextView = findViewById(R.id.tv_item_name)
        val tvItemDesc: TextView = findViewById(R.id.tv_item_description)

        tvItemName.text = "${data?.name}"
        tvItemDesc.text = "${data?.description}"


        val intVariableName = data?.photo?.toInt()
        if (intVariableName != null) {
            imgPhoto.setImageResource(intVariableName)
        }



//        val stringVariableName = intent.getStringExtra(EXTRA_PHOTO)
//        val intVariableName = stringVariableName?.toInt()
//
////        val photo = intent.getIntExtra(EXTRA_PHOTO)
//        if (intVariableName != null) {
//            imgPhoto.setImageResource(intVariableName)
//        }

//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
    }
}