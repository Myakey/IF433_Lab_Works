package oop_00000106140_DymasiusRendragraha.week10

data class apiResponse<T>(
    val status: String,
    val data: T
)