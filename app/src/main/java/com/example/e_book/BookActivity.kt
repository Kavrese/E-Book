package com.example.e_book

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_book.*

class BookActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book)

        Glide.with(this)
            .load(ToNextScreen.model.img)
            .into(ava_book_deteils)

        name_book.text = ToNextScreen.model.nameBook
        tag_book.text = ToNextScreen.model.tag
        author_book.text = ToNextScreen.model.author
        rate_book.text = ToNextScreen.model.rateString
        desc_book.text = ToNextScreen.model.desc

        back.setOnClickListener {
            finish()
        }
    }
}