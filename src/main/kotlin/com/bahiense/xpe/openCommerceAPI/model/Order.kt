package com.bahiense.xpe.openCommerceAPI.model

import jakarta.persistence.*
import jakarta.persistence.GenerationType.IDENTITY

@Entity
@Table(name = "orders")
data class Order(
    @Id
    @GeneratedValue(strategy = IDENTITY)
    val id: Long? = null,
    val clientId: Long,
    val productName: String,
    val quantity: Int,
    val totalPrice: Double,
    @Enumerated(EnumType.STRING)
    val status: OrderStatus
) {
    fun toOrderDTO() = OrderDTO(
        id = this.id,
        clientId = this.clientId,
        productName = this.productName,
        quantity = this.quantity,
        totalPrice = this.totalPrice,
        status = this.status
    )
}

enum class OrderStatus {
    PENDING,
    DELIVERED,
    SENT,
    CANCELED
}