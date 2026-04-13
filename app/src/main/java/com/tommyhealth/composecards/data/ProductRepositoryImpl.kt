package com.tommyhealth.composecards.data

import com.tommyhealth.composecards.domain.AvailabilityBlock
import com.tommyhealth.composecards.domain.Pricing
import com.tommyhealth.composecards.domain.ProductItem
import com.tommyhealth.composecards.domain.Rating
import com.tommyhealth.composecards.domain.ReliabilityLevel

class ProductRepositoryImpl : ProductRepository {
    override fun getProducts(): List<ProductItem> = products
}

private val products: List<ProductItem> = listOf(
    ProductItem(
        id = "xiaomi-redmi-note-14-128",
        image = "file:///android_asset/img_5.png",
        title = "6.67\" Смартфон Xiaomi Redmi Note 14 128 ГБ черный",
        rating = Rating(score = 4.5f, reviewCount = "3,4к"),
        reliability = ReliabilityLevel.EXCELLENT,
        isBestseller = false,
        isFavorite = false,
        price = Pricing(
            current = "12 799 ₽",
            old = null,
            installment = "от 1 246 ₽/мес",
        ),
        isAvailable = true,
        availabilityBlock = listOf(
            AvailabilityBlock("В наличии:", "в 273 магазинах"),
            AvailabilityBlock("Пункты выдачи:", "доступны"),
            AvailabilityBlock("Доставим на дом:", "за 2 часа"),
        ),
    ),
    ProductItem(
        id = "xiaomi-redmi-note-14-256",
        image = "file:///android_asset/img_5.png",
        title = "6.67\" Смартфон Xiaomi Redmi Note 14 256 ГБ черный",
        rating = Rating(score = 4.5f, reviewCount = "3200"),
        reliability = ReliabilityLevel.EXCELLENT,
        isBestseller = true,
        isFavorite = false,
        price = Pricing(
            current = "17 199 ₽",
            old = null,
            installment = "от 1 677 ₽/мес",
        ),
        isAvailable = true,
        availabilityBlock = listOf(
            AvailabilityBlock("В наличии:", "в 282 магазинах"),
            AvailabilityBlock("Пункты выдачи:", "доступны"),
            AvailabilityBlock("Доставим на дом:", "за 2 часа"),
        ),
    ),
    ProductItem(
        id = "apple-iphone-17-pro-256",
        image = "file:///android_asset/img_3.png",
        title = "6.3\" Смартфон Apple iPhone 17 Pro 256 ГБ серебристый",
        rating = Rating(score = 4.5f, reviewCount = "876"),
        reliability = ReliabilityLevel.GOOD,
        isBestseller = false,
        isFavorite = true,
        price = Pricing(
            current = "130 299 ₽",
            old = "156 999 ₽",
            installment = "или 6 542 ₽/мес",
        ),
        isAvailable = true,
        availabilityBlock = listOf(
            AvailabilityBlock("В наличии:", "в 45 магазинах"),
            AvailabilityBlock("Пункты выдачи:", "доступны"),
            AvailabilityBlock("Доставим на дом:", "к 15 апреля"),
        ),
    ),
    ProductItem(
        id = "apple-iphone-17-pro-max-256",
        image = "file:///android_asset/img_4.png",
        title = "6.9\" Смартфон Apple iPhone 17 Pro Max 256 ГБ серебристый",
        rating = Rating(score = 4.5f, reviewCount = "709"),
        reliability = ReliabilityLevel.GOOD,
        isBestseller = false,
        isFavorite = false,
        price = Pricing(
            current = "138 999 ₽",
            old = "162 999 ₽",
            installment = "или 6 792 ₽/мес",
        ),
        isAvailable = true,
        availabilityBlock = listOf(
            AvailabilityBlock("В наличии:", "в 30 магазинах"),
            AvailabilityBlock("Пункты выдачи:", "доступны"),
            AvailabilityBlock("Доставим на дом:", "к 17 апреля"),
        ),
    ),
    ProductItem(
        id = "samsung-galaxy-s25-ultra-256",
        image = "file:///android_asset/img_1.png",
        title = "6.9\" Смартфон Samsung Galaxy S25 Ultra 256 ГБ черный",
        rating = Rating(score = 4.5f, reviewCount = "412"),
        reliability = ReliabilityLevel.AVERAGE,
        isBestseller = true,
        isFavorite = false,
        price = Pricing(
            current = "89 999 ₽",
            old = null,
            installment = "от 4 500 ₽/мес",
        ),
        isAvailable = true,
        availabilityBlock = listOf(
            AvailabilityBlock("В наличии:", "в 150 магазинах"),
            AvailabilityBlock("Пункты выдачи:", "доступны"),
            AvailabilityBlock("Доставим на дом:", "за 2 часа"),
        ),
    ),
    ProductItem(
        id = "google-pixel-9-pro-128",
        image = "file:///android_asset/img_2.png",
        title = "6.3\" Смартфон Google Pixel 9 Pro 128 ГБ бежевый",
        rating = Rating(score = 4.0f, reviewCount = "134"),
        reliability = ReliabilityLevel.POOR,
        isBestseller = false,
        isFavorite = false,
        price = Pricing(
            current = "74 999 ₽",
            old = "84 999 ₽",
            installment = null,
        ),
        isAvailable = false,
        availabilityBlock = listOf(AvailabilityBlock("Нет в наличии", "")),
    ),
)
