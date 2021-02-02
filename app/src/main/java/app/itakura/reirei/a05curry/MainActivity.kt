package app.itakura.reirei.a05curry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatViewInflater
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val people = arrayOf("五条悟","虎杖悠仁","パンダ","七海建人")
    val food = arrayOf("カレー","ハンバーグ","ラーメン","ピザ","スパゲティ","寿司","麻婆豆腐")
    val verb = arrayOf("食べました！","食べませんでした")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun serveFood(view:View?){

        val randomName = Random()
        val nameIndex = randomName.nextInt(4)
        val name = people[nameIndex]
        nameTextView.text = name + "は"

        val randomFood = Random()
        val foodIndex = randomFood.nextInt(7)
        val food = food[foodIndex]
        foodTextView.text = food + "を"

        //foodTextView.text = food[Random().nextInt(4)]+"を"

        verbTextView.text = verb[Random().nextInt(2)]


//        if (Random().nextInt(100)<50){
//            verbTextView.text = "よそえました！"
//        }else{
//            verbTextView.text = "よそえませんでした"
//            verbTextView.textSize = 36.0f
//        }
    }
}