package com.example.kpoplist.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.findViewTreeViewModelStoreOwner
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.kpoplist.R
import com.example.kpoplist.data.Datasource
import com.example.kpoplist.model.Group

class GroupAdapter(private val context: Context?,
                   private val layout: Int
                   ) : RecyclerView.Adapter<GroupAdapter.GroupViewHolder>() {

    private val dataset: List<Group> = Datasource.groups


    class GroupViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val name: TextView = view.findViewById(R.id.item_name)
        val fandomName: TextView = view.findViewById(R.id.item_fandomName)
        val numberOfMembers: TextView = view.findViewById(R.id.item_numberOfMembers)
        val image: ImageView = view.findViewById(R.id.item_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroupViewHolder {

        val adapterLayout = when(layout) {
            3 -> LayoutInflater.from(parent.context)
                .inflate(R.layout.grid_list_item, parent, false)
            else -> LayoutInflater.from(parent.context)
                .inflate(R.layout.list_item, parent, false)
        }

        return GroupViewHolder(adapterLayout)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: GroupViewHolder, position: Int) {
        val item = dataset[position]
        holder.name.text = item.name
        holder.fandomName.text = "Fandom: ${item.fandom}"
        holder.numberOfMembers.text = "Number of Members: ${item.numberOfMembers}"
        holder.image.setImageResource(item.imageResourceId)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}