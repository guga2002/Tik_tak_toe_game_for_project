package ge.project.tiktaktoe

import android.content.Intent
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.requestFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)
        window.requestFeature(Window.FEATURE_CONTENT_TRANSITIONS)
        setContentView(R.layout.activity_main)

        // gamovitanot animaciebi rogorc cvladi
        val animClockwise = AnimationUtils.loadAnimation(applicationContext, R.anim.clockwise)
        val animMove = AnimationUtils.loadAnimation(applicationContext, R.anim.move)
        val animFade = AnimationUtils.loadAnimation(applicationContext, R.anim.fade)
        val animSlide = AnimationUtils.loadAnimation(applicationContext, R.anim.slide)
        val animZoom = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom)
        val animZoom2 = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom2)
        val animBlink = AnimationUtils.loadAnimation(applicationContext, R.anim.blink)
        imgTicTacToe.startAnimation(animBlink)
        zephGames.startAnimation(animClockwise)

        btnSingle.setOnClickListener{// aq davadot animacia da   gadavidet   single  playze
            btnSingle.startAnimation(animZoom2)
            startActivity(Intent(this@MainActivity, secondActivity::class.java))
        }

        btnMulti.setOnClickListener{//aqac davadot animacia  silamazistvis da  gadavidet   shesabamis gverdze
            btnMulti.startAnimation(animZoom2)
            startActivity(Intent(this@MainActivity, thirdactivity::class.java))
        }

        imgTicTacToe.setOnClickListener{// davadet animacia mtavar logos
            imgTicTacToe.startAnimation(animBlink)
        }

        zephGames.setOnClickListener{  /// davad3et animacia qveda logos
            zephGames.startAnimation(animClockwise)
        }

        //daubrundi imageviews
        imageViewBack.setOnClickListener {
            finish()
            moveTaskToBack(true)
        }

        // shewyvetis dros
        imageViewQuit.setOnClickListener {
            finish()
            moveTaskToBack(true)
        }

    }

    // roca daawveba ukan dabrunebis gilaks
    override fun onBackPressed() {
        super.onBackPressed()
        moveTaskToBack(true)
    }

}