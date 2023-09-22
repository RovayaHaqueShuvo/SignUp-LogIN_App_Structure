package istt.com.appdevelopment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        var logpre:Button = findViewById(R.id.logthr)

        logpre.setOnClickListener {
            var loinpre = Intent(this@signup, login::class.java)
            startActivity(loinpre)
            finish()
        }
    }
}