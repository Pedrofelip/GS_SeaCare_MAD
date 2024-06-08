package br.com.pedrofelip.appseacare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnReportedActivity = findViewById<Button>(R.id.button)
        val btnGrupo = findViewById<Button>(R.id.btn_grupo)

        btnReportedActivity.setOnClickListener{
            IrParaReported()
        }

        btnGrupo.setOnClickListener{
            val artDialogBuilder = android.app.AlertDialog.Builder(this@MainActivity)

            artDialogBuilder.setTitle("Integrantes do Grupo:")
            artDialogBuilder.setMessage(
                        "Pedro Felipe RM: 98093\n" +
                        "Igor Miguel Silva RM 99495\n" +
                        "João Pedro Costa Feitosa RM 98442\n" +
                        "Gustavo René RM 551288\n" +
                        "Kaue Matheus Santana RM 551732")
            artDialogBuilder.setCancelable(false)
            artDialogBuilder.setPositiveButton("OK"){_,_ ->
                Toast.makeText(this@MainActivity, "você viu o nome dos desenvolvedores", Toast.LENGTH_LONG).show()
            }
            val alertDialogBox = artDialogBuilder.create()
            alertDialogBox.show()
        }
    }

    private fun IrParaReported(){
        val telareport = Intent(this, ReportedActivity::class.java)
        startActivity(telareport)
    }
}