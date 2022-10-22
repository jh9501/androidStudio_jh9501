package com.example.project

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import android.content.Intent


class MainActivity : AppCompatActivity() {

    private lateinit var sanhakBtn: Button
    private lateinit var gonghakBtn: Button
    private lateinit var changeuiBtn: Button
    private lateinit var jungboBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sanhakBtn = findViewById(R.id.button_sanhak)
        var sanhakFloor: Array<String> = arrayOf("1층", "2층", "3층", "4층", "5층", "6층", "7층", "8층")
        sanhakBtn.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("층수를 선택하세요")
                .setItems(sanhakFloor,
                    DialogInterface.OnClickListener { dialog, which ->
                        // 여기서 인자 'which'는 배열의 position을 나타냅니다.
                        // resultText.text = colorArray[which]
                    })
            // 다이얼로그를 띄워주기
            builder.show()
        }

        gonghakBtn = findViewById(R.id.button_gonghak)
        var gonghakFloor: Array<String> = arrayOf("1층", "2층", "3층", "4층", "5층", "6층", "7층")
        gonghakBtn.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("층수를 선택하세요")
                .setItems(gonghakFloor,
                    DialogInterface.OnClickListener { dialog, which ->
                        // 여기서 인자 'which'는 배열의 position을 나타냅니다.
                        // resultText.text = colorArray[which]
                        // 선택한 층값에 따른 화면전환
                    })
            // 다이얼로그를 띄워주기
            builder.show()
        }

        changeuiBtn = findViewById(R.id.button_changeui)
        var changeuiFloor: Array<String> = arrayOf("1층", "2층", "3층", "4층", "5층", "6층", "7층")
        changeuiBtn.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("층수를 선택하세요")
                .setItems(changeuiFloor,
                    DialogInterface.OnClickListener { dialog, which ->
                        // 여기서 인자 'which'는 배열의 position을 나타냅니다.
                        // resultText.text = colorArray[which]
                    })
            // 다이얼로그를 띄워주기
            builder.show()
        }

        jungboBtn = findViewById(R.id.button_jungbo)
        var jungboFloor: Array<String> = arrayOf("1층", "2층", "3층", "4층", "5층", "6층", "7층", "8층", "9층")
        jungboBtn.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("층수를 선택하세요")
                .setItems(jungboFloor,
                    DialogInterface.OnClickListener { dialog, which ->
                        // 여기서 인자 'which'는 배열의 position을 나타냅니다.
                        // resultText.text = colorArray[which]
                    })
            // 다이얼로그를 띄워주기
            builder.show()
        }
    }
}