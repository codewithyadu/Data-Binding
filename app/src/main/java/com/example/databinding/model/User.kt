package com.example.databinding.model

data class User(
    val name: String = "John",
    val price: Int = 100,
    val isPriceVisible: Boolean = false,
    val imageUrl: String = "https://thumbor.forbes.com/thumbor/fit-in/416x416/filters%3Aformat%28jpg%29/https%3A%2F%2Fspecials-images.forbesimg.com%2Fimageserve%2F5ec593cc431fb70007482137%2F0x0.jpg%3Fbackground%3D000000%26cropX1%3D1321%26cropX2%3D3300%26cropY1%3D114%26cropY2%3D2093",
    val count: Int = 1
)

// android:visibility="@{user.priceVisible ? View.VISIBLE : View.GONE}"
