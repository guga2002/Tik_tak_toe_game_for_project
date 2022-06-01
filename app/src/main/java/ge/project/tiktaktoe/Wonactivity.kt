package ge.project.tiktaktoe

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_wonactivity.*

class Wonactivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.requestFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_wonactivity)

        val player = intent.getStringExtra("player")// vnaxulobt    ra shedegit damtavrda tamashi
        if(player == "Tie") textViewWon.text = "TIE"// tu nichiit dasrulda
        else textViewWon.text = "$player WON"// shesabamisad   romelma momxmarebelmac moigo

        val anim = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom)
        textViewWon.startAnimation(anim)

        Handler().postDelayed({
            startActivity(Intent(this@Wonactivity, MainActivity::class.java))
        }, 5000)
    }
}