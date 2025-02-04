package com.bahiense.xpe.openCommerceAPI.model

data class OrderDTO(
    val id: Long? = null,
    val clientId: Long,
    val productName: String,
    val quantity: Int,
    val totalPrice: Double,
    val status: OrderStatus
) {
    fun toOrderEntity() = Order(
        clientId = this.clientId,
        productName = this.productName,
        quantity = this.quantity,
        totalPrice = this.totalPrice,
        status = this.status
    )
}