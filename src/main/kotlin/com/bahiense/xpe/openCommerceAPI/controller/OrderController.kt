package com.bahiense.xpe.openCommerceAPI.controller

import com.bahiense.xpe.openCommerceAPI.model.OrderDTO
import com.bahiense.xpe.openCommerceAPI.service.OrderService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/orders")
class OrderController(private val orderService: OrderService) {

    @PostMapping
    fun createOrder(@RequestBody orderDTO: OrderDTO): ResponseEntity<OrderDTO> {
        orderService.saveOrder(orderDTO)
        return ResponseEntity.ok(orderDTO)
    }

    @GetMapping
    fun listAllOrders(): List<OrderDTO> {
        return orderService.listAllOrders()
    }

    @GetMapping("/{id}")
    fun findOrderById(@PathVariable id: Long): ResponseEntity<OrderDTO> {
        return ResponseEntity.ok(
            orderService.findOrderByID(id)
        )
    }

    @DeleteMapping("/{id}")
    fun deleteOrderById(@PathVariable id: Long) {
        orderService.deleteOrderByID(id)
    }

    @GetMapping("/count")
    fun countOrders(): Long {
        return orderService.countOrders()
    }
}