package com.example.myapplication

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    private var selectedDate: TextView? = null
    private var inMinutes: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDatePicker: Button = findViewById(R.id.btnDatePicker) //id로 btn 찾기
        selectedDate = findViewById(R.id.seletedDate)
        inMinutes = findViewById(R.id.inMinutes)

        btnDatePicker.setOnClickListener {

            clickDatePicker()
        }
    }

    private fun clickDatePicker() {
        val myCalendar = Calendar.getInstance() //현재 날짜
        val year = myCalendar.get(Calendar.YEAR)
        val month = myCalendar.get(Calendar.MONTH)
        val day = myCalendar.get(Calendar.DAY_OF_MONTH)
        val dpd = DatePickerDialog(
            this,
            { _, selectedYear, selectedMonth, selectedDayOfMonth ->

//                Toast.makeText(this, " $year $month $dayOfMonth", Toast.LENGTH_LONG).show()

                val selected = "$selectedYear/${selectedMonth + 1}/$selectedDayOfMonth"

                selectedDate?.text = selected

                val sdf = SimpleDateFormat("yyyy/MM/dd", Locale.KOREA)

                val theDate = sdf.parse(selectedDate?.text as String)

                theDate?.let {
                    val selectedDateInMinutes = theDate.time / 60 / 1000

                    val currentDate = sdf.parse(sdf.format(System.currentTimeMillis()))

                    currentDate?.let {
                        val currentDateInMinutes = currentDate.time / 60 / 1000

                        val diff = currentDateInMinutes - selectedDateInMinutes

                        inMinutes?.text = diff.toString()
                    }
                }
            },
            year,
            month,
            day
        )
        dpd.datePicker.maxDate = System.currentTimeMillis() - 1440 * 60 * 1000
        dpd.show()
    }

}