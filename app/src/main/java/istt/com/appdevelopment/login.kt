package istt.com.appdevelopment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var signsec:Button = findViewById(R.id.signsec)

        signsec.setOnClickListener {
            var signpre = Intent(this@login, signup::class.java)
            startActivity(signpre)
            finish()
        }


    }
}