package com.example.recyclerviewkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewkotlin.databinding.RowBinding
import com.example.recyclerviewkotlin.model.Person

class CustomAdapter(private val persons : List<Person>) :
    RecyclerView.Adapter<CustomAdapter.ViewHolder>()
{
    class ViewHolder(val itemView : View) : RecyclerView.ViewHolder(itemView){
        val binding = RowBinding.bind(itemView);
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.row, parent, false)
        return ViewHolder(view);

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder.binding) {
            surnameTextView.text = persons[position].surname
            nameTextView.text = persons[position].name

        }
    }

    override fun getItemCount() = persons.size;
}