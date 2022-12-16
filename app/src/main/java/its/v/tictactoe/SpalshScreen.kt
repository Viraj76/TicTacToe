package its.v.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.logging.Handler

class SpalshScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spalsh_screen)
        val intent = Intent(this, MainActivity::class.java )

        android.os.Handler().postDelayed({
            startActivity(intent)
        }, 3000) //

    }
}