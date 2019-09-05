package mobin.expandablerecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import mobin.expandablerecyclerview.adapters.MyAdapter
import mobin.expandablerecyclerview.models.Parent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rv.layoutManager = LinearLayoutManager(this)
        val list = ArrayList<Parent>(10)
        for (i in 0..50)
            list.add(Parent("Parent $i"))

        val adapter = MyAdapter(list)
        //   rv.setItemViewCacheSize(list.size)
        rv.adapter = adapter

    }
}
