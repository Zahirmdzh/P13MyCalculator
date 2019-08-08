package sg.edu.rp.c347.p13mycalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var input1 = ""
    var input2 = ""
    var output = 0.0
    var operator = ""
    var clickedOperator = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun btnDigitClick(view: View) {


        val btnSelected = view as Button



        if (!clickedOperator) {
//            tvResult.text = ""

            when (btnSelected.id) {

                button0.id -> input1 = input1 + "0"
                button1.id -> input1 = input1 + "1"
                button2.id -> input1 = input1 + "2"
                button3.id -> input1 = input1 + "3"
                button4.id -> input1 = input1 + "4"
                button5.id -> input1 = input1 + "5"
                button6.id -> input1 = input1 + "6"
                button7.id -> input1 = input1 + "7"
                button8.id -> input1 = input1 + "8"
                button9.id -> input1 = input1 + "9"

            }

        } else {
//            tvResult.text = ""

            when (btnSelected.id) {
                button0.id -> input2 = input2 + "0"
                button1.id -> input2 = input2 + "1"
                button2.id -> input2 = input2 + "2"
                button3.id -> input2 = input2 + "3"
                button4.id -> input2 = input2 + "4"
                button5.id -> input2 = input2 + "5"
                button6.id -> input2 = input2 + "6"
                button7.id -> input2 = input2 + "7"
                button8.id -> input2 = input2 + "8"
                button9.id -> input2 = input2 + "9"
            }

        }
        tvResult.text = output.toString()
    }
        fun btnOperatorClick(view: View) {

            clickedOperator = true
//            tvResult.text = ""
            val btnSelected = view as Button
            when (btnSelected.id) {

                buttonSlash.id -> operator ="/"
                buttonAst.id -> operator ="*"
                buttonMinus.id -> operator = "-"
                buttonPlus.id -> operator = "+"
                buttonDot.id -> operator = "."

            }

        /*    if(operator.equals("+") && input2.isNotEmpty()) {
                output += input2.toDouble()
            }*/

            tvResult.text =output.toString()
        }


        fun btnOnClickAC(view: View) {

            clickedOperator = false
            val btnSelected = view as Button
            when (btnSelected.id) {

                buttonAC.id -> output = 0.0

            }
            tvResult.text = ""
            operator = ""
            output = 0.0
            input1 = ""
            input2 = ""
        }



        fun btnEqualClick(view: View) {


       /*     val btnSelected = view as Button
            when (btnSelected.id) {

                buttonEqual.id -> output = ""

            }*/

            if(operator.equals("+") && input2.isEmpty()) {
                output = tvResult.text.toString().toDouble() + input2.toDouble()
            }

            tvResult.text = output.toString()

        }
    }

