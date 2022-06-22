package developer.abdusamid.h19t1.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import developer.abdusamid.h19t1.R

class FragmentAdapter(
    var title: List<String>,
    var descreption: List<String>,
    var imagesList: List<Int>
) : RecyclerView.Adapter<FragmentAdapter.Vh>() {

    inner class Vh(itemview: View) : RecyclerView.ViewHolder(itemview) {
        val itemtitle: TextView = itemview.findViewById(R.id.tv_title)
        val txtkop: TextView = itemview.findViewById(R.id.text_kop)
        val orqafon: ImageView = itemview.findViewById(R.id.orqa_fon)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.itemtitle.text = title[position]
        holder.txtkop.text = descreption[position]
        holder.orqafon.setImageResource(imagesList[position])
    }

    override fun getItemCount(): Int = title.size

}