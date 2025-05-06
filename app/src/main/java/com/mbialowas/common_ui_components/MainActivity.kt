package com.mbialowas.common_ui_components

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ListView
import android.widget.ProgressBar
import android.widget.RadioGroup
import android.widget.SeekBar
import android.widget.Spinner
import android.widget.Switch
import android.widget.Toast
import android.widget.ToggleButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var editText: EditText
    private lateinit var button: Button
    private lateinit var checkBox: CheckBox
    private lateinit var radioGroup: RadioGroup
    private lateinit var switch: Switch
    private lateinit var toggleButton: ToggleButton
    private lateinit var seekBar: SeekBar
    private lateinit var progressBar: ProgressBar
    private lateinit var spinner: Spinner
    private lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.editText)
        button = findViewById(R.id.button)
        checkBox = findViewById(R.id.checkBox)
        radioGroup = findViewById(R.id.radioGroup)
        switch = findViewById(R.id.switch1)
        toggleButton = findViewById(R.id.toggleButton)
        seekBar = findViewById(R.id.seekBar)
        progressBar = findViewById(R.id.progressBar)
        spinner = findViewById(R.id.spinner)
        listView = findViewById(R.id.listView)

        // Button click example
        button.setOnClickListener {
            val enteredText = editText.text.toString()
            Toast.makeText(this, "You entered: $enteredText", Toast.LENGTH_SHORT).show()
        }

        // Spinner setup
        val spinnerItems = arrayOf("Option 1", "Option 2", "Option 3")
        spinner.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, spinnerItems)

        // ListView setup
        val listItems = arrayOf("Item A", "Item B", "Item C", "Item D")
        listView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listItems)

        // SeekBar change listener
        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                progressBar.progress = progress
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })
    }
}