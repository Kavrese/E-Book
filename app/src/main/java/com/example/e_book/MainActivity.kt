package com.example.e_book

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val listData = arrayListOf(
        ModelBook("Тонкое искусство пофигизма", "4.6", "Учебник", "Марк Мэнсон", "https://img-fotki.yandex.ru/get/372788/355626315.4b/0_18e3d3_879e00f1_orig.jpg"),
        ModelBook("Просто Маса", "4.5", "История", "Борис Акунин", "https://cv0.litres.ru/pub/c/elektronnaya-kniga/cover_415/65476402-boris-akunin-prosto-masa.jpg"),
        ModelBook("Ведьмак", "4.5", "Фэнтази", "Анджей Сапковский", "https://cv6.litres.ru/pub/c/elektronnaya-kniga/cover_415/6375365-andzhey-sapkovskiy-vedmak.jpg"),
        ModelBook("Предел", "4.7", "Фантастика", "Сергей Лукьяненко", "https://cv1.litres.ru/pub/c/elektronnaya-kniga/cover_415/65061217-sergey-lukyanenko-predel.jpg"),
        ModelBook("Смерти.net", "4.1", "Фантастика", "Татьяна Замировская", "https://cv3.litres.ru/pub/c/elektronnaya-kniga/cover_415/65103032-tatyana-zamirovskaya-smerti-net.jpg"),
        ModelBook("Времени нет", "4.9", "Фантастика", "Алексей Брусницын", "https://cv6.litres.ru/pub/c/elektronnaya-kniga/cover_415/62727161-aleksey-brusnicyn-26207658-bpemehu-het.jpg"),
        ModelBook("Звезд не хватит на всех. Игры Старших", "4.8", "Фантастика", "Макс Глебов", "https://cv0.litres.ru/pub/c/elektronnaya-kniga/cover_415/63524806-maks-alekseevich-glebov-zvezd-ne-hvatit-na-vseh-igry-starshih.jpg"),
        ModelBook("Неизвестным для меня способом", "4.2", "Фэнтази", "Макс Фрай", "https://cv0.litres.ru/pub/c/elektronnaya-kniga/cover_415/44601909-maks-fray-neizvestnym-dlya-menya-sposobom.jpg"),

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rec_books.requestFocus()
        rec_books.apply{
            adapter = AdapterRecyclerViewMain(listData)
            layoutManager = LinearLayoutManager(this@MainActivity)
        }
    }
}