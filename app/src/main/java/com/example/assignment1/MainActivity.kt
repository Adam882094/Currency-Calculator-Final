package com.example.assignment1

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem

import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)


    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    fun convertUSD(view:View) {
        if (dollarText.text.isNotEmpty()) {
            val dollarValue = dollarText.text.toString().toFloat()
            val convertedValue = dollarValue * 0.7565f
            val result = "%.2f".format(convertedValue)
            textView.text = result.toString() + " United States Dollars"
        } else {
            textView.text = "Enter A Canadian Dollar Amount"
        }
    }

    fun convertEUR(view:View) {
        if (dollarText.text.isNotEmpty()) {
            val dollarValue = dollarText.text.toString().toFloat()
            val convertedValue = dollarValue * 0.6918f
            val result = "%.2f".format(convertedValue)
            textView.text = result.toString() + " Euros"
        } else {
            textView.text = "Enter A Canadian Dollar Amount"
        }
    }

    fun convertJPY(view:View) {
        if (dollarText.text.isNotEmpty()) {
            val dollarValue = dollarText.text.toString().toFloat()
            val convertedValue = dollarValue * 81.51f
            val result = "%.2f".format(convertedValue)
            textView.text = result.toString() + " Japanese Yen"
        } else {
            textView.text = "Enter A Canadian Dollar Amount"
        }
    }

    fun convertGBP(view:View) {
        if (dollarText.text.isNotEmpty()) {
            val dollarValue = dollarText.text.toString().toFloat()
            val convertedValue = dollarValue * 0.6155f
            val result = "%.2f".format(convertedValue)
            textView.text = result.toString() + " British Pound Sterling"
        } else {
            textView.text = "Enter A Canadian Dollar Amount"
        }
    }

    fun convertCHF(view:View) {
        if (dollarText.text.isNotEmpty()) {
            val dollarValue = dollarText.text.toString().toFloat()
            val convertedValue = dollarValue * 0.7511f
            val result = "%.2f".format(convertedValue)
            textView.text = result.toString() + " Swiss Franc"
        } else {
            textView.text = "Enter A Canadian Dollar Amount"
        }
    }

    fun convertCNY(view:View) {
        if (dollarText.text.isNotEmpty()) {
            val dollarValue = dollarText.text.toString().toFloat()
            val convertedValue = dollarValue * 5.408f
            val result = "%.2f".format(convertedValue)
            textView.text = result.toString() + " Chinese Yuan"
        } else {
            textView.text = "Enter A Canadian Dollar Amount"
        }
    }

    fun convertMXN(view:View) {
        if (dollarText.text.isNotEmpty()) {
            val dollarValue = dollarText.text.toString().toFloat()
            val convertedValue = dollarValue * 14.99f
            val result = "%.2f".format(convertedValue)
            textView.text = result.toString() + " Mexican Pesos"
        } else {
            textView.text = "Enter A Canadian Dollar Amount"
        }
    }

    fun convertSEK(view:View) {
        if (dollarText.text.isNotEmpty()) {
            val dollarValue = dollarText.text.toString().toFloat()
            val convertedValue = dollarValue * 7.47f
            val result = "%.2f".format(convertedValue)
            textView.text = result.toString() + " Swedish Krona"
        } else {
            textView.text = "Enter A Canadian Dollar Amount"
        }
    }

    fun convertRUB(view:View) {
        if (dollarText.text.isNotEmpty()) {
            val dollarValue = dollarText.text.toString().toFloat()
            val convertedValue = dollarValue * 49.37f
            val result = "%.2f".format(convertedValue)
            textView.text = result.toString() + " Russian Ruble"
        } else {
            textView.text = "Enter A Canadian Dollar Amount"
        }
    }

    fun convertEGP(view:View) {
        if (dollarText.text.isNotEmpty()) {
            val dollarValue = dollarText.text.toString().toFloat()
            val convertedValue = dollarValue * 12.31f
            val result = "%.2f".format(convertedValue)
            textView.text = result.toString() + " Egyptian Pounds"
        } else {
            textView.text = "Enter A Canadian Dollar Amount"
        }
    }

    fun convertAUD(view:View) {
        if (dollarText.text.isNotEmpty()) {
            val dollarValue = dollarText.text.toString().toFloat()
            val convertedValue = dollarValue * 1.128f
            val result = "%.2f".format(convertedValue)
            textView.text = result.toString() + " Australian Dollars"
        } else {
            textView.text = "Enter A Canadian Dollar Amount"
        }
    }

    fun convertNZD(view:View) {
        if (dollarText.text.isNotEmpty()) {
            val dollarValue = dollarText.text.toString().toFloat()
            val convertedValue = dollarValue * 1.212f
            val result = "%.2f".format(convertedValue)
            textView.text = result.toString() + " New Zealand Dollars"
        } else {
            textView.text = "Enter A Canadian Dollar Amount"
        }
    }




}
