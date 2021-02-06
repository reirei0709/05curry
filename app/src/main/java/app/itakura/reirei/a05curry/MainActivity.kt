package app.itakura.reirei.a05curry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val text = arrayOf("大吉","中吉","小吉","凶")
    val item = arrayOf("カレー","パソコン","水筒","お気に入りのペン","ぬいぐるみ","メガネ","香水")
    val color = arrayOf("赤","ピンク","オレンジ","黄色","緑","青","白","黒")



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun serveFood(view:View?){

        val random = Random()
        val index = random.nextInt(4)
        val text = text[index]
        textView.text = text

        val randomItem = Random()
        val itemIndex = randomItem.nextInt(7)
        val item = item[itemIndex]
        itemTextView.text = item

        //foodTextView.text = food[Random().nextInt(4)]+"を"

        colorTextView.text = color[Random().nextInt(8)]


//        if (Random().nextInt(100)<50){
//            verbTextView.text = "よそえました！"
//        }else{
//            verbTextView.text = "よそえませんでした"
//            verbTextView.textSize = 36.0f
//        }
    }
}1