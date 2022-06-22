package developer.abdusamid.h19t1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import developer.abdusamid.h19t1.adapter.FragmentAdapter
import developer.abdusamid.h19t1.databinding.ActivityMainBinding
import me.relex.circleindicator.CircleIndicator3

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private var titlelist = mutableListOf<String>()
    private var discriptionlist = mutableListOf<String>()
    private var imagesListlist = mutableListOf<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        data()


        binding.viewPager2.adapter = FragmentAdapter(titlelist, discriptionlist, imagesListlist)
        binding.viewPager2.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        val indicator = findViewById<CircleIndicator3>(R.id.circle_ind)
        indicator.setViewPager(binding.viewPager2)

        binding.buttonImage.setOnClickListener {
            binding.viewPager2.apply {
                beginFakeDrag()
                fakeDragBy(-10f)
                endFakeDrag()
            }
        }
        binding.txtAct.setOnClickListener {
            binding.viewPager2.apply {
                beginFakeDrag()
                fakeDragBy(-10f)
                endFakeDrag()
            }
        }
    }

    private fun loadData(title: String, discription: String, imageList: Int) {

        titlelist.add(title)
        discriptionlist.add(discription)
        imagesListlist.add(imageList)
    }

    private fun data() {
        loadData(
            "Xush kelibsiz",
            "Hush kelibsiz bu ilovamizda siz koplab foydali malumotlar olishingiz mumkin.",
            R.drawable.rasm2
        )
        loadData(
            "Hikoyalar dunyosi",
            "Hush kelibsiz bu ilovamizda siz koplab foydali malumotlar olishingiz mumkin.",
            R.drawable.rasm4
        )
        loadData(
            "Kitob ortidan",
            "Hush kelibsiz bu ilovamizda siz koplab foydali malumotlar olishingiz mumkin.",
            R.drawable.rasm1
        )
        loadData(
            "Bizga qo'shiling",
            "Hush kelibsiz bu ilovamizda siz koplab foydali malumotlar olishingiz mumkin.",
            R.drawable.rasm3
        )
    }
}