package kr.co.neoplus.pizzaordertyping_20201115.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_my_profile.*
import kotlinx.android.synthetic.main.fragment_my_profile.*
import kr.co.neoplus.pizzaordertyping_20201115.MyProfileActivity
import kr.co.neoplus.pizzaordertyping_20201115.R

class MyProfileFragment : Fragment() {
    val REQ_FOR_DATA = 1000
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_profile, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        //내 닉네임 변경 관련 기능
        changeBtn.setOnClickListener {

            val myIntent = Intent(context!!, MyProfileActivity::class.java)
            startActivityForResult(myIntent, REQ_FOR_DATA)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == REQ_FOR_DATA){
            val newInputData = data?.getStringExtra("newData")
            nickNameTxt.text = newInputData
        }


    }
}