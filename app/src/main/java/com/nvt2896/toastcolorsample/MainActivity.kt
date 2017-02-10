package com.nvt2896.toastcolorsample

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.res.ResourcesCompat
import android.view.View
import com.nvt2896.toastcolor.ToastColor
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener{


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toast_normal.setOnClickListener(this)
        toast_success.setOnClickListener(this)
        toast_error.setOnClickListener(this)
        toast_debug.setOnClickListener(this)
        toast_info.setOnClickListener(this)
        toast_warning.setOnClickListener(this)
        toast_assert.setOnClickListener(this)
        toast_custom.setOnClickListener(this)


    }

    override fun onClick(v: View?) {
       // throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
        when (v) {
            toast_normal -> ToastColor.normal(this,"This is Normal Toast",ToastColor.LENGTH_SHORT).show()
            toast_success -> ToastColor.success(this,"This is Success Toast",ToastColor.LENGTH_SHORT).show()
            toast_error -> ToastColor.error(this, "This is Error Toast", ToastColor.LENGTH_SHORT).show()
            toast_debug -> ToastColor.debug(this,"This is Debug Toast",ToastColor.LENGTH_SHORT).show()
            toast_info -> ToastColor.info(this,"This is Info Toast", ToastColor.LENGTH_SHORT).show()
            toast_warning -> ToastColor.warn(this,"This is Warning Toast", ToastColor.LENGTH_SHORT).show()
            toast_assert -> ToastColor.confirm(this,"This is Assert Toast", ToastColor.LENGTH_SHORT).show()
            toast_custom -> ToastColor.custom(this,"This is Custom Toast", ToastColor.LENGTH_SHORT,Color.parseColor("#FFC107"),true,ResourcesCompat.getDrawable(resources,R.drawable.ic_card_giftcard,null),Color.parseColor("#009688"),true).show()

        }

    }
}
