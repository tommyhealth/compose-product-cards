package com.tommyhealth.composecards.presentation

import com.tommyhealth.composecards.R
import com.tommyhealth.composecards.ui.theme.Average
import com.tommyhealth.composecards.ui.theme.Complements
import com.tommyhealth.composecards.ui.theme.Excellent
import com.tommyhealth.composecards.ui.theme.Good
import com.tommyhealth.composecards.ui.theme.Installment
import com.tommyhealth.composecards.ui.theme.Poor
import kotlinx.collections.immutable.persistentListOf

val products: List<ProductUi> = listOf(
    ProductUi(
        id = "xiaomi-redmi-note-14-128",
        imageUrl = "file:///android_asset/img_5.png",
        title = "6.67\" Смартфон Xiaomi Redmi Note 14 128 ГБ черный",
        rating = RatingUi(score = 4.5f, reviewCount = "3,4к"),
        reliability = ReliabilityUi(
            title = "Отличная надёжность",
            iconRes = R.drawable.ic_check,
            iconTint = Excellent,
        ),
        badges = persistentListOf(
            BadgeUi(title = "Рассрочка 0-0-12", color = Installment),
        ),
        isFavorite = false,
        isCompared = false,
        price = PriceUi(
            price = "12 799 ₽",
            oldPrice = null,
            installment = "от 1 246 ₽/мес",
        ),
        availabilityBlocks = persistentListOf(
            AvailabilityBlockUi("В наличии:", "в 273 магазинах"),
            AvailabilityBlockUi("Пункты выдачи:", "доступны"),
            AvailabilityBlockUi("Доставим на дом:", "за 2 часа"),
        ),
        isAvailable = true,
    ),
    ProductUi(
        id = "xiaomi-redmi-note-14-256",
        imageUrl = "file:///android_asset/img_5.png",
        title = "6.67\" Смартфон Xiaomi Redmi Note 14 256 ГБ черный",
        rating = RatingUi(score = 4.5f, reviewCount = "3200"),
        reliability = ReliabilityUi(
            title = "Отличная надёжность",
            iconRes = R.drawable.ic_check,
            iconTint = Excellent,
        ),
        badges = persistentListOf(
            BadgeUi(title = "Хит продаж", color = Excellent),
            BadgeUi(title = "Выгодные комплекты", color = Complements),
        ),
        isFavorite = false,
        isCompared = false,
        price = PriceUi(
            price = "17 199 ₽",
            oldPrice = null,
            installment = "от 1 677 ₽/мес",
        ),
        availabilityBlocks = persistentListOf(
            AvailabilityBlockUi("В наличии:", "в 282 магазинах"),
            AvailabilityBlockUi("Пункты выдачи:", "доступны"),
            AvailabilityBlockUi("Доставим на дом:", "за 2 часа"),
        ),
        isAvailable = true,
    ),
    ProductUi(
        id = "apple-iphone-17-pro-256",
        imageUrl = "file:///android_asset/img_3.png",
        title = "6.3\" Смартфон Apple iPhone 17 Pro 256 ГБ серебристый",
        rating = RatingUi(score = 4.5f, reviewCount = "876"),
        reliability = ReliabilityUi(
            title = "Хорошая надёжность",
            iconRes = R.drawable.ic_check,
            iconTint = Good,
        ),
        badges = persistentListOf(),
        isFavorite = true,
        isCompared = false,
        price = PriceUi(
            price = "130 299 ₽",
            oldPrice = "156 999 ₽",
            installment = "или 6 542 ₽/мес",
        ),
        availabilityBlocks = persistentListOf(
            AvailabilityBlockUi("В наличии:", "в 45 магазинах"),
            AvailabilityBlockUi("Пункты выдачи:", "доступны"),
            AvailabilityBlockUi("Доставим на дом:", "к 15 апреля"),
        ),
        isAvailable = true,
    ),
    ProductUi(
        id = "apple-iphone-17-pro-max-256",
        imageUrl = "file:///android_asset/img_4.png",
        title = "6.9\" Смартфон Apple iPhone 17 Pro Max 256 ГБ серебристый",
        rating = RatingUi(score = 4.5f, reviewCount = "709"),
        reliability = ReliabilityUi(
            title = "Хорошая надёжность",
            iconRes = R.drawable.ic_check,
            iconTint = Good,
        ),
        badges = persistentListOf(
            BadgeUi(title = "Выгода 3 000 ₽", color = Installment),
            BadgeUi(title = "Выгодные комплекты", color = Complements),
        ),
        isFavorite = false,
        isCompared = false,
        price = PriceUi(
            price = "138 999 ₽",
            oldPrice = "162 999 ₽",
            installment = "или 6 792 ₽/мес",
        ),
        availabilityBlocks = persistentListOf(
            AvailabilityBlockUi("В наличии:", "в 30 магазинах"),
            AvailabilityBlockUi("Пункты выдачи:", "доступны"),
            AvailabilityBlockUi("Доставим на дом:", "к 17 апреля"),
        ),
        isAvailable = true,
    ),
    ProductUi(
        id = "samsung-galaxy-s25-ultra-256",
        imageUrl = "file:///android_asset/img_1.png",
        title = "6.9\" Смартфон Samsung Galaxy S25 Ultra 256 ГБ черный",
        rating = RatingUi(score = 4.5f, reviewCount = "412"),
        reliability = ReliabilityUi(
            title = "Средняя надёжность",
            iconRes = R.drawable.ic_check,
            iconTint = Average,
        ),
        badges = persistentListOf(
            BadgeUi(title = "Хит продаж", color = Excellent),
            BadgeUi(title = "Рассрочка 0-0-12", color = Installment),
        ),
        isFavorite = false,
        isCompared = false,
        price = PriceUi(
            price = "89 999 ₽",
            oldPrice = null,
            installment = "от 4 500 ₽/мес",
        ),
        availabilityBlocks = persistentListOf(
            AvailabilityBlockUi("В наличии:", "в 150 магазинах"),
            AvailabilityBlockUi("Пункты выдачи:", "доступны"),
            AvailabilityBlockUi("Доставим на дом:", "за 2 часа"),
        ),
        isAvailable = true,
    ),
    ProductUi(
        id = "google-pixel-9-pro-128",
        imageUrl = "file:///android_asset/img_2.png",
        title = "6.3\" Смартфон Google Pixel 9 Pro 128 ГБ бежевый",
        rating = RatingUi(score = 4.0f, reviewCount = "134"),
        reliability = ReliabilityUi(
            title = "Низкая надёжность",
            iconRes = R.drawable.ic_check,
            iconTint = Poor,
        ),
        badges = persistentListOf(),
        isFavorite = false,
        isCompared = false,
        price = PriceUi(
            price = "74 999 ₽",
            oldPrice = "84 999 ₽",
            installment = null,
        ),
        availabilityBlocks = persistentListOf(
            AvailabilityBlockUi("Нет в наличии", ""),
        ),
        isAvailable = false,
    ),
)