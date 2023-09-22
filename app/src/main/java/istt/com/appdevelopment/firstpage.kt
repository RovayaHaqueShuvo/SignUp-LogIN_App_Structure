package istt.com.appdevelopment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class firstpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_firstpage)


        var log:Button = findViewById(R.id.logFirst)
        var sign:Button = findViewById(R.id.signFirst)


        log.setOnClickListener {
            var nextlog = Intent(this, login::class.java)
            startActivity(nextlog)
            finish()
        }


        sign.setOnClickListener {
            var nextSign = Intent(this@firstpage, signup::class.java)
            startActivity(nextSign)
            finish()
        }
    }
}