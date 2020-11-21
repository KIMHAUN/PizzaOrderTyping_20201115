package kr.co.neoplus.pizzaordertyping_20201115

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_store_detail.*
import kr.co.neoplus.pizzaordertyping_20201115.datas.Store

class StoreDetailActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_store_detail)
        setupEvents()
        setValues()
    }
    override fun setupEvents() {
    }

    override fun setValues() {
        val pizzaStore = intent.getSerializableExtra("pizzaStore") as Store
        storeNameTxt.text = pizzaStore.name
        storeFoneNoTxt.text = pizzaStore.phoneNum
        Glide.with(mContext).load(pizzaStore.logoURL).into(logoImg)

    }


}