package com.example.recyclerviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewkotlin.databinding.ActivityMainBinding
import com.example.recyclerviewkotlin.model.Person
import com.example.recyclerviewkotlin.model.PersonProvider
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    // ActivityMainBinding from the name of layout activity_main.xml
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.addButton.setOnClickListener { insertData() }
        val view = binding.root;
        setContentView(view)

        // init RecyclerView
        val adapter = CustomAdapter(PersonProvider.getPersons());

        view.personRecyclerView.layoutManager = LinearLayoutManager(this);
        view.personRecyclerView.adapter = adapter
    }

    private fun insertData() {
        val surname = binding.surnameText.text.toString()
        val name = binding.nameText.text.toString()

        val person = Person(surname, name);

//        Toast.makeText(this, "$person.surname:$person.name", Toast.LENGTH_LONG).show()
    }

    fun onClickAddButton(view: View) {}
}