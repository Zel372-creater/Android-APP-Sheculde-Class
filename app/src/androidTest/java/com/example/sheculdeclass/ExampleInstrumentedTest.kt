package com.example.sheculdeclass

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.sheculdeclass", appContext.packageName)
    }
}
//        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, classList)
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//        classSpinner.adapter = adapter
//
//        classSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
//            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
//                val selectedClass = classList[position]
//                Toast.makeText(this@MainActivity, "Выбран класс: $selectedClass", Toast.LENGTH_SHORT).show()
//
//                when (selectedClass) {
//                    "5A" -> {
//                        val scheduleList = listOf(
//                            "Понедельник: Математика 10:00-12:00",
//                            "Вторник: Математика 8:30-10:30",
//                            "Среда: Математика 9:00-11:00",
//                            "Четверг: Математика 13:00-15:00",
//                            "Пятница: Математика 14:00-16:00",
//                            "Суббота: Математика 10:30-12:30"
//                        )
//
//                        val adapters = ArrayAdapter(this@MainActivity, android.R.layout.simple_list_item_1, scheduleList)
//                        scheduleListView.adapter = adapters
//
//                        scheduleListView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
//                            val selectedSchedule = scheduleList[position]
//                            Toast.makeText(this@MainActivity, selectedSchedule, Toast.LENGTH_SHORT).show()
//                        }
//                    }
//                    "6B" -> {
//                        val scheduleList = listOf(
//                            "Понедельник: Физика 10:00-12:00",
//                            "Вторник: Физика 8:30-10:30",
//                            "Среда: Физика 9:00-11:00",
//                            "Четверг: Физика 13:00-15:00",
//                            "Пятница: Физика 14:00-16:00",
//                            "Суббота: Физика 10:30-12:30"
//                        )
//
//                        val adapters = ArrayAdapter(this@MainActivity, android.R.layout.simple_list_item_1, scheduleList)
//                        scheduleListView.adapter = adapters
//
//                        scheduleListView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
//                            val selectedSchedule = scheduleList[position]
//                            Toast.makeText(this@MainActivity, selectedSchedule, Toast.LENGTH_SHORT).show()
//                        }
//
//                    }
//                    "7C" -> {
//                        val scheduleList = listOf(
//                            "Понедельник: Английский язык 10:00-12:00",
//                            "Вторник: Английский язык 8:30-10:30",
//                            "Среда: Английский язык 9:00-11:00",
//                            "Четверг: Английский язык 13:00-15:00",
//                            "Пятница: Английский язык 14:00-16:00",
//                            "Суббота: Английский язык 10:30-12:30"
//                        )
//
//                        val adapters = ArrayAdapter(this@MainActivity, android.R.layout.simple_list_item_1, scheduleList)
//                        scheduleListView.adapter = adapters
//
//                        scheduleListView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
//                            val selectedSchedule = scheduleList[position]
//                            Toast.makeText(this@MainActivity, selectedSchedule, Toast.LENGTH_SHORT).show()
//                        }
//
//                    }
//                    "8D" -> {
//                        val scheduleList = listOf(
//                            "Понедельник: Химия 10:00-12:00",
//                            "Вторник: Химия 8:30-10:30",
//                            "Среда: Химия 9:00-11:00",
//                            "Четверг: Химия 13:00-15:00",
//                            "Пятница: Химия 14:00-16:00",
//                            "Суббота: Химия 10:30-12:30"
//                        )
//
//                        val adapters = ArrayAdapter(this@MainActivity, android.R.layout.simple_list_item_1, scheduleList)
//                        scheduleListView.adapter = adapters
//
//                        scheduleListView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
//                            val selectedSchedule = scheduleList[position]
//                            Toast.makeText(this@MainActivity, selectedSchedule, Toast.LENGTH_SHORT).show()
//                        }
//
//                    }
//                    "9E" -> {
//                        val scheduleList = listOf(
//                            "Понедельник: История 10:00-12:00",
//                            "Вторник: История 8:30-10:30",
//                            "Среда: История 9:00-11:00",
//                            "Четверг: История 13:00-15:00",
//                            "Пятница: История 14:00-16:00",
//                            "Суббота: История 10:30-12:30"
//                        )
//
//                        val adapters = ArrayAdapter(this@MainActivity, android.R.layout.simple_list_item_1, scheduleList)
//                        scheduleListView.adapter = adapters
//
//                        scheduleListView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
//                            val selectedSchedule = scheduleList[position]
//                            Toast.makeText(this@MainActivity, selectedSchedule, Toast.LENGTH_SHORT).show()
//                        }
//
//                    }
//                    "10F" -> {
//                        val scheduleList = listOf(
//                            "Понедельник: Физкультура 10:00-12:00",
//                            "Вторник: Физкультура 8:30-10:30",
//                            "Среда: Физкультура 9:00-11:00",
//                            "Четверг: Физкультура 13:00-15:00",
//                            "Пятница: Физкультура 14:00-16:00",
//                            "Суббота: Физкультура 10:30-12:30"
//                        )
//
//                        val adapters = ArrayAdapter(this@MainActivity, android.R.layout.simple_list_item_1, scheduleList)
//                        scheduleListView.adapter = adapters
//
//                        scheduleListView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
//                            val selectedSchedule = scheduleList[position]
//                            Toast.makeText(this@MainActivity, selectedSchedule, Toast.LENGTH_SHORT).show()
//                        }
//
//                    }
//                    else -> {
//                        val scheduleList = listOf(
//                            "Понедельник: null",
//                            "Вторник: null",
//                            "Среда: null",
//                            "Четверг: null",
//                            "Пятница: null",
//                            "Суббота: null"
//                        )
//
//                        val adapters = ArrayAdapter(this@MainActivity, android.R.layout.simple_list_item_1, scheduleList)
//                        scheduleListView.adapter = adapters
//
//                        scheduleListView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
//                            val selectedSchedule = scheduleList[position]
//                            Toast.makeText(this@MainActivity, selectedSchedule, Toast.LENGTH_SHORT).show()
//                        }
//                    }
//                }
//
//            }
//
//            override fun onNothingSelected(parent: AdapterView<*>?) {
//                Toast.makeText(this@MainActivity, "Ничего не выбрано", Toast.LENGTH_SHORT).show()
//            }
//        }