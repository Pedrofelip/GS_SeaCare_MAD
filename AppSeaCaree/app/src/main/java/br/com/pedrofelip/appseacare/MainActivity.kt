package br.com.pedrofelip.appseacare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnReportedActivity = findViewById<Button>(R.id.button)

        btnReportedActivity.setOnClickListener{
            IrParaReported()
        }
    }

    private fun IrParaReported(){
        val telareport = Intent(this, ReportedActivity::class.java)
        startActivity(telareport)
    }
}