package com.example.sheculdeclass

import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Spinner
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var classSpinner: Spinner
    private lateinit var daySpinner: Spinner
    private lateinit var scheduleListView: ListView
    private val classList = arrayOf("5A", "6B", "7C", "8D", "9E", "10F")
    private val dayList = arrayOf("Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота")
    private val schoolSubjects = arrayOf("Математика", "Алгебра", "Геометрия", "Вероятность и статистика", "Информатика", "Природоведение", "География",
                                        "Биология", "Физика", "Химия", "ОБЖ", "Естествознание", "Экология", "Астрономия", "История", "Обществознание",
                                        "Русский язык", "Литература","Иностранный язык", "Технология", "Физическая культура", "Музыка", "Изобразительное искусство" )

    @RequiresApi(Build.VERSION_CODES.UPSIDE_DOWN_CAKE)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        classSpinner = findViewById(R.id.spinnerClass)
        daySpinner = findViewById(R.id.spinnerDay)
        scheduleListView = findViewById(R.id.lvSchedule)

        val adapterClass = ArrayAdapter(this, android.R.layout.simple_spinner_item, classList)
        adapterClass.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        classSpinner.adapter = adapterClass

        val adapterDay = ArrayAdapter(this, android.R.layout.simple_spinner_item, dayList)
        adapterDay.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        daySpinner.adapter = adapterDay

        classSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                showSchedule(classList[position], dayList[daySpinner.selectedItemPosition])
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
               return
            }
        }

        daySpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                showSchedule(classList[classSpinner.selectedItemPosition], dayList[position])
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                return
            }
        }

    }
    private fun showSchedule(selectedClass: String, selectedDay: String) {
        val scheduleList = when (selectedClass) {
            "5A","6B", "7C", "8D", "9E", "10F" -> when (selectedDay) {
                "Понедельник" -> listOf(
                    "${getRandomSchoolSubjects()} 9:40-11:15",
                    "${getRandomSchoolSubjects()} 11:25-13:00",
                    "${getRandomSchoolSubjects()} 13:40-15:15",
                    "${getRandomSchoolSubjects()} 15:35-17:10",
                    "${getRandomSchoolSubjects()} 17:20-18:55",
                    "${getRandomSchoolSubjects()} 19:05-20:40")
                "Вторник" -> listOf(
                    "${getRandomSchoolSubjects()} 9:00-10:35",
                    "${getRandomSchoolSubjects()} 10:45-12:20",
                    "${getRandomSchoolSubjects()} 13:00-14:30",
                    "${getRandomSchoolSubjects()} 14:50-16:25",
                    "${getRandomSchoolSubjects()} 16:35-18:10",
                    "${getRandomSchoolSubjects()} 18:20-19:55")
                "Среда" -> listOf(
                    "${getRandomSchoolSubjects()} 9:00-10:35",
                    "${getRandomSchoolSubjects()} 10:45-12:20",
                    "${getRandomSchoolSubjects()} 13:00-14:30",
                    "${getRandomSchoolSubjects()} 14:50-16:25",
                    "${getRandomSchoolSubjects()} 16:35-18:10",
                    "${getRandomSchoolSubjects()} 18:20-19:55"
                )
                "Четверг" -> listOf(
                    "${getRandomSchoolSubjects()} 9:00-10:35",
                    "${getRandomSchoolSubjects()} 10:45-12:20",
                    "${getRandomSchoolSubjects()} 13:00-14:30",
                    "${getRandomSchoolSubjects()} 14:50-16:25",
                    "${getRandomSchoolSubjects()} 16:35-18:10",
                    "${getRandomSchoolSubjects()} 18:20-19:55"
                )
                "Пятница" -> listOf(
                    "${getRandomSchoolSubjects()} 9:00-10:35",
                    "${getRandomSchoolSubjects()} 10:45-12:20",
                    "${getRandomSchoolSubjects()} 13:00-14:30",
                    "${getRandomSchoolSubjects()} 14:50-16:25",
                    "${getRandomSchoolSubjects()} 16:35-18:10",
                    "${getRandomSchoolSubjects()} 18:20-19:55"
                )
                "Суббота" -> listOf(
                    "${getRandomSchoolSubjects()} 9:00-10:35",
                    "${getRandomSchoolSubjects()} 10:45-12:20",
                    "${getRandomSchoolSubjects()} 13:00-14:30",
                    "${getRandomSchoolSubjects()} 14:50-16:25",
                    "${getRandomSchoolSubjects()} 16:35-18:10",
                    "${getRandomSchoolSubjects()} 18:20-19:55"
                )
                else -> listOf("null")
            }
            else -> listOf("null")
        }

        val adapters = ArrayAdapter(this, android.R.layout.simple_list_item_1, scheduleList)
        scheduleListView.adapter = adapters

        scheduleListView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            val selectedSchedule = scheduleList[position]
            Toast.makeText(this@MainActivity, selectedSchedule, Toast.LENGTH_SHORT).show()
        }
    }

    private fun getRandomSchoolSubjects() : String {
        val random  = Random.nextInt(0, schoolSubjects.size)
        return schoolSubjects[random]
    }
}