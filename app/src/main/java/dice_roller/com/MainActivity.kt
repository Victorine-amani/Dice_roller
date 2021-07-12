package dice_roller.com

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var rollButton:Button
    lateinit var dice:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rollButton=findViewById(R.id.btn_roll)
        rollButton.setOnClickListener {
            rollDice()
        }

    }

    private fun rollDice() {
      dice=findViewById(R.id.imgDice)
        val randomNumber=Random.nextInt(6)+1
       val currentImage= when(randomNumber){
            1->R.drawable.dice1
            2->R.drawable.dice2
            3->R.drawable.dice3
            4->R.drawable.dice4
            5->R.drawable.dice5
            else->R.drawable.dice6
        }
       dice.setImageResource(currentImage)
    }
}