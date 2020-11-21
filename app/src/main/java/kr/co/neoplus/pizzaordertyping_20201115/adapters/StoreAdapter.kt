package kr.co.neoplus.pizzaordertyping_20201115.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kr.co.neoplus.pizzaordertyping_20201115.R
import kr.co.neoplus.pizzaordertyping_20201115.datas.Store

class StoreAdapter(
    val mContext:Context, 
    resId : Int,
    val mList: ArrayList<Store>) : ArrayAdapter<Store>(mContext, resId, mList) {
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
        
        //완성된 row가 리스트뷰에 뿌려질 결과물
        
        return row
        
    }
    
    
}