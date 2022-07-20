package com.nischith271.whatsappclone.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.nischith271.whatsappclone.R
import com.nischith271.whatsappclone.models.Contact

class ChatsListAdapter(private val dataset: List<Contact>):
    RecyclerView.Adapter<ChatsListAdapter.ViewHolder>() {

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val textView = view.findViewById<TextView>(R.id.contactName)
        val chatCard = view.findViewById<CardView>(R.id.chatCard)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.chat_row_item,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = dataset[position].name
        holder.chatCard.setOnClickListener {
            holder.textView.text = "hello"
        }
    }

    override fun getItemCount(): Int {
        return 1
    }
}