package oop_00000106140_DymasiusRendragraha.week10

data class ApiResponse<T>(
    val status: String,
    val data: T
)