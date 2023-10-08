package com.jsk.jhq.qwf.co.ne.memory.match

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val start = 1
        val end = 7
        val numbers = mutableListOf<String>()
        val number = mutableListOf<String>("<3")


        val btn1 = findViewById<Button>(R.id.btn1)
        val btn11 = findViewById<Button>(R.id.btn11)
        val btn111 = findViewById<Button>(R.id.btn111)
        val btn2 = findViewById<Button>(R.id.btn2)
        val btn22 = findViewById<Button>(R.id.btn22)
        val btn222 = findViewById<Button>(R.id.btn222)
        val btn3 = findViewById<Button>(R.id.btn3)
        val btn33 = findViewById<Button>(R.id.btn33)
        val btn333 = findViewById<Button>(R.id.btn333)
        val btn4 = findViewById<Button>(R.id.btn4)
        val btn44 = findViewById<Button>(R.id.btn44)
        val btn444 = findViewById<Button>(R.id.btn444)
        val btn5 = findViewById<Button>(R.id.btn5)
        val btn55 = findViewById<Button>(R.id.btn55)
        val btn555 = findViewById<Button>(R.id.btn555)
        val stG = findViewById<Button>(R.id.startGame)

        fun rand(start: Int, end: Int): Int {
            require(start <= end) { "Illegal Argument" }
            val rand = Random(System.nanoTime())
            return (start..end).random(rand)
        }
        fun start(){
            btn1.setEnabled(true)
            btn11.setEnabled(true)
            btn111.setEnabled(true)
            btn2.setEnabled(true)
            btn22.setEnabled(true)
            btn222.setEnabled(true)
            btn3.setEnabled(true)
            btn33.setEnabled(true)
            btn333.setEnabled(true)
            btn4.setEnabled(true)
            btn44.setEnabled(true)
            btn444.setEnabled(true)
            btn5.setEnabled(true)
            btn55.setEnabled(true)
            btn555.setEnabled(true)

            btn5.text = "<3"
            btn5.textSize = 1.0F

            btn1.text = rand(start,end).toString()
            btn1.textSize = 1.0F
            numbers.add(btn1.text as String)

            btn2.text = rand(start,end).toString()
            while (numbers.contains(btn2.text)){btn2.text = rand(start,end).toString()}
            btn2.textSize = 1.0F
            numbers.add(btn2.text as String)

            btn3.text = rand(start,end).toString()
            while (numbers.contains(btn3.text)){btn3.text = rand(start,end).toString()}
            btn3.textSize = 1.0F
            numbers.add(btn3.text as String)

            btn33.text = rand(start,end).toString()
            while (numbers.contains(btn33.text)){btn33.text = rand(start,end).toString()}
            btn33.textSize = 1.0F
            numbers.add(btn33.text as String)

            btn333.text = rand(start,end).toString()
            while (numbers.contains(btn333.text)){btn333.text = rand(start,end).toString()}
            btn333.textSize = 1.0F
            numbers.add(btn333.text as String)

            btn444.text = rand(start,end).toString()
            while (numbers.contains(btn444.text)){btn444.text = rand(start,end).toString()}
            btn444.textSize = 1.0F
            numbers.add(btn444.text as String)

            btn555.text = rand(start,end).toString()
            while (numbers.contains(btn555.text)){btn555.text = rand(start,end).toString()}
            btn555.textSize = 1.0F
            numbers.add(btn555.text as String)


            btn11.text = numbers.random()
            btn11.textSize = 1.0F
            numbers.remove(btn11.text)

            btn111.text = numbers.random()
            btn111.textSize = 1.0F
            numbers.remove(btn111.text)

            btn22.text = numbers.random()
            btn22.textSize = 1.0F
            numbers.remove(btn22.text)

            btn222.text = numbers.random()
            btn222.textSize = 1.0F
            numbers.remove(btn222.text)

            btn4.text = numbers.random()
            btn4.textSize = 1.0F
            numbers.remove(btn4.text)

            btn44.text = numbers.random()
            btn44.textSize = 1.0F
            numbers.remove(btn44.text)

            btn55.text = numbers.random()
            btn55.textSize = 1.0F
            numbers.remove(btn55.text)


        }
        fun preStart(){
            btn1.setEnabled(false)
            btn11.setEnabled(false)
            btn111.setEnabled(false)
            btn2.setEnabled(false)
            btn22.setEnabled(false)
            btn222.setEnabled(false)
            btn3.setEnabled(false)
            btn33.setEnabled(false)
            btn333.setEnabled(false)
            btn4.setEnabled(false)
            btn44.setEnabled(false)
            btn444.setEnabled(false)
            btn5.setEnabled(false)
            btn55.setEnabled(false)
            btn555.setEnabled(false)
        }
        preStart()
        stG.setOnClickListener { start() }

        fun refresh(){
            btn1.textSize = 1.0F
            btn11.textSize = 1.0F
            btn111.textSize = 1.0F
            btn2.textSize = 1.0F
            btn22.textSize = 1.0F
            btn222.textSize = 1.0F
            btn3.textSize = 1.0F
            btn33.textSize = 1.0F
            btn333.textSize = 1.0F
            btn4.textSize = 1.0F
            btn44.textSize = 1.0F
            btn444.textSize = 1.0F
            btn5.textSize = 1.0F
            btn55.textSize = 1.0F
            btn555.textSize = 1.0F
        }
        fun checker(){
            if(number.size > 2){
                number.clear()
                number.add("<3")
                refresh()
            }
        }

        btn1.setOnClickListener {
            btn1.textSize = 15.0F

            if(number.contains(btn1.text)){
                btn1.setEnabled(false)
            }else{
                if(number.size<3){
                    number.add(btn1.text as String)
                }else{
                    btn1.textSize = 1.0F
                }
            }
            checker()
        }
        btn11.setOnClickListener {
            btn11.textSize = 15.0F

            if(number.contains(btn11.text)){
                btn11.setEnabled(false)
            }else{
                if(number.size<3){
                    number.add(btn11.text as String)
                }else{
                    btn11.textSize = 1.0F
                }
            }
            checker()
            }
        btn111.setOnClickListener {
            btn111.textSize = 15.0F

            if(number.contains(btn111.text)){
                btn111.setEnabled(false)
            }else{
                if(number.size<3){
                    number.add(btn111.text as String)
                }else{
                    btn111.textSize = 1.0F
                }
            }
            checker()
        }
        btn2.setOnClickListener {
            btn2.textSize = 15.0F

            if(number.contains(btn2.text)){
                btn2.setEnabled(false)
            }else{
                if(number.size<3){
                    number.add(btn2.text as String)
                }else{
                    btn2.textSize = 1.0F
                }
            }
            checker()
        }
        btn22.setOnClickListener {
            btn22.textSize = 15.0F

            if(number.contains(btn22.text)){
                btn22.setEnabled(false)
            }else{
                if(number.size<3){
                    number.add(btn22.text as String)
                }else{
                    btn22.textSize = 1.0F
                }
            }
            checker()
        }
        btn222.setOnClickListener {
            btn222.textSize = 15.0F

            if(number.contains(btn3.text)){
                btn222.setEnabled(false)
            }else{
                if(number.size<3){
                    number.add(btn222.text as String)
                }else{
                    btn222.textSize = 1.0F
                }
            }
            checker()
        }
        btn3.setOnClickListener {
            btn3.textSize = 15.0F

            if(number.contains(btn3.text)){
                btn3.setEnabled(false)
            }else{
                if(number.size<3){
                    number.add(btn3.text as String)
                }else{
                    btn3.textSize = 1.0F
                }
            }
            checker()
        }
        btn33.setOnClickListener {
            btn33.textSize = 15.0F

            if(number.contains(btn33.text)){
                btn33.setEnabled(false)
            }else{
                if(number.size<3){
                    number.add(btn33.text as String)
                }else{
                    btn33.textSize = 1.0F
                }
            }
            checker()
        }
        btn333.setOnClickListener {
            btn333.textSize = 15.0F

            if(number.contains(btn333.text)){
                btn333.setEnabled(false)
            }else{
                if(number.size<3){
                    number.add(btn333.text as String)
                }else{
                    btn333.textSize = 1.0F
                }
            }
            checker()
        }
        btn4.setOnClickListener {
            btn4.textSize = 15.0F

            if(number.contains(btn4.text)){
                btn4.setEnabled(false)
            }else{
                if(number.size<3){
                    number.add(btn4.text as String)
                }else{
                    btn4.textSize = 1.0F
                }
            }
            checker()
        }
        btn44.setOnClickListener {
            btn44.textSize = 15.0F

            if(number.contains(btn44.text)){
                btn44.setEnabled(false)
            }else{
                if(number.size<3){
                    number.add(btn44.text as String)
                }else{
                    btn44.textSize = 1.0F
                }
            }
            checker()
        }
        btn444.setOnClickListener {
            btn444.textSize = 15.0F

            if(number.contains(btn444.text)){
                btn444.setEnabled(false)
            }else{
                if(number.size<3){
                    number.add(btn4.text as String)
                }else{
                    btn444.textSize = 1.0F
                }
            }
            checker()
        }
        btn5.setOnClickListener {
            btn5.textSize = 15.0F
            btn5.setEnabled(false)
        }
        btn55.setOnClickListener {
            btn55.textSize = 15.0F

            if(number.contains(btn55.text)){
                btn55.setEnabled(false)
            }else{
                if(number.size<3){
                    number.add(btn55.text as String)
                }else{
                    btn55.textSize = 1.0F
                }
            }
            checker()
        }
        btn555.setOnClickListener {
            btn555.textSize = 15.0F

            if(number.contains(btn555.text)){
                btn555.setEnabled(false)
            }else{
                if(number.size<3){
                    number.add(btn555.text as String)
                }else{
                    btn555.textSize = 1.0F
                }
            }
            checker()
        }


    }
}