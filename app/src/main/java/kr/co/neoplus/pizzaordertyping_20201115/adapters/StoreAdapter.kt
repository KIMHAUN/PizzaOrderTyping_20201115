package kr.co.neoplus.pizzaordertyping_20201115.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import de.hdodenhof.circleimageview.CircleImageView
import kr.co.neoplus.pizzaordertyping_20201115.R
import kr.co.neoplus.pizzaordertyping_20201115.datas.Store
import org.w3c.dom.Text

class StoreAdapter(
    val mContext:Context, 
    resId : Int,
    val mList: List<Store>) : ArrayAdapter<Store>(mContext, resId, mList) {
//  mContext, mList => m으로 시작 : 멤버변수(클래스 내부 어디에서든 사용 가능한 변수) 명시
//  resId => 그냥 시작 : 멤버변수가 아님.(다른 함수에서는 사용할 수 없다.)  클래스 첫 중괄호까지 OK
    
    val mInf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
//        리스트뷰의 재사용성 활용 : convertView 변수 활용
        var tempRow = convertView
        if(tempRow == null){
            tempRow = mInf.inflate(R.layout.store_list_item, null)
        }
        
        val row = tempRow!!
        //실제 뿌려주기 전에 row에 데이터들 집어넣기

        //(1) row 내부의 textView/ imageView 등등에게
        //(2) ArrayList 안의 데이터 꺼내서
        //(3) 문구/ src 반영

        val nameTxt = row.findViewById<TextView>(R.id.nameTxt)
        val logoImg = row.findViewById<ImageView>(R.id.logoImg)
        
        //완성된 row가 리스트뷰에 뿌려질 결과물

        //현재 그려주려는 위치(position)에맞는 데이터(List 꺼내서 변수에 저장
        val storeData = mList[position]
        nameTxt.text = storeData.name

        //storeData.logoUrl에 적힌 주소에 있는 이미지를
        //웹상의 이미지를 이미지뷰에 뿌려주자. Glide
        Glide.with(mContext).load(storeData.logoURL).into(logoImg)

        //완성된 row가f 리스트뷰에 뿌려질 결과물
        return row
        
    }
    
    
}