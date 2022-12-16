package its.v.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var flag=0
    var count=0
    var lastBtn=false
    var btnCheck=true
    var btn1:Button?=null
    var btn2:Button?=null
    var btn3:Button?=null
    var btn4:Button?=null
    var btn5:Button?=null
    var btn6:Button?=null
    var btn7:Button?=null
    var btn8:Button?=null
    var btn9:Button?=null
    var b1:String?=null
    var b2:String?=null
    var b3:String?=null
    var b4:String?=null
    var b5:String?=null
    var b6:String?=null
    var b7:String?=null
    var b8:String?=null
    var b9:String?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn1= findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btn4 = findViewById(R.id.btn4)
        btn5 = findViewById(R.id.btn5)
        btn6 = findViewById(R.id.btn6)
        btn7 = findViewById(R.id.btn7)
        btn8 = findViewById(R.id.btn8)
        btn9 = findViewById(R.id.btn9)
    }
     fun check(view: View){
         val btnCurrent:Button= view as Button
         count++
         if(btnCheck) {
             if (flag == 0) {
                 if (btnCurrent.text.isEmpty()) {
                     btnCurrent.text = "X"
//                 btnCurrent.textSize(TypedValue.COMPLEX_UNIT_SP, 40F)
                     btnCurrent.setBackgroundColor(resources.getColor(R.color.red))
                     flag = 1
                     lastBtn = true
                 }
             } else {
                 if (btnCurrent.text.isEmpty()) {
                     btnCurrent.text = "O"
                     btnCurrent.setBackgroundColor(resources.getColor(R.color.red))
                     flag = 0
                     lastBtn = false
                 }

             }
         }
         if(count>4){
             b1=btn1?.text.toString()
             b2=btn2?.text.toString()
             b3=btn3?.text.toString()
             b4=btn4?.text.toString()
             b5=btn5?.text.toString()
             b6=btn6?.text.toString()
             b7=btn7?.text.toString()
             b8=btn8?.text.toString()
             b9=btn9?.text.toString()

             if(b1==(b2) && b2==(b3) && b1!=""){
                 btn1?.setBackgroundColor(resources.getColor(R.color.green))
                 btn2?.setBackgroundColor(resources.getColor(R.color.green))
                 btn3?.setBackgroundColor(resources.getColor(R.color.green))
                 Toast.makeText(this,"Winner is $b2",Toast.LENGTH_SHORT).show()

             }
             else if(b4==(b5) && b5==(b6) && b6!=("")){
                 btn4?.setBackgroundColor(resources.getColor(R.color.green))
                 btn5?.setBackgroundColor(resources.getColor(R.color.green))
                 btn6?.setBackgroundColor(resources.getColor(R.color.green))
                 Toast.makeText(this,"Winner is $b4",Toast.LENGTH_SHORT).show()

             }
             else if(b7.equals(b8) && b8.equals(b9) && !b7.equals("")){
                 btn7?.setBackgroundColor(resources.getColor(R.color.green))
                 btn8?.setBackgroundColor(resources.getColor(R.color.green))
                 btn9?.setBackgroundColor(resources.getColor(R.color.green))
                 Toast.makeText(this,"Winner is $b7",Toast.LENGTH_SHORT).show()
             }
             else if(b1.equals(b5) && b5.equals(b9)&&!b1.equals("")){
                 btn1?.setBackgroundColor(resources.getColor(R.color.green))
                 btn5?.setBackgroundColor(resources.getColor(R.color.green))
                 btn9?.setBackgroundColor(resources.getColor(R.color.green))
                 Toast.makeText(this,"Winner is $b1",Toast.LENGTH_SHORT).show()

             }
             else if(b3.equals(b5)&&b5.equals(b7)&&!b3.equals("")){
                 btn3?.setBackgroundColor(resources.getColor(R.color.green))
                 btn5?.setBackgroundColor(resources.getColor(R.color.green))
                 btn7?.setBackgroundColor(resources.getColor(R.color.green))
                 Toast.makeText(this,"Winner is $b3",Toast.LENGTH_SHORT).show()

             }
             else if(b1.equals(b4)&&b4.equals(b7)&&!b1.equals("")){
                 btn1?.setBackgroundColor(resources.getColor(R.color.green))
                 btn4?.setBackgroundColor(resources.getColor(R.color.green))
                 btn7?.setBackgroundColor(resources.getColor(R.color.green))
                 Toast.makeText(this,"Winner is $b1",Toast.LENGTH_SHORT).show()

             }
             else if(b2.equals(b5)&&b5.equals(b8)&&!b2.equals("")){
                 btn5?.setBackgroundColor(resources.getColor(R.color.green))
                 btn2?.setBackgroundColor(resources.getColor(R.color.green))
                 btn8?.setBackgroundColor(resources.getColor(R.color.green))
                 Toast.makeText(this,"Winner is $b2",Toast.LENGTH_SHORT).show()

             }
             else if(b3.equals(b6)&&b6.equals(b9)&&!b3.equals("")){
                 btn6?.setBackgroundColor(resources.getColor(R.color.green))
                 btn9?.setBackgroundColor(resources.getColor(R.color.green))
                 btn3?.setBackgroundColor(resources.getColor(R.color.green))
                 Toast.makeText(this,"Winner is $b3",Toast.LENGTH_SHORT).show()
             }
             else if(count ==9){
                 Toast.makeText(this,"No one has won the game",Toast.LENGTH_SHORT).show()
                 reset()
             }
         }

    }
   
    private fun reset(){
        count=0
        btn1?.text=""
        btn2?.text=""
        btn3?.text=""
        btn4?.text=""
        btn5?.text=""
        btn6?.text=""
        btn7?.text=""
        btn8?.text=""
        btn9?.text=""
        btn1?.setBackgroundColor(resources.getColor(R.color.teal_700))
        btn2?.setBackgroundColor(resources.getColor(R.color.teal_700))
        btn3?.setBackgroundColor(resources.getColor(R.color.teal_700))
        btn4?.setBackgroundColor(resources.getColor(R.color.teal_700))
        btn5?.setBackgroundColor(resources.getColor(R.color.teal_700))
        btn6?.setBackgroundColor(resources.getColor(R.color.teal_700))
        btn7?.setBackgroundColor(resources.getColor(R.color.teal_700))
        btn8?.setBackgroundColor(resources.getColor(R.color.teal_700))
        btn9?.setBackgroundColor(resources.getColor(R.color.teal_700))
    }
    fun reset(view: View){
        count=0;
        btn1?.text=""
        btn2?.text=""
        btn3?.text=""
        btn4?.text=""
        btn5?.text=""
        btn6?.text=""
        btn7?.text=""
        btn8?.text=""
        btn9?.text=""
        btn1?.setBackgroundColor(resources.getColor(R.color.teal_700))
        btn2?.setBackgroundColor(resources.getColor(R.color.teal_700))
        btn3?.setBackgroundColor(resources.getColor(R.color.teal_700))
        btn4?.setBackgroundColor(resources.getColor(R.color.teal_700))
        btn5?.setBackgroundColor(resources.getColor(R.color.teal_700))
        btn6?.setBackgroundColor(resources.getColor(R.color.teal_700))
        btn7?.setBackgroundColor(resources.getColor(R.color.teal_700))
        btn8?.setBackgroundColor(resources.getColor(R.color.teal_700))
        btn9?.setBackgroundColor(resources.getColor(R.color.teal_700))
    }

}

