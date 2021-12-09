package com.smh.bmi_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val heightEditText: EditText = findViewById(R.id.heightEditText) // 첫번째 선언 방법.
        val weightEditText = findViewById<EditText>(R.id.weightEditText) // 두번째 선언 방법.
        val resultButton = findViewById<Button>(R.id.resultButton)

        resultButton.setOnClickListener {
            Log.d("MainActivity","ResultButton이 클릭되었습니다.")

            val height: Int = heightEditText.text.toString().toInt()
            val weight: Int = weightEditText.text.toString().toInt()

            Log.d("MainActivity","height $height, weight$weight")
            //앱 죽음. 빈 값을 넣으면 Int로 변환되지 않음. 조건을 달아줘야겠음.
        }
    }
}