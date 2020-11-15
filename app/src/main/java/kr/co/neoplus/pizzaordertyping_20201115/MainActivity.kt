package kr.co.neoplus.pizzaordertyping_20201115

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import kotlinx.android.synthetic.main.activity_main.*
import kr.co.neoplus.pizzaordertyping_20201115.adapters.MyViewPagerAdapter

class MainActivity : BaseActivity() {

    lateinit var myViewPagerAdapter : MyViewPagerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }
    override fun setupEvents() {

    }

    override fun setValues() {
        myViewPagerAdapter = MyViewPagerAdapter(supportFragmentManager)
        myViewPager.adapter = myViewPagerAdapter

        myTabLayout.setupWithViewPager(myViewPager)


    }


}