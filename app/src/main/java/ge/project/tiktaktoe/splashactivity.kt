package ge.project.tiktaktoe

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_splashactivity.*

class splashactivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.requestFeature(Window.FEATURE_NO_TITLE)

        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)

        setContentView(R.layout.activity_splashactivity)

        val anim = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom)
        imageViewLogo.startAnimation(anim)// gamoviyenet animacia

        Handler().postDelayed({//
            startActivity(Intent(this@splashactivity, MainActivity::class.java))
        }, 6000)
    }
}

