package com.bahiense.xpe.openCommerceAPI.service

import com.bahiense.xpe.openCommerceAPI.model.OrderDTO
import com.bahiense.xpe.openCommerceAPI.repository.OrderRepository
import org.springframework.stereotype.Service

@Service
class OrderService(private val orderRepository: OrderRepository) {

    fun listAllOrders() = orderRepository.findAll().map { it.toOrderDTO() }

    fun findOrderByID(id: Long): OrderDTO {
        return orderRepository.findById(id).map { it.toOrderDTO() }.orElseThrow { NoSuchElementException() }
    }

    fun saveOrder(order: OrderDTO) = orderRepository.save(order.toOrderEntity())

    fun deleteOrderByID(id: Long) = orderRepository.deleteById(id)

    fun countOrders() = orderRepository.count()

    fun updateOrder(id: Long, orderDTO: OrderDTO) = orderRepository.findById(id).map {
        orderRepository.save(orderDTO.toOrderEntity()).toOrderDTO()
    }.orElse(null)

    fun findByProductName(name: String) = orderRepository.findByProductNameContainingIgnoreCase(name).map {
        it.toOrderDTO()
    }
}