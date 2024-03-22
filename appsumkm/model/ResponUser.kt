package co.id.appsumkm.model

import com.google.gson.annotations.SerializedName

data class ResponseUser(

    @field: SerializedName("page")
    val page: Int? = null,

    @field: SerializedName("per_page")
    val perPage: Int? = null,

    @field: SerializedName("total")
    val total: Int? = null,

    @field: SerializedName("total_page")
    val totalPage: Int? = null,

    @field: SerializedName("data")
    val data: List<DataItem>? = null
)
